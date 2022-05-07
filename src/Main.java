import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a word of max length 10^3, capitalize the first letter.
         */

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        char first = input.charAt(0);
        if(isLowercase(first))
            input = (char)(first - 32) + input.substring(1);
        System.out.println(input);


    }

    public static boolean isLowercase(char c){

        return c >= 97 && c <= 122;

    }

}