package unit2;

import java.util.Scanner;

/**
 Description:
 Date:
 @author 
 */

class FlowChartChallenge {
	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    How would the flow chart of the do-while loop
     and while loop differ?
		 */
		/*
		 *  https://drive.google.com/file/d/1FqEYiLAdcAuNI-i1oJW0kWLErrmmzjqH/view?usp=sharing
		 */

		/*
		 * The flow chart of the do-while and while loop would differ as the do-while loop would
		 * ask for the name before the condition is checked, making sure the code runs at least once.
		 * In the while loop, the loop may not execute if the condition is false at the beginning.
		 */

		Scanner sc = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = sc.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		sc.close();

	}
}