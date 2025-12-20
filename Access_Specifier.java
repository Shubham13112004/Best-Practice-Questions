 public class Access_Specifier {

   private int a =10;

    int b =11;

    protected int c = 12;

    public int d = 13;

    void show(){
        System.out.println("Private : "+a);
        System.out.println("Default : "+b);
        System.out.println("Protected: "+c);
        System.out.println("Public: "+d);
    }



    public static void main(String[] args) {

        Access_Specifier obj = new Access_Specifier();

        obj.show();

    
        
    }
}
