package unit1;

import java.util.Scanner;

public class MakeLabels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the name and subject then press <Enter>");
		
		String name;
		name = sc.nextLine();
		
		String subject;
		subject = sc.nextLine();
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}
