/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * Date : Jan 30,2019
 */
import java.lang.Math;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
            //c.setValue(insert call to random number generator here)
            c.setValue(randomNumber());
            //System.out.println(c.getValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(randomString());
            System.out.println(c.getValue()+ c.getSuit());
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Please enter the number of your choice from 1-13!");
        Scanner input = new Scanner(System.in);
        int userN = input.nextInt();
        System.out.print(userN);
        
        System.out.print("Please enter the Suit!");
        String userS = input.nextLine();
        System.out.print("1"+userS);
        
        for(int i=0; i<magicHand.length; i++ ){
        // and search magicHand here
            if(c.getValue()==userN && c.getSuit()==userS){
                System.out.print("yes, the card matches!");
                continue;
            }
            System.out.print("no, the card does not match!");
        //Then report the result here
        }
    }
    public static String randomString(){
        int x = (int)(Math.random()*4);
        if(x == 0)
            return "Hearts";
        else if(x == 1)
            return "Diamonds";
        else if(x == 2)
            return "Spades";
        else
            return "Clubs";
        }
        
     public static int randomNumber(){
        return (int)(Math.random()*13+1);
    }
}
