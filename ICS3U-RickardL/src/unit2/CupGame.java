package unit2;
import java.util.Random;
import hsa_new.Console;
public class CupGame {

	public static void main(String[] args) {
		Console c = new Console(50,200);
		Random random = new Random();

		
		int correctcup = random.nextInt(3) + 1;

		c.println("Welcome to the cup game.");
		c.println("Choose 1 out of the 3 cups:");
		c.println("Choose the one correct cup to win");

		int usernum = c.readInt();
		if (usernum < 1 || usernum > 3) {
			c.println("Invalid number, terminating");
			return;
		}
		else {
			if (usernum == correctcup) {
				c.println("You picked the correct cup!");
				c.println("You move onto the next round!");
			} else {
				c.println("You picked the incorrect cup.");
				c.println("The correct cup was " + correctcup);
			}
		} 
	}
}
