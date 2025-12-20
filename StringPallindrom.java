import java.util.*;

public class StringPallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        System.out.println();
        String str = sc.next();
        int n = str.length();

        boolean flag = true;  

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = false;
                break;
            }
        }

        if (flag) {  
            System.out.println(str + " Is a Palindrome");
        } else {
            System.out.println(str + " Is NOT a Palindrome");
        }
    }
}
