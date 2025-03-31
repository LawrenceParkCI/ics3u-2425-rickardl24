package unit3;
import java.util.Scanner;
public class ExamPrep2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many odd numbers would you like");
		int numbers = sc.nextInt();
		int sum = 0;
		
		for (int i = 0, count = 0; count < numbers; i++) {
			if (i % 2 != 0) {
				System.out.println(i + "");
				sum += 1;
				count++;
			}

		}

	}

}
