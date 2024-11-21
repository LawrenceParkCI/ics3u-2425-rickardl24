package unit1;

/**
 * Description: Grocery shopping assignment
 * Date: November 1, 2024
 * @author Liam Rickard
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryShopping {

	// Constants
	private static final double TAX_RATE = 0.13;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Create Title for Grocery Shop
		System.out.println(" $$$ \\\\ ========== \"Mr. Rickard's Grocery\" ========== /// $$$ \n");

		// Collect input for first product
		System.out.print("What would you like to buy? ");
		String product1 = sc.nextLine();
		System.out.print("How much does it cost? ");
		double price1 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		int quantity1 = sc.nextInt();
		System.out.println("Very good.\n");

		// Clear 
		sc.nextLine();  

		// Collect input for second product
		System.out.print("What would you like to buy? ");
		String product2 = sc.nextLine();
		System.out.print("How much does it cost? ");
		double price2 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		int quantity2 = sc.nextInt();
		System.out.println("Very good.\n");

		// Calculate totals
		double total1 = price1 * quantity1;
		double total2 = price2 * quantity2;
		double subtotal = total1 + total2;
		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;

		// Print Date and Time for Receipt
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/DD/YYYY HH:mm");
		String dateTime = LocalDateTime.now().format(formatter);

		// Print Receipt
		System.out.println("This is your receipt:\n");
		System.out.println("\t\t Mr. Rickard's Grocery");
		System.out.println(dateTime + "\n");
		System.out.println("Item      |  Price  | Quant. | Total Price ");
		System.out.println("------------------------------------------");
		System.out.printf("%-10s | $%6.2f | %5d  | $%8.2f\n", product1, price1, quantity1, total1);
		System.out.printf("%-10s | $%6.2f | %5d  | $%8.2f\n", product2, price2, quantity2, total2);
		System.out.println("------------------------------------------");
		System.out.printf("                     Subtotal: $%8.2f\n", subtotal);
		System.out.printf("                          Tax: $%8.2f\n", tax);
		System.out.printf("                        Total: $%8.2f\n", total);

		// Print approximate values
		System.out.printf("\nThis is approximately $%d.\n", Math.round(total));
		System.out.printf("Rounded to the nearest 5 cents: " + Math.round(total * 20) / 20.0);

		// Farewell Message
		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Mr. Rickard’s Grocery!");

		// Close scanner
		sc.close();
	}
}