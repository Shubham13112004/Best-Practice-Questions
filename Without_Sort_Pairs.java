import java.util.HashSet;

public class Without_Sort_Pairs {
    public static void main(String[] args) {

        int[] nums = {2,4,3,5,1,3,5,2};
        int target = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (set.contains(need)) {
                System.out.println("Pair: " + nums[i] + " " + need);
            }

            set.add(nums[i]);
        }
    }
}
