public class SecondHighestElement {
    


    public static void main(String[] args) {
         int [] arr = {5,3,8,12,7,4};

    int max=Integer.MIN_VALUE;
    int Secound_max=Integer.MIN_VALUE;


    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            Secound_max=max;
            max=arr[i];
            
        }else if(arr[i]>Secound_max && arr[i]!=max){
            Secound_max=arr[i];
        }
       
    }

    System.out.println(Secound_max);

    }
   



 } 
