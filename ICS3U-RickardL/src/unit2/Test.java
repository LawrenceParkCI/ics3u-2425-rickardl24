package unit2;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = in.nextLine();

    int count = 0; // Counter for repetitions
    while (count < 20) {
      System.out.println(word);
      count++; // Increment the counter
    }

    in.close();
  }
}