import java.util.*;
public class Anagram_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


      String s1= str1.replaceAll("\\s","").toLowerCase();
       String s2=  str2.replaceAll("\\s","").toLowerCase();



        char [] a1 =s1.toCharArray();
        char [] a2 =s2.toCharArray();


      Arrays.sort(a1);
      Arrays.sort(a2);

       System.out.println(a1);
        System.out.println(a2);
        

        if(a1.length!=a2.length){
             System.out.println("The strings are not anagrams (different lengths).");
        }else{
             boolean isAnagram = Arrays.equals(a1, a2);

             if (isAnagram) {
                System.out.println("The strings ARE anagrams.");
            } else {
                System.out.println("The strings are NOT anagrams.");
            }
        }
    }
    
}
