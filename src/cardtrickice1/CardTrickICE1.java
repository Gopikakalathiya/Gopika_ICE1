/*
 * Name: Gopika Kalathiya
 * Student ID: 991659883
 */
package cardtrickice1;

import java.util.Scanner;

/** 
 * @author Gopika Kalathiya
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[8]; //Array of object
        
        //adding one luckycard
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuits("spades");
        magicHand[0] = luckyCard;
       
        //create random cards
        for( int i=1;i<magicHand.length;i++)
        {
            Card c1 = new Card();//adding one luckycard
            c1.setValue(c1.cardNumber());//use a method to generate random *13
            c1.setSuits(c1.suits());//random method suit 
            magicHand[i]=c1;
        }
    
        //printing deck of 7 cards
        for(int i=0;i<magicHand.length;i++)
            System.out.println(magicHand[i]);
        
        
        //Take input from scanner
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose any number between 1 to 13:: ");
        int cardNum = sc.nextInt();
        System.out.println("PLease choose the suit:: \nhearts \nspades \ndiamonds \nclubs");
        String suitName = sc.next();
           
        
        //match with array
        
        linearSearch(magicHand,cardNum,suitName);
    }
    
    public static void linearSearch(Card[] list,int numKey,String suitKey){
        for (Card list1 : list) {
            if (numKey == list1.getValue()) {
                if (suitKey.equals(list1.getSuits())) {
                    System.out.println("card found");
                    break;
                }
                else{
                    System.out.println("Card not found");
                }
            }
        }
    }
}
