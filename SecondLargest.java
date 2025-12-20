import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] A = new int[5];

        for(int i =0;i<5;i++){
            A[i] = sc.nextInt();
        }


        int max1=A[0];
        int max2=A[0];

        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }


        System.out.print(max1+"  ");
        System.out.println(max2);
    }
}
