package unit3;
import java.util.Scanner;
public class ExamPrep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter and Integer");
		int number = sc.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(number + "x" + i + "=" + (number * i));
		}
		
		}

}
