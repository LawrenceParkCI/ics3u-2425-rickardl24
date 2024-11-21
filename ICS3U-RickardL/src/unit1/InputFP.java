package unit1;
/**
 * Description: Floating point worksheet
 * Date: October 11, 2024
 * @author Liam Rickard
 */
import java.util.Scanner;
public class InputFP {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		double num1, num2; 

		System.out.println("Type in your first number and press <Enter>");
		num1 = sc.nextDouble();


		System.out.println("Type in your second number and press <Enter>");
		num2 = sc.nextDouble();


		System.out.println();
		System.out.println("The first number entered was "+ num1);
		System.out.println("The second number entered was "+ num2);

		System.out.println();
		System.out.println("SUM");
		double sum = num1+num2;

		System.out.println("The sum of your numbers is " + sum);
		sc.close();



	}

}
