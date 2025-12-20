import java.util.*;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No: ");

        int n=sc.nextInt();

        if((n/2)*2==n){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    
}
