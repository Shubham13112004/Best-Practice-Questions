import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleAWT_Program extends Frame implements ActionListener {

    TextArea textArea;
    Label statusBar;

    MenuItem newFile, openFile, saveFile, exitApp;
    MenuItem increaseFont, normalFont;

    File currentFile = null;

    public SimpleAWT_Program() {

        // Frame settings
        setTitle("Simple AWT Text Editor");
        setSize(600, 500);
        setLayout(new BorderLayout());

        // Text Area
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        // Status Bar
        statusBar = new Label("Ready");
        statusBar.setBackground(Color.LIGHT_GRAY);
        add(statusBar, BorderLayout.SOUTH);

        // Menu Bar
        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        newFile = new MenuItem("New");
        openFile = new MenuItem("Open");
        saveFile = new MenuItem("Save");
        exitApp = new MenuItem("Exit");

        // Keyboard shortcuts
        newFile.setShortcut(new MenuShortcut(KeyEvent.VK_N));
        openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O));
        saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S));
        exitApp.setShortcut(new MenuShortcut(KeyEvent.VK_Q));

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exitApp);

        // Edit Menu
        Menu editMenu = new Menu("Edit");
        editMenu.add(new MenuItem("Cut"));
        editMenu.add(new MenuItem("Copy"));
        editMenu.add(new MenuItem("Paste"));

        // View Menu
        Menu viewMenu = new Menu("View");
        increaseFont = new MenuItem("Increase Font Size");
        normalFont = new MenuItem("Normal Font Size");

        viewMenu.add(increaseFont);
        viewMenu.add(normalFont);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        setMenuBar(menuBar);

        // Add action listeners
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exitApp.addActionListener(this);
        increaseFont.addActionListener(this);
        normalFont.addActionListener(this);

        // Window close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle menu actions
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newFile) {
            textArea.setText("");
            currentFile = null;
            statusBar.setText("New file created");
        }

        else if (e.getSource() == openFile) {
            FileDialog fd = new FileDialog(this, "Open File", FileDialog.LOAD);
            fd.setVisible(true);

            if (fd.getFile() != null) {
                currentFile = new File(fd.getDirectory(), fd.getFile());
                openFile(currentFile);
            }
        }

        else if (e.getSource() == saveFile) {
            if (currentFile == null) {
                FileDialog fd = new FileDialog(this, "Save File", FileDialog.SAVE);
                fd.setVisible(true);

                if (fd.getFile() != null) {
                    currentFile = new File(fd.getDirectory(), fd.getFile());
                }
            }
            if (currentFile != null) {
                saveFile(currentFile);
            }
        }

        else if (e.getSource() == exitApp) {
            dispose();
        }

        else if (e.getSource() == increaseFont) {
            textArea.setFont(new Font("Arial", Font.PLAIN, 18));
            statusBar.setText("Font size increased");
        }

        else if (e.getSource() == normalFont) {
            textArea.setFont(new Font("Arial", Font.PLAIN, 12));
            statusBar.setText("Font size set to normal");
        }
    }

    // File open method
    private void openFile(File file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            textArea.setText("");
            String line;
            while ((line = br.readLine()) != null) {
                textArea.append(line + "\n");
            }
            br.close();
            statusBar.setText("Opened: " + file.getName());
        } catch (IOException ex) {
            statusBar.setText("Error opening file");
        }
    }

    // File save method
    private void saveFile(File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(textArea.getText());
            bw.close();
            statusBar.setText("Saved: " + file.getName());
        } catch (IOException ex) {
            statusBar.setText("Error saving file");
        }
    }

    public static void main(String[] args) {
        new SimpleAWT_Program();
    }
}
