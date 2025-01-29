package unit3;

import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Generate right angle triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}