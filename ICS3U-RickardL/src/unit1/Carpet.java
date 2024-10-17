package unit1;
/**
 * Description: Finding the cost to carpet a room
 * Date: October 17, 2024
 * @author Liam Rickard
 */
import java.util.Scanner;

public class Carpet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//make instructions for user
		System.out.println("Type in the length of the room in meters and press <Enter>");
		System.out.println("Type in the width of the room in meters and press <Enter>");
		System.out.println("Type in the cost per square meter of the carpet and press <Enter>");
		
		//create variables
		int roomLength;
		int roomWidth;
		int costPerMeter;
		
		//create user inputs to calculate
		roomLength = sc.nextInt();
		roomWidth = sc.nextInt();
		costPerMeter = sc.nextInt();
		
		//create equation for cost
		int TotalCost = (roomLength * roomWidth * costPerMeter);
		
		//print final output
		System.out.println("Your carpet will cost $" + TotalCost);
		



	}

}
