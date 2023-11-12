package binary_search;

//https://leetcode.com/problems/find-in-mountain-array/

public class find_in_mountain {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,3,1};
        int peak = mount(array);
        int count = 0;
        if (AgnosticBS(array, 3, 0, peak) != -1){
            count++;
        }
        if (AgnosticBS(array, 3, peak, array.length - 1) != -1){
            count++;
        }
//        System.out.println(AgnosticBS(array, 3, 0, peak));
//        System.out.println(AgnosticBS(array, 3, peak, array.length - 1));
        System.out.println(count);
    }
    static int mount(int [] arr){
        int start = 0;
        int end = arr.length - 1;
//        int mid = start + (end - start)/2;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else start = mid + 1;
        }
        return  start;
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
