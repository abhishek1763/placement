package TCS;

import java.util.Scanner;

public class asciToAlpha {
    public static void main(String[] args) {

//        String asci = "abhi";
//        String reverse = "";
//        for (int i = asci.length()-1; i >= 0; i--) {
//            reverse = reverse + asci.charAt(i);
//        }
//        System.out.println(reverse);
//        int value = 1234;
//        String change = "" + String.valueOf(value);
//        System.out.println(change + 5);
//        int number = Integer.parseInt(change);
//        number = number + 4;
//        System.out.println(number);

                Scanner sc = new Scanner(System.in);
                String str = sc.next();

                char arr[] = str.toCharArray();
                String current = "";
                String result = "";

        for (int i = arr.length - 1; i > 0 ; i= i-2) {
            current = "";
            current = current + arr[i] + arr[i-1];
            int n = Integer.parseInt(current);
            if (n == 32)
                result = " ";
            else if ((n >= 65 && n <= 90) || (n >= 97 && n <= 99))
                result += (char) n;
            else {
                if (i-2 < 0)
                    break;
                current += arr[i-2];
                n = Integer.parseInt(current);
                result += (char)n;
                i--;
            }
        }
                System.out.println(result);
            }
}
