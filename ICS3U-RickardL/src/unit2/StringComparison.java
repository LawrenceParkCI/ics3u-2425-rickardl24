package unit2;

import java.util.Scanner;

/**
 * Description:
 * Date:
 * @author 
 */

class StringComparison {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?
		/*When I type the correct answer or incorrect answer, it says "Sorry, that's incorrect."


    /*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()


        .equals()
        
        System.out.println(n1.equals(n2));

        .equalsIgnoreCase()

        boolean equalsIgnoreCaseResult = s1.equalsIgnoreCase(s2);
		 */
		String n1 = "Toronto";
		String n2 = "TorontO";
		String n3 = "ontario";
		System.out.println(n1.compareTo(n3));
		System.out.println(n1.equals(n2));
		System.out.println(n1.equalsIgnoreCase(n2));
		

		//What values does compareTo() return? How can we 
		//interpret the value?
		/*
		 * CompareTo returns the value of -27, we can interpret the ASCII values which are associated with each letter of the word
		 */

		//what value does equals() and equalsIgnoreCase() return? 
		//What is the difference between these two functions?
		/*
		 * equals and equalsIgnoreCase returns true or false statements of whether or not the two strings are equal to each other.
		 * The difference of these functions is that one of them considers capital letters and the other one ignores capital letters.
		 */
		in.close();
	}
}