package accenture;
import java.util.ArrayList;
import java.util.Scanner;
public class number_inString {
    public static String dectoNBase(int n, int num) {
        String res = "";
        int quotient = num / n;
        ArrayList<Integer> rem = new ArrayList<Integer>();
        rem.add(num % n);
        while (quotient != 0) {
            rem.add(quotient % n);
            quotient = quotient / n;
        }
        String str = "A";
//        System.out.println();
        for (int i = 0; i < rem.size(); i++) {
            if (rem.get(i) > 9) {
                res = (char)(rem.get(i) - 10 + (int)(str.charAt(0))) + res;
            } else
                res = rem.get(i) + res;
        }
        return res;
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num = sc.nextInt();
            System.out.println(dectoNBase(n, num));
        }
    }
}
