package unit1;
/**
 * Description: This is a calculation of a net pay
 * Date: October 16, 2024
 * @author Liam Rickard
 */
public class NetPay {

	public static void main(String[] args) {
		
		//create variables
		
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		
		//calculate NetPay
		double NetPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		
		//create a display message
		System.out.println("Your net pay is " + NetPay);

	}

}
