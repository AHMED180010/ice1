package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Ahmed Qazi Jan 31, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue;
            card.setSuit;
            random.nextInt(n);
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
		
        Card countArray = new Card[7];
        
        countArray[0] value = 1;
        countArray[0] suits = spades;
        
        countArray[1] value = 2;
        countArray[1] suits = hearts;
        
        countArray[2] value = 3;
        countArray[2] suits = diamonds;
        
        countArray[3] value = 4;
        countArray[3] suits = clubs;
        
        countArray[4] value = 5;
        countArray[4] suits = news;
        
        countArray[5] value = 6;
        countArray[5] suits = cues;
      
        countArray[6] value = 7;
        countArray[6] suits = news;
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        printInfo();
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Ahmed Qazi Jan 31, 2023 
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ahmed, I like to play badminton. I am a student at sheridan college. I am studying computer science");
        
    
    }

}