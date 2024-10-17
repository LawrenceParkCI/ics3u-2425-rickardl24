package unit1;
/**
 * Description: Creating string manipulation
 * Date: October 17, 2024
 * @author Liam Rickard
 */
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//create user interaction
		System.out.println("Input a sentance and press <Enter>");
		String UserInput;
		UserInput = sc.nextLine();
		
		//create sentence modifiers
		int firstWord = UserInput.indexOf(" ");
		int lastWord = UserInput.lastIndexOf(" ");
		System.out.println(UserInput);
		System.out.println(UserInput.toUpperCase());
		System.out.println(UserInput.toLowerCase());
		System.out.println(UserInput.length());
		System.out.println(UserInput.substring(5, 6));
		
		System.out.println("The first word is " + UserInput.substring(0 , firstWord));
		System.out.println("The last word is" + UserInput.substring(lastWord));
		
	}

}
