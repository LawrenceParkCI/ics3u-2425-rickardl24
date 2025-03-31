package unit1;

import java.util.Scanner;

/**
 * Description: Introduction to casting
 * Date: October 21, 2024
 * @author Liam Rickard
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		//double is being printed since the number has a decimal point

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		//The number is being added by 2.2 from the original value

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//string data because there is no decimal point

		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      intNum = doubleNum - implicit
      double to int
      doubleNum = intNum - implicit
      int to long
      intNum = (long) longNum - explicit
      long to int
      longNum = (long) intNum - explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */
		// Implicit data is for smaller variables in the data types of string and int. Long has many more numbers and variables requiring explicit casting

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");
		myNum = in.nextDouble();

		myNum = myNum * 10;
		myNum = (int) myNum;
		myNum = (double) myNum / 10;


		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);

	}
}