import java.util.*;

public class Duplicate_Elements {
    public static void main(String[] args) {

        int [] array = {1,2,2,5,5,5,3,4,8,9,8};
        int [] original = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(original));
        Arrays.sort(original);
        System.out.println(Arrays.toString(original));
        
    }
}
