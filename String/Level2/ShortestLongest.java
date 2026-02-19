package com.gla.String.Level2;
import java.util.Scanner;
public class ShortestLongest {


        public static String[] split(String text) {
            return text.split(" ");
        }

        public static int[] findMinMax(String[] words) {
            int min = words[0].length();
            int max = words[0].length();
            int minIndex = 0, maxIndex = 0;

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() < min) {
                    min = words[i].length();
                    minIndex = i;
                }
                if (words[i].length() > max) {
                    max = words[i].length();
                    maxIndex = i;
                }
            }
            return new int[]{minIndex, maxIndex};
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String input = sc.nextLine();

            String[] words = split(input);
            int[] result = findMinMax(words);

            System.out.println("Shortest word: " + words[result[0]]);
            System.out.println("Longest word: " + words[result[1]]);
        }


}
