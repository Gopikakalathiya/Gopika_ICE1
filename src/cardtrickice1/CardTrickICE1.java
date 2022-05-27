/*
 * Name: Gopika Kalathiya
 * Student ID: 991659883
 */
package cardtrickice1;

import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 * 
 * 
 * @author Gopika Kalathiya
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuits("spades");
        magicHand[0] = luckyCard;
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();//adding one luckycard
            c1.setValue(c1.cardNumber());//use a method to generate random *13
            c1.setSuits(c1.suits());//random method suit 
            magicHand[i]=c1;
        }
       
        for(int i=0;i<magicHand.length;i++)
            System.out.println(magicHand[i]);
        
        
        //Take input from scanner
        
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt();
        String suitName = sc.next();
             
        
        //step 3: match with array
        
       linearSearch(magicHand,cardNum,suitName);
    }
    
    public static void linearSearch(Card[] list,int numKey,String suitKey){
        for (Card list1 : list) {
            if (numKey == list1.getValue()) {
                if (suitKey.equals(list1.getSuits())) {
                    System.out.println("card found");
                    break;
                }
            }
        }
    }
}
