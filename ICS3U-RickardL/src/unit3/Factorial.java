package unit3;
import java.util.Scanner;

public class Factorial {
    
    // Method to calculate average
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for number of values
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();
        
        int[] numbers = new int[count];
        
        // Input values
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Call method and display average
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}


