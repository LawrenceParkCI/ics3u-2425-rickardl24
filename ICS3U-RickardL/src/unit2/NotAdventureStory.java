package unit2;

import java.util.Scanner;

public class NotAdventureStory {

	public static void main(String[] args) throws InterruptedException {
		String gate;
		String witch;
		String merchant;
		Scanner sc = new Scanner(System.in);
		String buy;
		
		
		gate = sc.nextLine();
		if (gate.equalsIgnoreCase("east")) {
			System.out.println("You walk a long way and find an evil witch, who also seems to be looking for the enchanted golden apple");
			Thread.sleep(3200);
			System.out.println("Do you confront her or sneak by?");
			witch = sc.nextLine();


			if (witch.equalsIgnoreCase("Confront her")) {
				System.out.println("The witch gets mad and throws a potion of damage at you");
				Thread.sleep(2200);
				System.out.println("You die");
				System.exit(0);
			}

			else if (witch.equalsIgnoreCase("Sneak by")) {
				Thread.sleep(1200);
				System.out.println("You come across a ravine and see a bridge that is broken, there is a merchant that could fix the bridge for you if you go talk to him");
				Thread.sleep(2000);
			}
			System.out.println("Do you talk to the merchant or ignore him?");
			merchant = sc.nextLine();
			
			if (merchant.equalsIgnoreCase("ignore him")) {	
				Thread.sleep(800);
				System.out.println("You are now forcced to jump over the ravine");
				Thread.sleep(2200);
				System.out.println("You try to jump across but don't even get close to making it");
				System.out.println("You die");
				System.exit(0);		
			}
			else if (merchant.equalsIgnoreCase("Talk to the merchant")) {
				System.out.println("The merchant has a friendly dog and an iron sword for sale");
				Thread.sleep(2200);
				System.out.println("The sword costs 25 gold and the dog costs 40 gold. What do you buy?");
				Thread.sleep(800);
				System.out.println("The sword/The dog/Both/Nothing");
				
			}
			buy = sc.nextLine();
			if (buy.equalsIgnoreCase("The sword")) {
				Thread.sleep(800);
				System.out.println("Great. This will be kept in your backpack for the rest of your journey");
				boolean sword = true;
			}
			else if (buy.equalsIgnoreCase("The dog")) {
				Thread.sleep(800);
				System.out.println("Great. This will be kept in your backpack for the rest of your journey");
				boolean dog = true;
			}
			else if (buy.equalsIgnoreCase("Both")) {
				Thread.sleep(800);
				System.out.println("Great. These will be kept in your backpack for the rest of your journey");
				boolean dog = true;
				boolean sword = true;
			}
			else if (buy.equalsIgnoreCase("Nothing")) {
				Thread.sleep(800);
				System.out.println("Move on as normal");
			}
			else {
				System.out.println("The merchant didn't like you and stabbed you with the sword");
				Thread.sleep(800);
				System.out.println("You died");
				System.exit(0);
			}
			System.out.println("Before you leave, the merchant wants you to guess his favourite number");
			Math.Random()
		}		
	}
}
