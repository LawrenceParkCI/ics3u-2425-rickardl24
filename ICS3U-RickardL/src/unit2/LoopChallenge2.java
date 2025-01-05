package unit2;

import java.util.Scanner;

/**
 Description:
 Date:
 @author
 */

public class LoopChallenge2 {
	public static void main(String[] args) {
		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1
		 */

		Scanner in = new Scanner(System.in);
		double number;
		double answer;

		do {
			System.out.print("Enter a positive number");
			number = in.nextDouble();
			
			if (number < 0) {
				System.out.println("Invalid number. Type in a positive number");
			}
			
		} while (number < 0);
		
		answer = Math.sqrt(number);
		System.out.println("The squart root of " + number + "is " + answer);
		
		in.close();
	}
}