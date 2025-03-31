package unit2;

import java.util.Scanner;

public class LoopChallenge1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String password = "loopchallenge";
		int attempts = 0;
		boolean correct = false;

		while (attempts < 3 && !correct) {
			System.out.println("Type in the password");
			String answer = in.nextLine();
			if (answer.equalsIgnoreCase(password)) {
				System.out.println("Welcome");
				correct = true;
			} else {
				System.out.println("Sorry, that's incorrect");
				attempts++;

			}
		}
		if (!correct) {
			System.out.println("Too many failed attempts.");
		}
		in.close();

	}

}
