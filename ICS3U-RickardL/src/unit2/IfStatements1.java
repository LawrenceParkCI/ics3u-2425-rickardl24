package unit2;
/**
 * Description: First if statements worksheet
 * Date: November 5, 2024
 * @author Liam Rickard
 */

public class IfStatements1 {
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		// It doesn't print anything because there is no else category for when the first number is smaller than the second number

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		// Since we have been given an else value, the number does not fit into the first condition so it must display what else is left

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		// The first number is divisible by 2 and the second number is divisible by 3. Since they fit these conditions, the message displayed is under this section of else if.

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//KEKW and OMBEGALUL print for part 1 since the displayed message fits the condition of the first number being smaller than the second number.
		//KEKW, OMEGALUL and sykSHY are displayed for part 2 because it matches the first condition of have the first number smaller than the second number,
		//and a separate if statement is created. Since the second if statement also matches the condition, it is displayed as well. 
		//What is the difference between the first and second part? The difference is that the second statement doesn't use any else statements.
		// This means that the numbers can fit into more than 1 condition, with nothing to be displayed if they don't fit in a specific spot.

	}
}