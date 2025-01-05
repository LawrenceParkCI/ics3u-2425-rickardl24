package unit2;

import java.util.Scanner;

/**
Description:
Date:
@author 
 */

public class StringLengthAndChars {

	/**
	 * @param args unused
	 */

	public static void main(String[] args) {
		/*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));

		//.length() gets the number of characters in the string
		//.charAt(position) gets the character at a specific point
		//counting starts at 0

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */

		Scanner in = new Scanner(System.in);

		System.out.println("Print a name");
		String newname = in.nextLine();

		for (int i = 0; i < newname.length(); i++) {
			System.out.println(newname.charAt(i));
		}




		in.close();



	}
}