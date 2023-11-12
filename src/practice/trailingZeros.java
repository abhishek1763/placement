package practice;

public class trailingZeros {
    public static void main(String[] args) {
        int n = 625;
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res += n/i;
        }
        System.out.println(fact(n));
        System.out.println(res);
    }
    public static long fact(int n){
        if (n == 0 || n ==1) return 1;
        else return n * fact(n-1);
    }
}
