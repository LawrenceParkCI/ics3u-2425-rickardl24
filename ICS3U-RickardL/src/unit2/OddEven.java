package unit2;

/**
 * Description: OddEven assignment
 * Date: November 4, 2024
 * @author Liam Rickard
 */
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.println("Insert an integer and press <Enter>");
		num = sc.nextInt();
		
		if (num %2 == 0) {
			System.out.println("Your number is even");
		}
		else {
			System.out.println("Your number is odd");
		}

	}

}
