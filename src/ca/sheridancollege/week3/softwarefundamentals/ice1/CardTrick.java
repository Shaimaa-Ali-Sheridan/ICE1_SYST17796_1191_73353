/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Dhruv Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Random r =new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            
            int value = r.nextInt(13)+1;
            int suits = r.nextInt(4);
            Card c = new Card();
           
            c.setValue(value);
            c.setSuit(Card.SUITS[suits]);
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
            // this code is hardcoded lucky card
        int a = 5;
        
        int b= 2;
        Card cb=new Card();
       cb.setValue(a);
       cb.setSuit(Card.SUITS[b]);
       int c=0;
       for (int i=0; i<magicHand.length; i++){
           if(cb.getSuit() == magicHand[i].getSuit() )
           {
               if(cb.getValue()== magicHand[i].getValue())
                    System.out.print("You Win");
           }}
       System.out.print("You lose");
       }
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
    
}
