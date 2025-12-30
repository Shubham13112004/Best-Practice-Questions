import java.util.*;
public class Duplicate_2 {
    public static void main(String[] args) {
        int k=3;
        int [] array ={4,2,6,2,1,7,2};

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<array.length;i++){
         


            if(set.contains(array[i])){
                System.out.println("True");
                return;
            }

               set.add(array[i]);

               
            if(i>=k){
                set.remove(array[i-k]);
            }

        }
        System.out.println("False");

    }
}
