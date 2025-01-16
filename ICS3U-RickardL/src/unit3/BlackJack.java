package unit3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import hsa_new.Console;
import javax.imageio.ImageIO;

public class BlackJack {

    public static void main(String[] args) throws InterruptedException {
        Console c = new Console(40, 120);
        BufferedImage blackJackTable = loadBlackJackTable();

        int playerMoney = 100;
        boolean playGame = true;

        while (playGame) {
            c.drawImage(blackJackTable, 0, 0, c.getWidth(), c.getHeight(), null);
            c.println("Welcome to Blackjack!");
            c.print("You will be competing against an online dealer. Good luck!");

            ArrayList<String> deck = initializeDeck();
            Collections.shuffle(deck);

            ArrayList<String> playerHand = new ArrayList<>();
            ArrayList<String> dealerHand = new ArrayList<>();

            dealerHand.add(deck.remove(0));
            dealerHand.add(deck.remove(0));

            int bet = 0;
            if (playerMoney > 0) {
                c.print(" \nYour current balance: $" + playerMoney);
                c.println(" Enter your bet: $");
                while (true) {
                    bet = c.readInt();
                    if (bet > 0 && bet <= playerMoney) {
                        break;
                    } else {
                        c.print("Invalid amount. Please enter a integer value between $1 and $" + playerMoney + ": ");
                    }
                }
            } else {
                c.println("You are out of money and cannot play this round.");
                break;
            }

            playerHand.add(deck.remove(0));
            playerHand.add(deck.remove(0));

            c.println("Your turn.");
            c.println("Your hand: " + playerHand + " (Total: " + calculateHandValue(playerHand) + ")");
            c.println("Dealer's face-up card: " + dealerHand.get(0));

            boolean playerTurn = true;
            while (playerTurn) {
                c.print("Do you want to 'hit' or 'stand'? ");
                String choice = c.readString().toLowerCase();

                if (choice.equals("hit")) {
                    playerHand.add(deck.remove(0));
                    c.println("You drew a " + playerHand.get(playerHand.size() - 1));
                    int playerTotal = calculateHandValue(playerHand);
                    c.println("Your hand: " + playerHand + " (Total: " + playerTotal + ")");
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

            c.println("\nDealer's turn.");
            c.println("Dealer's hand: " + dealerHand + " (Total: " + calculateHandValue(dealerHand) + ")");
            while (calculateHandValue(dealerHand) < 17) {
                Thread.sleep(1000);
                dealerHand.add(deck.remove(0));
                c.println("Dealer draws a " + dealerHand.get(dealerHand.size() - 1));
            }
            int dealerTotal = calculateHandValue(dealerHand);
            c.println("Dealer's final hand: " + dealerHand + " (Total: " + dealerTotal + ")");

            String result = determineWinner(playerHand, dealerHand);
            if (result.equals("win")) {
                playerMoney += bet;
                c.println("You win! New balance: $" + playerMoney);
            } else if (result.equals("loss")) {
                playerMoney -= bet;
                c.println("You lose. New balance: $" + playerMoney);
            } else {
                c.println("It's a tie. Balance remains: $" + playerMoney);
            }

            c.print("\nDo you want to play again? (yes/no): ");
            String playAgain = c.readString().toLowerCase();
            if (playAgain.equals("yes")) {
                if (playerMoney <= 0) {
                    c.println("You ran out of money. Here's an extra $100 to keep playing!");
                    playerMoney = 100;
                }
            } else {
                playGame = false;
            }
        }
        c.println("Thank you for playing! Final balance: $" + playerMoney);
    }

    public static BufferedImage loadBlackJackTable() {
        try {
            return ImageIO.read(new File("src/unit3/blackJackTable.png"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

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
        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }
        return value;
    }

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
