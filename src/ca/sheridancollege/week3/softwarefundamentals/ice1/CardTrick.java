/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @modifier Michael Nam Tran 991363499
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Random rand = new Random();

        //insert code to ask the user for Card value and suit, create their card
        Scanner cardNumber = new Scanner(System.in);
        System.out.println("Choose your card's number?");
        int number = cardNumber.nextInt();

        Scanner cardSuit = new Scanner(System.in);
        System.out.println("What is your card's Suit?, case sensitive");
        String suit = cardSuit.nextLine();

        System.out.println("Your Card is: " + number + " of " + suit);
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue(rand.nextInt(7));    //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[rand.nextInt(3)]); //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.println(c.getValue() + " of " + c.getSuit());
            if (number == c.getValue() && suit.equals(c.getSuit())) {
                System.out.println("Card Matches");
            } else {
                System.out.println("Card Doesn't Match");
            }
        }
        //Then report the result here
    }
}
