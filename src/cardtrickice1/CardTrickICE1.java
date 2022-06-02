/*
*MODIFIER : AAYUSHI PATEL
*STUDENT ID NUMBER : 991653891
 */
package cardtrickice1;

import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         
        Card[] magicHand = new Card[7];
        Random select = new Random();
        magicHand[i] = a;
        a.setValue(select.nextInt());
        a.setSuit(select.nextInt(4));
       
        
        
        }
     Card inputCard = new card();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the suit of the card : ");
       Suits = sc.next();
       
        for(int = 0; int<magicHand.lenght ; i++){
        if (magicHand[i].getValue == inputCard.getValue() & magicHand[i].getSuit== inputcard.getSuit() )
         
         System.out.println("User card found in magic hand");
            else
           System.out.println("User card not found in magic hand");
  }
          Card luckyCard = new Card();
           luckyCard.setValue(5);
           luckyCard.setSuit(Card.SUITS[2]);
  
    for(int = 0; int<magicHand.lenght ; i++)
	  if (magicHand[i].getValue == luckyCard.getValue() & magicHand[i].getSuit()==userCard.getSuit())
  
            System.out.println("Lucky card found in magic hand");
            else
            System.out.println("Lucky card not found in magic hand");
  }
  }
          
       
       
       
       
        
    

