import java.awt.*;
import java.awt.event.*;

class MenuExample extends Frame implements ActionListener {

    MenuItem newItem, openItem, exitItem;
    Label msg;

    MenuExample(){

      
        MenuBar mb = new MenuBar();

        Menu fileMenu = new Menu("File");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");

      
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

    
        mb.add(fileMenu);

       
        setMenuBar(mb);

        
        msg = new Label("Select a menu option");
        msg.setBounds(100, 120, 200, 30);
        add(msg);

     
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);

       
        setTitle("AWT Menu Example");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newItem) {
            System.out.println("New menu clicked");
        } else if (ae.getSource() == openItem) {
           System.out.println("Open menu clicked");
        } else if (ae.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new MenuExample();
    }
}
