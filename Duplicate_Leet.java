import java.util.*;;

public class Duplicate_Leet {
    public static void main(String[] args) {
      /*   int [] nums={1,2,5,3,4,3};
        Set<Integer> set = new HashSet<>();
   
        for(int i =0;i<nums.length;i++){
         
           if(!set.add(nums[i]) ){
            System.out.println("Duplicate is "+ nums[i]);
            return;
           }
        }
        System.out.println("Not Found");

 */
         int [] nums={1,2,5,3,4,3};

         for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-1;j++){
                if(nums[i]==nums[j]){
                    System.out.println("True");
                    return;
                }
            }
         }
         System.out.println("False");

        
    }
}
