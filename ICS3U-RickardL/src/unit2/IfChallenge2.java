package unit2;

import java.util.Scanner;

/**
 * Description: Second if challenge worksheet
 * Date: November 11, 2024
 * @author Liam Rickard
 */

public class IfChallenge2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		System.out.println("Type in 3 numbers and press <Enter>");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();

		if (num1<num2) {
			if (num2<num3) {
				System.out.println("Your numbers are strictly in order");
			}
			else {
				System.out.println("Your numbers are not strictly in order");
			}
		}

		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */
	}
	
}