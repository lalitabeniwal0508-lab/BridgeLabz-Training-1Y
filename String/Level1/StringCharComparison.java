package com.gla.String.Level1;
import java.util.Scanner;
public class StringCharComparison {
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }


    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] userDefinedChars = getChars(input);

        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareArrays(userDefinedChars, builtInChars);

        System.out.println("\nCharacters from user-defined method:");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters from built-in toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nComparison result: " + areEqual);
    }
}
