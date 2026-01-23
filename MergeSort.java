import java.util.Arrays;

public class MergeSort {


    public static void merge(int[] arr,int si,int mid,int ei){

        int [] temp = new int[ei-si+1];
        int l = si;
        int r=mid+1;
        int k=0;

        while(l<=mid && r<=ei){
            if(arr[l]<arr[r]){
                temp[k++]=arr[l++];
            }else{
                temp[k++]=arr[r++];
            }
        }

        while(l<=mid){
            temp[k++]=arr[l++];
        }

        while(r<=ei){
            temp[k++]=arr[r++];
        }


        for(k=0,l=si;k<temp.length;k++,l++){
            arr[l]=temp[k];
        }

    }


    public static void mergeSort(int[] arr ,int si,int ei){

            if(si>=ei){
                return;
            }

        int mid =  si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr,mid+1, ei);

        merge(arr,si,mid,ei);


    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,1,8,6};

        mergeSort(arr, 0, arr.length-1);

       System.out.println(Arrays.toString(arr));
    }
}
