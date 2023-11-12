package practice;
import java.util.Scanner;
public class infosis_1 {
        private static final int MOD = 10000;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the maximum possible value (N): ");
            int n = scanner.nextInt();

            System.out.print("Enter the length of arrays (K): ");
            int k = scanner.nextInt();

            int result = countArrays(n, k);
            System.out.println("Number of different arrays: " + result);
        }

        private static int countArrays(int n, int k) {
            // Initialize the memoization table to store previously computed values
            int[][] memo = new int[n + 1][k + 1];
            for (int i = 1; i <= n; i++) {
                memo[i][1] = 1;
            }

            // Calculate the number of different arrays
            for (int len = 2; len <= k; len++) {
                for (int i = 1; i <= n; i++) {
                    for (int j = i; j <= n; j += i) {
                        memo[j][len] = (memo[j][len] + memo[i][len - 1]) % MOD;
                    }
                }
            }

            // Sum up the results from the last row (arrays of length K)
            int totalArrays = 0;
            for (int i = 1; i <= n; i++) {
                totalArrays = (totalArrays + memo[i][k]) % MOD;
            }

            return totalArrays;
        }
}
