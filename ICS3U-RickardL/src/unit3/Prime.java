package unit3;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Stop checking further as we already found a divisor
                }
            }
        }

        if (isPrime) {
            System.out.println("It is prime");
        } else {
            System.out.println("The number is not prime");
        }

        scanner.close();
    }
}
