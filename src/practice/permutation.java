package practice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class permutation {

    public static void main(String[] args) {
        String s = "abc";
        List<String> permutations = new ArrayList<>();
        permu(s, 0, s.length() - 1, permutations);

        System.out.println(permutations);
    }

    public static void permu(String s, int l, int r, List<String> result) {
        if (l == r) {
            result.add(s);
            return;
        }

        for (int i = l; i <= r; i++) {
            s = swap(s, l, i); // Swap characters
            permu(s, l + 1, r, result);
            s = swap(s, l, i); // Swap back to the original state
        }
    }

    private static String swap(String s, int l, int r) {
        char[] arr = s.toCharArray();
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return new String(arr);
    }
}
