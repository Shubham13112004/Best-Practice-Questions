import java.util.*;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
         ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);

        list.addAll(list1);
        System.out.println(list);

    
    }
}
