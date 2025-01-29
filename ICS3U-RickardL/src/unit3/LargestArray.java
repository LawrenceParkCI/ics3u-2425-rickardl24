package unit3;
import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Find the largest element
        int largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("The largest element is: " + largest);
        scanner.close();
    }
}

