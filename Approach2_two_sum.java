import java.util.*;
public class Approach2_two_sum{

    public static void main(String[] args) {
        int [] nums = {15,2,3,5,7};
        int target=9;
        int left =0;
        int right = nums.length-1;

          Arrays.sort(nums);

        while(left<right){
            int sum = nums[left]+nums[right];

            if(sum==target){
                System.out.println(nums[left]+"  "+nums[right]);
                return;
            }

            else if(sum>target){
               right--;
            }else{
              
                   left++;
            }

        }

    }

}