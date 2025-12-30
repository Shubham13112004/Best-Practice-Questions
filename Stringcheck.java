import java.util.*;
public class Stringcheck {
    public static void main (String [] args){

        String str1 = "sam";
        String str2 = "mas";

        if(str1.length()!=str2.length()){
            System.out.println("False");
        }

    
        
        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();

           

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(a);
         System.out.println(b);

         if(Arrays.equals(a,b)){
            System.out.println("True");
            return;
         }else{
            System.out.println("False");
         }

        

    

            

        }



    }

