package practice;

public class TravelInMatrix {
    public static void main(String[] args) {
        System.out.println(noOfWays(3,3));
    }
    public static int noOfWays(int n, int m){
        if (n ==1 || m ==1) {
            return 1;
        }
        return noOfWays(n-1, m) + noOfWays(n, m-1);
    }
}
