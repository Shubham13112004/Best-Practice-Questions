import java.util.*;
public class Greater_String {
    public static void main(String[] args) {
        String[] array = {"apple","mango","banana","zonfa"};

        String max = array[0];

        for(int i=1;i<array.length;i++){

            if(max.compareTo(array[i])<0){

                max=array[i];

            }

        }

        System.out.println(max);
    }
}


