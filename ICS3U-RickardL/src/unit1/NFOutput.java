package unit1;

/**
 * Description: Number format worksheet
 * Date: October 22, 2024
 * @author Liam Rickard
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?

		/*
		 * You can't change how the number is displayed because it is not the same as DecimalFormat
		 */

		//What other formats does NumberFormat offer?
		numberformat.get

		sc.close();
	}

}
