/*
 * Name: Gopika Kalathiya
 * Student ID: 991659883
 */
package cardtrickice1;

/** define card value and suits
 * @author Gopika Kalathiya
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = {"diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
    
   //number
    
    public int cardNumber(){
        int num = (int)(1 + Math.random()*13);
        return num;
    }
    
    //suits
    
    public String suits(){
        int suitIndex = (int)(Math.random()*4); 
        for(int i=0;i<SUITS.length;i++){
            if(i == suitIndex){
                return SUITS[i];
            }
        }
        return null;
    }
    
    public String toString(){
        return value + " " + suits; 
    }
}
