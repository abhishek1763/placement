package sap_Labs;

public class MaxUniqueExponent {

    public static void main(String[] args) {
        String input = "abbccccc";
        int count = 1;
        String join = "";
        for (int i = 0; i < input.length() ; i++) {
            if (i != input.length() - 1){
                if (input.charAt(i) == input.charAt(i+1)){
                    count++;
                }
                else {
                    if (count > 1){
                        join = join + input.charAt(i) + String.valueOf(count);
//                    System.out.println(join);
                    }
                    else {
                        join = input.charAt(i) + "";
//                    System.out.println(join);
                    }
                    count = 1;
                }
            }
            else {
                if (count > 1){
                    join = join + input.charAt(i) + String.valueOf(count);
//                    System.out.println(join);
                }
                else {
                    join = input.charAt(i) + "";
//                    System.out.println(join);
                }
                count = 1;
            }
        }
        System.out.println(join);
    }
}
