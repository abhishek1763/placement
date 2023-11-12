package practice;

public class second_largest_smallest {
        static int Second_largestEven(int [] arr){
        int Sec_largest = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i <= arr.length/2; i++) {
            if (arr[2*i-1] > largest){
                Sec_largest = largest;
                largest = arr[2*i-1];
            }
        }
        return Sec_largest;
    }
    static int Second_smallestOdd(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int SecSmallest = 0;
        for (int i = 1; i <= arr.length / 2 + 1; i++) {
            if (arr[2*i-2] < smallest){
                SecSmallest = smallest;
                smallest = arr[2*i-2];
            }
        }
        return SecSmallest;
    }
        public static void main (String[]args){
            System.out.println(Second_smallestOdd(new int[]{29, 9, 11, 8, 10, 18, 6}));
        }
}
