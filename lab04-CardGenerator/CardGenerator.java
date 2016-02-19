// Angela Nguyen// Angela Nguyen
// February 19, 2016
// CSE 2 - Prof. Brian Chen
// Card Generator Java Program

// Purpose: Pick a random card from the deck by using a random number generator
//          Each number represents one card [1,52]
//          Suits are grouped, i.e. 1-13 represent diamonds
//          Caid identities ascend in step with card number

import java.util.Random;                                                                            // Import the Random method into Java

public class CardGenerator {
    public static void main (String[] args) {               
        
        String cardSuit;                                                                            // Declare a String variable named cardSuit for the suit of the card
        int cardFace;                                                                               // Declare an integer variable for the card face
        int cardNumber = (int) (Math.random() * 52 + 1);                                            // Allow the random method to choose a number between 1 and 52
        
        if (cardNumber >= 1 && cardNumber <=13) {                                                   // Assigns cardSuit to Diamonds if the number is between 1 and 13
            cardSuit = "Diamonds";
            cardFace = (int) cardNumber % 13;                                                       // Determines the cardFace by determining the remainder of card suit divided by 13
            switch (cardFace) {
                case 1:
                    System.out.println ("You picked the Ace of " + cardSuit + ".");                 // Prints out statement for Ace of Diamonds if the remainder is 1
                    break;
                case 11:
                    System.out.println ("You picked the Jack of " + cardSuit + ".");                // Prints out statement for Jack of Diamonds if the remainder is 11
                    break;
                case 12:
                    System.out.println ("You picked the Queen of " + cardSuit + ".");               // Prints out statement for Queen of Diamonds if the remainder is 12
                    break;
                case 0:
                    System.out.println ("You picked the King of " + cardSuit + ".");                // Prints out statement for King of Diamonds if the remainder is 13
                    break;
                default:                                                                            // Prints the general statement for a number value card with its corresponding suit
                    System.out.println ("You picked the " + cardFace + " of " + cardSuit + ".");
                    break;
            }
        }
        
        if (cardNumber >= 14 && cardNumber <= 26) {                                                 // Assigns cardSuit to Clubs if the number is between 14 and 26
           cardSuit = "Clubs";
           cardFace = (int) cardNumber % 13;
           switch (cardFace) {
                case 1:
                    System.out.println ("You picked the Ace of " + cardSuit + ".");                 // Prints out statement for the Ace of Clubs if the remainder is 1
                    break;
                case 11:
                    System.out.println ("You picked the Jack of " + cardSuit + ".");                // Prints out statement fo Jack of Clubs if the remainder is 11
                    break;
                case 12:
                    System.out.println ("You picked the Queen of " + cardSuit + ".");               // Prints out statement for Clubs of Clubs if the remainder is 12
                    break;
                case 0:
                    System.out.println ("You picked the King of " + cardSuit + ".");                // Prints out statement for King of Clubs if the remainder is 13
                    break;
                default:                                                                            // Prints the general statement for a number value card with its corresponding suit
                    System.out.println ("You picked the " + cardFace + " of " + cardSuit + ".");
                    break;
            }
        }
        
        if (cardNumber >= 27 && cardNumber <= 39) {                                                 // Assigns cardSuit to Hearts if the number is between 27 and 39
           cardSuit = "Hearts";             
           cardFace = (int) cardNumber % 13;                                                        // Determines the cardFace by determining the remainder of card suit divided by 13
           switch (cardFace) {
                case 1:
                    System.out.println ("You picked the Ace of " + cardSuit + ".");                 // Prints out statement for Ace of Hearts if the remainder is 1
                    break;
                case 11:
                    System.out.println ("You picked the Jack of " + cardSuit + ".");                // Prints out statement for Jack of Hearts if the remainder is 11
                    break;
                case 12:
                    System.out.println ("You picked the Queen of " + cardSuit + ".");               // Prints out statement for Clubs of Hearts if the remainder is 12
                    break;
                case 0:
                    System.out.println ("You picked the King of " + cardSuit + ".");                // Prints out statement for King of Hearts if the remainder is 13
                    break;
                default:                                                                            // Prints the general statement for a number value card with its corresponding suit
                    System.out.println ("You picked the " + cardFace + " of " + cardSuit + ".");
                    break;
            }
        }
        
        if (cardNumber >= 40 && cardNumber <= 52) {                                                 // Assigns cardSuit to Spades if the number is between 40 and 52
           cardSuit = "Spades";
           cardFace = (int) cardNumber % 13;                                                        // Determines the cardFace by determining the remainder of card suit divided by 13
           switch (cardFace) {
                case 1:
                    System.out.println ("You picked the Ace of " + cardSuit + ".");                 // Prints out statement for Ace of Spades if the remainder is 1
                    break;
                case 11:
                    System.out.println ("You picked the Jack of " + cardSuit + ".");                // Prints out statement for Jack of Spades if the remainder is 11
                    break;
                case 12:
                    System.out.println ("You picked the Queen of " + cardSuit + ".");               // Prints out statement for Clubs of Spades if the remainder is 12
                    break;
                case 0:
                    System.out.println ("You picked the King of " + cardSuit + ".");                // Prints out statement for King of Spades if the remainder is 13
                    break;
                default:                                                                            // Prints the general statement for a number value card with its corresponding suit
                    System.out.println ("You picked the " + cardFace + " of " + cardSuit + ".");
                    break;
            }
        }
    }
}
