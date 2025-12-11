public class MaxMin_Array {
    public static void main(String[] args) {
        int [] arr = {4,3,8,1,5};
        int max =arr[0];
        int min =arr[0];
        for(int i =0;i<=arr.length-1;i++){

            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(" Minimum is "+min+" Maximum is "+max);
    }
}
