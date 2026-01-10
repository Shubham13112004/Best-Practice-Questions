import java.util.*;
public class Maximum_SubArrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] nums = new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        int maxSum=nums[0];
        int currentSum=nums[0];

        for(int i=1;i<nums.length;i++){
          currentSum = Math.max(currentSum+nums[i],nums[i]);
          maxSum=Math.max(maxSum,currentSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}
