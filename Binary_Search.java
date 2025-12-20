import java.util.*;

public class Binary_Search {



    public static int Binary(int[] arr,int key){

         Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;
       
        

        while(left<=right){

             int mid = left+(right-left)/2;

             if(arr[mid]==key){
            return arr[mid];
        }
        else if (key>arr[mid]){
            left=mid+1;
        }
        else{
            right=mid-1;
        }


        }
       
        return -1;

    }

    public static void main(String[] args) {
        int[] array ={33,22,66,55,11};
        int key=55;
        int result = Binary(array,key);
        System.out.println(result); 

    }
    
}
