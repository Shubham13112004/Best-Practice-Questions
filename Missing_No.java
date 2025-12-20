import java.util.*;
public class Missing_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");

        int n=sc.nextInt();
        int[] array = new int[n];

        for(int i=1;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        int ans = (n*(n+1))/2;

        int sum=0;

         for(int i=1;i<array.length;i++){
            sum+=array[i];
        }

        System.out.println(ans-sum);


    }
    
}
