package unit1;

/**
 * Description: Decimal format worksheet
 * Date: October 22, 2024 
 * @author Liam Rickard
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?
		
		/*
		 * The value is 11.3
		 */
		
		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		
		System.out.println("The cost of your item with tax is " + percent.format(TAX_RATE));
		

		//Change the above print statement on line 19 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		
		/*
		 * The output is "11.30" which correctly states the money format
		 */
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		
		/*
		 * The output now displays a dollar sign before the number
		 */
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		
		/*
		 *  The output displays "$11.3"
		 */
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 11.865
		//Run the program again with the cost of 10.50, what is happening?
		
		/*
		 * It outputs "$11.87" which is rounded to the second decimal place
		 */
		
		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		
		/*
		 * It shows that the cost of the item with tax is $139505.28
		 */
		
		
		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
	 
		/*
		 * The cost of the item is $139,505.28 - the number is organized with commas since it was added in the original format
		 */
		
		
		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		
		System.out.println("The tax rate is " + TAX_RATE);
		
		/*
		 * The tax rate will always be 0.13 since it was given that value so this is what was displayed
		 */
		
		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?

		/*
		 * The tax rate is displayed with a percent sign 
		 */

		sc.close();
	}

}
