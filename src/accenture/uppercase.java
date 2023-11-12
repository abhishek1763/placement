package accenture;
import java.lang.*;
import java.util.Arrays;
import java.util.Locale;

public class uppercase {
    public static void main(String[] args) {
        String s = "takeMeToThePond";
        String str;
//        System.out.println(s.charAt(0));
        char []arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Character.isLowerCase(i));
            if (Character.isLowerCase(arr[i])){
                ;
                System.out.print("" + Character.toUpperCase(arr[i]));
            }
            else {
                System.out.println();
                System.out.print("" + Character.toLowerCase(arr[i]));
            }

        }

//        System.out.println(arr);
    }
}
