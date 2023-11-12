package accenture;

public class stringToint {
    public static void main(String[] args) {
//        int m = 100;
//        int n = 160;
//        int sum = 0;
//        for (int i = m; i <= n; i++)
//            if ((i % 3 == 0) && (i % 5 == 0))
//                sum = sum + i;
//        System.out.println(sum);
//        int i = 0;
//        String str = "1287432";
//        while (i<str.length()) {
//            System.out.println(Integer.parseInt(str.charAt(i) + ""));
//            i++;
//        }
        int num = 323;
        int temp = num;
        String reverse = "";
        while (num != 0){
            int rem = num % 10;
            reverse = reverse + String.valueOf(rem);
            num = num/10;
        }
        System.out.println(reverse);
        String no = temp + "";
        if (reverse.equals(no)){
            System.out.println("yay! palindrome no. " + temp);
        }
    }
}
