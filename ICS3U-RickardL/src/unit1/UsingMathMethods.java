package unit1;
import java.util.Scanner;

/**
 * Description: Using math methods to create outputs
 * Date: October 18, 2024
 * @author Liam Rickard
 */
public class UsingMathMethods {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable
		System.out.println("Input any real number and press <Enter>");
		num = sc.nextDouble();

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num,  3));

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 *      num = 16.75  | num = 4.0  | num = -23.45
		 *      -----------------------------------------------
		 * Math.round(num) 17                     |  4    |  -23
		 * Math.rint(num)  17.0                   |  4.0  |  -23.0
		 * Math.sqrt(num)  4.092676385936225      |  2.0  |  NaN
		 * Math.abs(num)   16.75                  |  4.0  |  23.45
		 * Math.pow(num, 2) 280.5625              |  16.0 |  549.9024999999999
		 * Math.pow(num, num) 3.178689376746782E20|  256.0|  NaN
		 * Math.pow(num, 3) 4699.421875           |  64.0 |  -12895.213624999999
		 * 
		 */

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!
		// It does this because you cannot square root a negative number


		//In your own words describe what the following Math methods does
		/*
		 * round: Rounds the given number without a decimal place
		 * rint:  Rounds the given number with a decimal place
		 * sqrt:  Determines the square root of a given number
		 * abs:   The absolute value of a given number
		 * pow:   Multiplies the given number by an exponent given in (num, 2) or (num, 3)
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		// The purpose of these two parameters is to determine which exponential value is going to be multiplied into the given number



		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		System.out.println("Input any integer and a real number and press <Enter>");
		double num1;
		double num2;

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("The real number is " + num2);
		System.out.println("The square root of the number is " + Math.sqrt(num2));
		System.out.println("The real number to the integer's power is " + Math.pow(num2, num1));




		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
		// 13.5 is 182.25 
		// 3.6742 is 13.499745639999999
		// 182.25 is 33215.0625




		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		// The real number is 7.8985
		// The square root of the number is 2.8104270138183627
		// The real number to the integer's power is 492.75820832162503


		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		// The real number is 16.0
		// The square root of the number is 4.0
		// The real number to the integer's power is 4.0

		//b) the number 8 and the real number power 0.33
		// The real number is 8.0
		// The square root of the number is 2.8284271247461903
		// The real number to the integer's power is 1.9861849908740719

		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		// Result for 0.3333333:
		// The real number is 5.0
		// The square root of the number is 2.23606797749979
		// The real number to the integer's power is 1.7099758549400288

		// Result for 0.33
		// The real number is 5.0
		// The square root of the number is 2.23606797749979
		// The real number to the integer's power is 1.7008268430839244

		// The answers are slightly different for the result of the integer's power



	}

}
