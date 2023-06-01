/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c1 = new Card();
          Random random = new Random();
            int suitIndex = random.nextInt(Card.SUITS.length);
            String suit = Card.SUITS[suitIndex];
            int rank = random.nextInt(13) + 1;
            
            c1.setSuit(suit);
            c1.setValue(rank);
            
            magicHand[i] = c1;
        }
        
        // Printing the magicHand
        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " - " + card.getValue());
        }
        
        
        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setSuit("Spades");
        luckyCard.setValue(10);

        
        // Prompting the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card (Enter the suit and value): ");
        String userSuit = scanner.next();
        int userValue = scanner.nextInt();
        scanner.close();
        
        // Search for the user's card in the magicHand
        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        
        boolean draw = false;
        for (Card card : magicHand) {
            if (card.getSuit().equals(luckyCard.getSuit()) && card.getValue() == luckyCard.getValue()) {
                draw = true;
                break;
            }
        }
        
        // Report whether the user's card is in the magicHand
        if (draw) {
            System.out.println("Hurray! You found the lucky card.");
        } else {
            System.out.println("Sorry! The lucky card is not in the magic hand.");
        }
    }
}






        
        
        
    
