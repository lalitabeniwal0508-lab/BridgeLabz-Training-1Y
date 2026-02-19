package com.gla.String.Level3;
import java.util.Scanner;

public class UniqueCharacters {

    public static int findLength(String text) {
        int count = 0;
        for (char c : text.toCharArray())
            count++;
        return count;
    }

    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] result = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result[index++] = ch;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++)
            unique[i] = result[i];

        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (char c : unique)
            System.out.print(c + " ");
    }
}


