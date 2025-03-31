package unit1;

/**
 * Date: Oct. 1, 2024
 * Description: Math Operators Assignment
 * @author Liam Rickard
 */
public class MathOperators {
	/**
	 *
	 * @param
	 */
	public static void main(String[] args) {
		/*
		 * Pre: Kind of Math, but not really What do you notice is happening?
		 */

		// System.out.println("Butter" + "fly");
		// The two words are merged together
		// System.out.println("1 + 2 + 3 + 4 + 5");
		// The values are not being added
		// System.out.println(1 + 2 + 3 + 4 + 5);
		// All the values are being added up
		// System.out.println(1 + 2 + "3 + 4 + 5");
		// The value is incorrect
		// System.out.println("1 + 2 + 3" + 4 + 5);
		// The digit with the quotation marks in the middle is the starting value for a large number using the values that come after
		// Why do you think the last two outputs act so differently?
		// The quotation marks create a new number with all values after it to be in one large number
		// Summary: What are two possible roles of the + operator?
		// Adding numbers and digits
		/*
		 * Part 1 Figure out what is the meaning of each operator. Use print statements
		 * to verify your answer and explain.
		 */
		
		// + means: Adding numbers 
		System.out.println(1+2+3+4);

		// - means: Subtracting numbers
		System.out.println(9-7);

		// * means: Multiplying numbers
		System.out.println(4*2);
		
		// / means: Dividing numbers
		System.out.println(11/3);

		// Print the following expression: (3 + 2) * 5
		// Print the following expression: 3 + 2 * 5
		System.out.println((3 + 2) * 5);
		System.out.println(3 + 2 * 5);
		// Was this expected? Why or why not?
		// This was expected because order of operations changes the equation
		/*
		 * Part 2 - Calculate Using Operators Print out, using one println statement,
		 * what 45 degrees Celsius is in Fahrenheit
		 * 
		 * Print out, using a print and a println statement, what 900 Fahrenheit is in
		 * Celsius
		 */
		System.out.println((45 * 9/5) + 32);
		System.out.println((900 - 32) * 5/9);
		/*
		 * Part 3 Figure out what is the meaning of % as a math operator. Use print
		 * statements to check your answer.
		 */
		System.out.println(20%3);
		// I think % means: the remainder which is not shown in the equation when the result is a number with a decimal

	}
}