package com.gla.String.Level1;
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        // Accessing index beyond the length of the string
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index access!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nDemonstrating handled StringIndexOutOfBoundsException:");
        handleException(input);
    }
}


