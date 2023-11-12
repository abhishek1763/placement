package binary_search;

public class infinite_binarySearch {
    public static void main(String[] args) {
        int [] num = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.println(find(num, 31));
    }
    static int find(int [] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            start = end + 1;
            end = end + 2 * end;
            if (end > arr.length){
                end = arr.length-1;
            }
        }
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
            System.out.printf("target not found");
            return -1;
    }
}
