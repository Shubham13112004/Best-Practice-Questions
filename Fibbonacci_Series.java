import java.util.*;
public class Fibbonacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter the No ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0;
        int b=1;

       
        for(int i=0;i<n;i++){
            int c =a+b;
            System.out.println(b);
            a=b;
            b=c;
        }
    }
}
