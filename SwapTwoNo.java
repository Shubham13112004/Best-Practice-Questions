import java.util.*;
public class SwapTwoNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swapping is "+a+" "+b);

        /*a=a^b;
        b=a^b;
        a=a^b;

       
        a=a+b;
        b=a-b;
        a=a-b;
          */
        int temp = a;
        a=b;
        b=temp;
       

         System.out.println("After Swapping is "+a+" "+b);

    }
    
}
