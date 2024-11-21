package unit1;

import java.util.Scanner;

/**
 * Description: 
 * Date: October 16, 2024
 * @author Liam Rickard
 */


public class Alive {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Hours and Days Calculator");

		System.out.println("Enter your birthdate and press <Enter> after each topic: Birth Year | Birth Month | Birth Day | Today's Year | Today's Month | Today's Day");

		//create variables
		int BirthYear;
		int BirthMonth;
		int BirthDay;
		int TodayYear;
		int TodayMonth;
		int TodayDay;

		//create ability to insert values
		BirthYear = sc.nextInt();
		BirthMonth = sc.nextInt();
		BirthDay = sc.nextInt();
		TodayYear = sc.nextInt();
		TodayMonth = sc.nextInt();
		TodayDay = sc.nextInt();

		//calculations for days alive and hours slept
		int DaysAlive = (((TodayYear - BirthYear) * 365) + ((TodayMonth - BirthMonth) * 30) + (TodayDay - BirthDay));
		int HoursSlept = (DaysAlive * 8);

		//display message for final result
		System.out.println("You have been alive for "+ DaysAlive + " days");
		System.out.println("You have slept "+ HoursSlept + " hours");
	}

}
