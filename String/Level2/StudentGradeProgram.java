package com.gla.String.Level2;
import java.util.Random;
public class StudentGradeProgram {
    public static int[][] generateMarks(int students) {
            Random r = new Random();
            int[][] marks = new int[students][3];

            for (int i = 0; i < students; i++) {
                for (int j = 0; j < 3; j++) {
                    marks[i][j] = 50 + r.nextInt(51);
                }
            }
            return marks;
    }

        public static void main(String[] args) {
            int students = 5;
            int[][] marks = generateMarks(students);

            System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

            for (int i = 0; i < students; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                double avg = total / 3.0;
                double percent = avg;

                String grade;
                if (percent >= 90) grade = "A";
                else if (percent >= 75) grade = "B";
                else if (percent >= 60) grade = "C";
                else if (percent >= 50) grade = "D";
                else grade = "F";

                System.out.println(marks[i][0] + "\t" +
                        marks[i][1] + "\t" +
                        marks[i][2] + "\t" +
                        total + "\t" +
                        Math.round(avg*100)/100.0 + "\t" +
                        Math.round(percent*100)/100.0 + "\t" +
                        grade);
            }
        }



}
