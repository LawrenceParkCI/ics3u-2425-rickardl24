package unit1;

/**
 * Description: Second casting worksheet
 * Date: October 21, 2024
 * @author Liam Rickard
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
		// The code has a value of "a" which is being added to by its binary value to get 98. It is later switched back to letters to get the letter "b"
		// Explicit - line 22 and 24
		// Implicit - line 18, 19, 20
		//Why do you think this happens?
		// This happens because the data type is switched from int to char
		//Investigate what is ASCII. What is it?
		//ASCII is the most common character encoding format for text data in computers and on the internet
		//Can you find the number value for 'a'? Does it match with your findings above?
		// The lowercase value is 97. It matches my findings

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it
		char myCharCap = (char) (myChar - 32);
		System.out.println(myCharCap);

	}
}