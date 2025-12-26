public class Power_Two {
    public static void main(String[] args) {
        int n= 32;

        if((n&(n-1))==0){
            System.out.println(n+" Power of 2");
        }else{
              System.out.println(n+" NOT Power of 2");
        }
       
    }
}
