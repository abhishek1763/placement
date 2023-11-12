package practice;

public class palindromeString {
    public static void main(String[] args) {
        String word = "";
        System.out.println(palindrome(word, 0, word.length()-1));
    }
    public static boolean palindrome(String s, int l, int r){
        if (l >= r) return true;

        if (s.charAt(l) != s.charAt(r)) return false;
        return palindrome(s, l+1, r-1);
    }
}
