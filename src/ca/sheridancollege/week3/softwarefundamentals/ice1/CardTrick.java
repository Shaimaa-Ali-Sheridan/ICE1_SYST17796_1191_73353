/*
 * @author Gurmandeep_Singh_Gill
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args)
    {

        Card[] magicHand = new Card[7];
     
        Card flipcard = new Card();
        flipcard.setValue(12);
        flipcard.setSuit("Hearts");
        
        Card c = new Card();
        for (int i=0; i<magicHand.length; i++)
        {
             c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(randomNumber());
            //System.out.println(c.getValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(randomName());
            System.out.println(c.getValue() +" "+ c.getSuit());
        }

     
        for(int i=0; i<magicHand.length; i++ )
        {
            if(c.getValue()==flipcard.getValue() && c.getSuit().equalsIgnoreCase(flipcard.getSuit()))
                System.out.print("Congratualition you won the game!");
            else
                System.out.print("Oops, you lost the game!");
        }
    }
    public static String randomName(){
        Random r=new Random();
        int x = r.nextInt(3);
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
