package practice;

import java.util.Scanner;

public class accenture {
    public static String checkPassword (String str, int n)
    {
        if (n < 4)
            return "Invalid password";
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            return "Invalid password";
        int num = 0, cap = 0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                return "Invalid password";
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return "valid password";
        else
            return "Invalid password";
    }
    public static void main (String[]args)
    {
//        Scanner sc = new Scanner (System.in);
//        String str = sc.next ();
        String Password = "abA7rz";
        System.out.println (checkPassword (Password, Password.length ()));
    }
}
