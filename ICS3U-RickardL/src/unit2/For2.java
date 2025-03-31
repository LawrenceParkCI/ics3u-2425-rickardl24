package unit2;

/**
Description:
Date:
@author 
 */

public class For2 {
	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:


		//though we are repeating a certain number of times, we can use variables in our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}

		//In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.println(i);
		}

		//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
		double start = 2.2;
		double end = 11.2;
		double increase = 1.5;

		for (double i = start; i <= end; i+= increase) {
			System.out.println(i);
		}




		//Look at the following code. Explain what is happening?
		/*
		 * The variable "sum" has been given a value of 0 in the beginning. The value of i, being 1 is 
		 * added to the value of sum until it reaches 9, where it stops. After all of this, the value of
		 * 45 is printed as it is the sum of all the numbers printed. 
		 */

		int sum = 0; 

		for (int i = 1; i < 10; i++) {
			sum += i;
		}

		System.out.println(sum);



	}
}