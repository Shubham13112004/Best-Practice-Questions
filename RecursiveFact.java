public class RecursiveFact {
    public static int  fact(int n){
        if (n==1){
            return 1;
        }


        int ans = n*fact(n-1);
        System.out.println(ans);
        return ans ;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
