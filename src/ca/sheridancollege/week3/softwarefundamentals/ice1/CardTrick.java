/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 modifier Chintan
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
       
        int num = 8;
        String col = "Heart";
        int ii;
        int v,hp;
        Card[] magicHand = new Card[7];
        Card c = new Card();
        int[] va= new int[7];
        String[] mg = new String[7];
        for (int i=0; i<magicHand.length; i++)
        {   
            v=(int)(1+Math.random()*13);
             c.setValue(v);
             va[i]=c.getValue();
             //System.out.println(v);
             hp=(int)(Math.random()*3);
             c.setSuit(Card.SUITS[hp]);
             mg[i]=c.getSuit();
             System.out.println("number:"+v+"color"+mg[i]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        int isvalue=0;
        for(int i=0;i<va.length;i++)
        {
            if(num==va[i])
            {
                isvalue=1;
                break;
            }
            
        }
        /*if(isvalue)
            System.out.println("match found");
       else
            System.out.println("not found");
        */
        int isvalid=0;
        for(int i=0;i<mg.length;i++)
        {
            if(col.equals(mg[i]))
            {
                isvalid=1;
                break;
            }
        }
        /*if(isvalid)
            System.out.println("match found");
        else
            System.out.println("match not found");
        */
        if(isvalid==1 && isvalue==1)
        {
                System.out.println("match found");               
        }
        else
            System.out.println("match not found");

        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
