import java.util.*;

public class Leet_Two_Sum {


    public static void main(String[] args) {
        int [] nums = {15,2,3,5,7};
        int target =9;

        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
             int complement = target-nums[i];

             if(map.containsKey(complement)){
                System.out.println(map.get(complement)+" "+i);
                return;
             }

             map.put(nums[i],i);
        }
       
    }
}
