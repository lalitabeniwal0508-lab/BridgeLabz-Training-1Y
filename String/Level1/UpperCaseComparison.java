package com.gla.String.Level1;
import java.util.Scanner;
public class UpperCaseComparison {

        public static String convertToUpper(String text) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                }
                result.append(ch);
            }
            return result.toString();
        }

        public static boolean compareStrings(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter text: ");
            String input = sc.nextLine();

            String userDefinedUpper = convertToUpper(input);

            String builtInUpper = input.toUpperCase();

            boolean areEqual = compareStrings(userDefinedUpper, builtInUpper);

            System.out.println("\nUser-defined uppercase: " + userDefinedUpper);
            System.out.println("Built-in uppercase:     " + builtInUpper);
            System.out.println("Comparison result: " + areEqual);
        }

}
