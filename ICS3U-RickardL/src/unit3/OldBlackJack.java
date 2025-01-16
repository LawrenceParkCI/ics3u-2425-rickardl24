package unit3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import hsa_new.Console;
import java.util.Collections;

import javax.imageio.ImageIO;


public class OldBlackJack {

	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(40,120);
		BufferedImage blackJackTable = null;
		try {
			blackJackTable = ImageIO.read(new File ("src/unit3/blackJackTable.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> deck;
		int[] playerMoney = {100}; // Total amount of money for the player
		c.drawImage(blackJackTable, 0, 0, c.getWidth(), c.getHeight(), null);
		c.println("Welcome to Blackjack!");
		c.println("You will be competing against an online dealer. Good luck! ");
		
		
		boolean startgame = true;
		while (startgame) {
			deck = initializeDeck();
			Collections.shuffle(deck);

			ArrayList<ArrayList<String>> playerHands = new ArrayList<>();
			for (int i = 0; i < 1; i++) {
				playerHands.add(new ArrayList<>());
			}

			ArrayList<String> dealerHand = new ArrayList<>();
			dealerHand.add(deck.remove(0));
			dealerHand.add(deck.remove(0));

			int[] bets = new int[1];

			// Get bets from each player
			for (int i = 0; i < 1; i++) {
				
				try {
					blackJackTable = ImageIO.read(new File ("src/unit3/blackJackTable.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (playerMoney[i] > 0) {
					c.println("Your current balance: $" + playerMoney[i]);
					c.print("Enter your bet: $");
					while (true) {
						bets[i] = c.readInt();
						if (bets[i] > 0 && bets[i] <= playerMoney[i]) {
							break;
						} else {
							c.print("Invalid amount. Please enter an value between $1 and $" + playerMoney[i] + ": ");
						}
					}
				} else {
					c.println("\nPlayer " + (i + 1) + " is out of money and cannot play this round.");
				}
			}

			// Deal initial cards to players
			for (int i = 0; i < 1; i++) {
				if (playerMoney[i] > 0) {
					playerHands.get(i).add(deck.remove(0));
					playerHands.get(i).add(deck.remove(0));
				}
			}

			// Players' turns
			for (int i = 0; i < 1; i++) {
				if (playerMoney[i] > 0) {
					c.println("\nPlayer " + (i + 1) + "'s turn.");
					c.println("Your hand: " + playerHands.get(i) + " (Total: " + calculateHandValue(playerHands.get(i)) + ")");
					c.println("Dealer's face-up card: " + dealerHand.get(0));

					boolean playerTurn = true;
					while (playerTurn) {
						c.print("Do you want to 'hit' or 'stand' ? ");
						String choice = c.readString().toLowerCase();

						if (choice.equals("hit")) {
							playerHands.get(i).add(deck.remove(0));
							c.println("You drew a " + playerHands.get(i).get(playerHands.get(i).size() - 1));
							int playerTotal = calculateHandValue(playerHands.get(i));
							c.println("Your hand: " + playerHands.get(i) + " (Total: " + playerTotal + ")");
							if (playerTotal > 21) {
								c.println("You lost this round!");
								playerTurn = false;
							}
						} else if (choice.equals("stand")) {
							playerTurn = false; 
						} else {
							c.println("Invalid choice. Please type 'hit' or 'stand'.");
						}
					}
				}
			}

			// Dealer's turn
			c.println("\nDealer's turn.");
			c.println("Dealer's hand: " + dealerHand + " (Total: " + calculateHandValue(dealerHand) + ")");
			while (calculateHandValue(dealerHand) < 17) {
				Thread.sleep(1000);
				dealerHand.add(deck.remove(0));
				c.println("Dealer draws a " + dealerHand.get(dealerHand.size() - 1));
			}
			int dealerTotal = calculateHandValue(dealerHand);
			c.println("Dealer's final hand: " + dealerHand + " (Total: " + dealerTotal + ")");

			// Determine results for each player
			for (int i = 0; i < 1; i++) {
				if (playerMoney[i] > 0) {
					String result = determineWinner(playerHands.get(i), dealerHand);
					if (result.equals("win")) {
						playerMoney[i] += bets[i];
						c.println("Player " + (i + 1) + " wins! New balance: $" + playerMoney[i]);
					} else if (result.equals("loss")) {
						playerMoney[i] -= bets[i];
						c.println("Player " + (i + 1) + " loses. New balance: $" + playerMoney[i]);
					} else {
						c.println("Player " + (i + 1) + " ties. Balance remains: $" + playerMoney[i]);
					}
				}
			}

			// Check if players want to continue
			c.print("\nDo you want to play again? (yes/no): ");
			String playAgain = c.readString().toLowerCase();
				if (playAgain.equals("yes")) {
                    startgame = true;
                    playerMoney = bets;
                } else if (playAgain.equals("no")) {
                    startgame = false;
                    System.out.println("Final balance = $" + playerMoney);
                    System.out.println("Thank you for playing.");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'Yes' or 'No'.");

			}
		}

		c.println("Thank you for playing! Final balances:");
		for (int i = 0; i < 1; i++) {
			c.println("Player " + (i + 1) + ": $" + playerMoney[i]);
		}
		c.close();
		}
	

	// Create the deck
	public static ArrayList<String> initializeDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		ArrayList<String> deck = new ArrayList<>();
		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(rank + " of " + suit);
			}
		}
		return deck;
	}

	// Calculate the value of a hand
	public static int calculateHandValue(ArrayList<String> hand) {
		int value = 0;
		int aces = 0;

		for (String card : hand) {
			String rank = card.split(" ")[0];
			if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
				value += 10;
			} else if (rank.equals("Ace")) {
				value += 11;
				aces++;
			} else {
				value += Integer.parseInt(rank);
			}
		}

		// Adjust for aces
		while (value > 21 && aces > 0) {
			value -= 10;
			aces--;
		}

		return value;
	}

	// Determine the winner
	public static String determineWinner(ArrayList<String> playerHand, ArrayList<String> dealerHand) {
		int playerTotal = calculateHandValue(playerHand);
		int dealerTotal = calculateHandValue(dealerHand);

		if (playerTotal > 21) {
			return "loss";
		} else if (dealerTotal > 21 || playerTotal > dealerTotal) {
			return "win";
		} else if (playerTotal < dealerTotal) {
			return "loss";
		} else {
			return "tie";
		}
	}
}


