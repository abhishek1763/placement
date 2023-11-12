package practice;

public class final_var {
    public static void main(String[] args) {
                int[] arr = {1, 2, 4, 1, 6}; // Change this to the input array
                int operations = findMinOperations(arr);
                System.out.println("Minimum operations: " + operations);
            }

            public static int findMinOperations(int[] arr) {
                int operations = 0;

                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] <= arr[i - 1]) {
                        int diff = arr[i - 1] - arr[i] + 1;
                        arr[i] += diff;
                        operations += diff;
                    }
                }

                return operations;
            }
        }
