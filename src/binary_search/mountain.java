package binary_search;

public class mountain {
    public static void main(String[] args) {
        int [] student = {0,1, 0};
        System.out.println(mount(student));
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
        return start;
    }
}
