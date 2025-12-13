import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value");
        int n = sc.nextInt();

        int sum=0;
        while(n!=0){
            int temp =n%10;
            sum+=temp;
            n/=10;

        }

        System.out.println(sum);

    }
}
