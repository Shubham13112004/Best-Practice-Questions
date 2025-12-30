public class FactorialSum {

    public static int sum(int n){
        int SSum=n;

        if(n==1){
            return 1;
        }

        int ans= SSum + sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
 