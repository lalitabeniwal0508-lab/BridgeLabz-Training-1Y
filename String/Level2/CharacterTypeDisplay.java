package com.gla.String.Level2;
import java.util.Scanner;
public class CharacterTypeDisplay {
    public static String checkChar(char ch) {
        if (Character.isUpperCase(ch))
            ch = Character.toLowerCase(ch);

        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

        public static String[][] analyze(String text) {
            String[][] result = new String[text.length()][2];

            for (int i = 0; i < text.length(); i++) {
                result[i][0] = String.valueOf(text.charAt(i));
                result[i][1] = checkChar(text.charAt(i));
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String input = sc.nextLine();

            String[][] result = analyze(input);

            System.out.println("Char\tType");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i][0] + "\t" + result[i][1]);
            }
        }

}
