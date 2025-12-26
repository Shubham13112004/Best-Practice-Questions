import java.util.HashMap;
import java.util.Map;

public class SumTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,3};

        Map<Integer,Integer> map = new HashMap<>();
        int target=9;

        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
         
                int need = target - arr[i];

                if(map.containsValue(need)){
                    System.out.println("Index "+ map.get(need) +"  "+i);
                    System.out.println("Values "+need+ " " +arr[i]);
                }


            }

        }

     
    }

