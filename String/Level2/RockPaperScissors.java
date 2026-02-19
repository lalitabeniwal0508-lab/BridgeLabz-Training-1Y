package com.gla.String.Level2;
import java.util.Scanner;
public class RockPaperScissors {
    public static String computerChoice() {
            int choice = (int)(Math.random() * 3);
            return (choice == 0) ? "Rock" : (choice == 1) ? "Paper" : "Scissors";
    }

        public static String findWinner(String user, String computer) {
            if (user.equals(computer)) return "Draw";
            if ((user.equals("Rock") && computer.equals("Scissors")) ||
                    (user.equals("Paper") && computer.equals("Rock")) ||
                    (user.equals("Scissors") && computer.equals("Paper")))
                return "User";
            return "Computer";
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number of games: ");
            int n = sc.nextInt();

            int userWins = 0, compWins = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Rock/Paper/Scissors: ");
                String user = sc.next();
                String comp = computerChoice();
                String winner = findWinner(user, comp);

                if (winner.equals("User")) userWins++;
                if (winner.equals("Computer")) compWins++;

                System.out.println("Computer: " + comp + " | Winner: " + winner);
            }

            System.out.println("User Wins: " + userWins);
            System.out.println("Computer Wins: " + compWins);
            System.out.println("User Win %: " + (userWins * 100.0 / n));
            System.out.println("Computer Win %: " + (compWins * 100.0 / n));
        }



}
