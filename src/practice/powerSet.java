package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class powerSet {
    public static void main(String[] args) {
        ArrayList<String> subsets = new ArrayList<>();
        powerset("abc", 0, "", subsets);
        System.out.println(subsets);
    }

    public static void powerset(String s, int i, String res, ArrayList<String> subsets) {
        if (i == s.length()) {
            subsets.add(res);
            return;
        }
        powerset(s, i + 1, res + s.charAt(i), subsets);
        powerset(s, i + 1, res, subsets);
    }
}
