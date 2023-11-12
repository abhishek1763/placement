package binary_search;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int [] array = {10,8,7,6,5,4,3,2,1,0};
        System.out.println(AgnosticBS(array, 7, 0, array.length - 1));
    }
    static int AgnosticBS(int [] arr, int target, int start, int end){
        boolean isAsd = arr[start] < arr[end];

        while (start < end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (isAsd){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                if (target > arr[mid]){
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
