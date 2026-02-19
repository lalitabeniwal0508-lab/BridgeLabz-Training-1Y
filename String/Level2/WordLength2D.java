package com.gla.String.Level2;
import java.util.Scanner;
public class WordLength2D {


        public static int findLength(String str) {
            int count = 0;
            try {
                while (true) {
                    str.charAt(count++);
                }
            }
            catch (Exception e) {
                return count;
            }
        }

        public static String[] customSplit(String text) {
            return text.split(" ");
        }

        public static String[][] wordWithLength(String[] words) {
            String[][] result = new String[words.length][2];

            for (int i = 0; i < words.length; i++) {
                result[i][0] = words[i];
                result[i][1] = String.valueOf(findLength(words[i]));
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text: ");
            String input = sc.nextLine();

            String[] words = customSplit(input);
            String[][] result = wordWithLength(words);

            System.out.println("Word\tLength");
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
            }
        }


}
