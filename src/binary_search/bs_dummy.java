package binary_search;

public class bs_dummy {
    public static void main(String[] args) {
        int [] students = {2,4,7,9,11,14,16,19,23};
        System.out.println(binarySearch(students, 11, 0, students.length));
    }
    static int binarySearch(int [] arr, int target, int start, int end){
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
        return -1;
    }
}
