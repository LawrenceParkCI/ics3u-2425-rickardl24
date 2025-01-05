package unit2;

import java.util.Scanner;

/**
Description:
Date:
@author
*/

public class ForChallenge1 {
  public static void main(String[] args) {
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	  
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the starting number");
	  double start = in.nextDouble();
	  
	  System.out.println("Enter the ending number");
	  double end = in.nextDouble();
	  
	  System.out.println("How much should it count by?");
	  double count = in.nextDouble();
	  
	  for (double i = start; i <= end; i += count) {
		  System.out.print(String.format("%.1f ", i));
	    }

	  
	  
	  
	  in.close();
  }
}