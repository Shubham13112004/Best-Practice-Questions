import java.util.*;
public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value ");
        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
              isPrime=false;
                break;
            }        
        }
            if(isPrime){
                   System.out.println(n+" PRIME");
            }else{
                   System.out.println(n+"NOT PRIME");
            }
                
        }      
    }
    
