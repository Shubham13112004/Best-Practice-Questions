import java.util.*;
public class Duplicates {
    public static void main(String[] args) {

        int [] nums = {1,5,2,1,6};

         Set<Integer> Seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int num : nums){
            if(! Seen.add(num)){

                duplicate.add(num);
                
            }

         

        }
           System.out.println(Seen);
           System.out.println(duplicate);
        
    }
}
