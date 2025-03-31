package unit2;
/**
 * Description: Positive or negative integer assignment
 * Date: November 4, 2024
 * @author Liam Rickard
 */
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Insert an integer and press <Enter>");
		num = sc.nextInt();
		if (num >= 0) {
			System.out.println("Your number is positive");
		}
		else {
			System.out.println("Your number is negative");
		}
		if (num %7 ==0) {
			System.out.println("Your number is divisible by 7");
		}
		else {
			System.out.println("Your number is not divisible by 7");
		}
	}

}
