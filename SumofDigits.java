public class SumofDigits {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
