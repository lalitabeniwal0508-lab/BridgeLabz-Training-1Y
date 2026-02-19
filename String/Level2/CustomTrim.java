package com.gla.String.Level2;
import java.util.Scanner;
public class CustomTrim {
    public static int[] findTrimIndexes(String str) {
            int start = 0, end = str.length() - 1;

            while (str.charAt(start) == ' ') start++;
            while (str.charAt(end) == ' ') end--;

            return new int[]{start, end};
    }

        public static String substring(String str, int start, int end) {
            String result = "";
            for (int i = start; i <= end; i++) {
                result += str.charAt(i);
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text with spaces: ");
            String input = sc.nextLine();

            int[] indexes = findTrimIndexes(input);
            String customTrim = substring(input, indexes[0], indexes[1]);
            String builtInTrim = input.trim();

            System.out.println("Custom Trim: " + customTrim);
            System.out.println("Built-in Trim: " + builtInTrim);
            System.out.println("Are equal? " + customTrim.equals(builtInTrim));
        }


}
