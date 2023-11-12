package binary_search;

public class celling {
    public static void main(String[] args) {
        int [] students = {2,4,7,9,11,14,16,19,23};
        System.out.println(binarySearch(students, 25));
    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
//        if (target > arr[end]){
//            return -1;
//        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else return mid;
        }
        return arr[start % arr.length];
    }
}
