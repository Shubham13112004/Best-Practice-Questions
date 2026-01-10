import java.util.*;
public class WaterContainer {

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};

        int right = height.length-1;
        int left = 0;
        int maxWater=0;

        while(left<right){

            int width = right-left;
            int ht = Math.min(height[left],height[right]);

            int currentHeight=width*ht;

            maxWater = Math.max(currentHeight,maxWater);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }


        System.out.println(maxWater);
    }
    
}
