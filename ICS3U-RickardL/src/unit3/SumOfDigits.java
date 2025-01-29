package unit3;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum +=i;
		}
		System.out.println("The sum of numbers from 1 to " + number + " is " + sum);
		scanner.close();
	}

}
