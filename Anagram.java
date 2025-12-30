public class Anagram {
    public static void main(String[] args) {
        String str1 = "sam";
        String str2 = "mxa";


        if(str1.length()!=str2.length()){
            System.out.println("NOT Anagram");
            return;
        }

        int [] MainStore = new int[26];
        
        for(int i=0;i<str1.length();i++){

            MainStore[str1.charAt(i)-'a']++;
            MainStore[str2.charAt(i)-'a']--;

        }

        for(int count : MainStore){
            if(count!=0){
                System.out.println("NOT anagram");
                return;
            }
        }

        System.out.println("It Is Anagram");
       
    }
}
