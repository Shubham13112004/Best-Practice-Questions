import java.util.Arrays;

public class Two_Sum_Pair {
    public static void main(String[] args) {
        int [] nums = {2,4,3,5,1,3,5,2};

        Arrays.sort(nums);

        int count =0;
        int target = 6;
            
        int left=0;
        int right=nums.length-1;

        while(left<right){
            if(nums[left]+nums[right]==target){
                count++;
                System.out.println(nums[left]+ " "+ nums[right]);
            }
            if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }

        }


    }
}
