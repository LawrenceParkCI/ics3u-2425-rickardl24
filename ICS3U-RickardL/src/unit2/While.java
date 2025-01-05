package unit2;

/**
Description:
Date:
@author 
 */

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}


		in.close();
		//Run the code Using the debugger. 
		//Explain the code in your own words

		/*
		 * The code uses a while loop which asks the user for names until the "numPeople" is equal to 0 
		 */

		//What code is repeated?
		/*
		 * Lines 20, 23, 24 and 26
		 */

		//When does it decide whether to repeat or not?

		/*
		 * It is checked at the start of the iteration to confirm that numPeople is greater than 0. It will end if this is false.
		 */

		//What is the condition for repeating?

		/*
		 * As long as numPeople is greater than 1
		 */


		//What is the difference between a while loop and a do-while loop?
		/*
		 * The condition is checked after executing the body in a do-while loop, and the opposite in a while loop
		 */


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.

		System.out.println("Type in a word: ");
		String word = in.nextLine();

		int worduse = 0;
		while (worduse < 20) {
			System.out.println(word);
			worduse++;
		}
		in.close();
	}
}