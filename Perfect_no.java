import java.util.*;
public class Perfect_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;

        System.out.println("Enter the no: ");

        int n =sc.nextInt();


        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }

   
        if(sum==n){
            System.out.println("Perfect");
        }else{
            System.out.println("NOT Perfect");
        }

    }
    
}
