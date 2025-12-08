import java.util.*;
public class SortArray_BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you Size of  Array ");
        int n = sc.nextInt();

        int [] array = new int [n];

        System.out.println("Enter you Unsorted of  Array");
        for(int i = 0 ;i<n;i++){

            array[i]=sc.nextInt();

        }
        System.out.println("your Unsorted Array "+ Arrays.toString(array));


        for(int i=0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }


 System.out.println("your Sorted Array "+ Arrays.toString(array));
    }


    
}
