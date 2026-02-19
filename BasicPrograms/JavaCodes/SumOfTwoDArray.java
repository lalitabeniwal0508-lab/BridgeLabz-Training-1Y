import java.util.Scanner;

class SumOfTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		system.out.println("Enter rows");
		int r = sc.nextInt();

        System.out.println("Enter column");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		system.out.println("Enter elements:");
		for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
		int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
			    sum += arr[i][j];
               
            }
		}	
            System.out.println("Sum of 2D array: +sum);
        
    }
}