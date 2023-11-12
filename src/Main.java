import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Converting String into Array through split() method
        String sentence = "Abhishek";
        String[] wordsArray = sentence.split(""); // Split by space
        System.out.println(Arrays.toString(wordsArray));
        Arrays.sort(wordsArray);
        System.out.println(Arrays.toString(wordsArray));

        // Converting String into Array through toCharArray() method
        String Example = "mine";
        char [] words = Example.toCharArray();
        System.out.println(words);
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}