// Angela Nguyen
// March 25, 2016
// Professor Brian Chen
// Games Java Program

// Purpose: Design an arcade consisting of guessTheBox, spinTheWheel, scrambler

//          guessTheBox: Choose 1, 2, or 3 and one will randomly hold a prize

//          spinTheWheel: Half will be red consisting of 1-5 and half will be 
//          black consisting of 1-5; User randomly selects a color and number;
//          Wheel is spun and program prints out result and if they win or not

//          scrambler: Generate word scramble puzzle by accepting a word from
//          user and scrambling letters before returning

import java.util.Scanner;                                                       // Import the needed classes for future use
import java.util.Random;

public class Games {

    public static void guessTheBox() {                                          // Method for Guess the Box game
        int number = 1;                                                         // Declare and initialize the default choice to be 1
        while (true) {                                                          // While loop --> Ask user for choice of box
            Scanner decision = new Scanner(System.in);                          // Declare and construct an instance of Scanner named decision
            System.out.print("Please choose a number between 1-3 inclusive: "); // Ask the user for an input between [1,3]

            if (decision.hasNextInt()) {                                        // Check if the input is an integer
                number = decision.nextInt();                                    // Input is integer --> Assign input as number
                if (number >= 1 && number <= 3) {                               // Check if number is between 1-3 inclusive
                    break;                                                      // number between 1-3 --> Exit while loop
                }
                else {                                                          // Input is not between 1-3
                    System.out.print ("The number you have chosen is not in");  // Print out statements
                    System.out.println ("the given range. Please try again.");
                }
            }
            else {                                                              // Input is not an integer
                System.out.print ("The input was not an integer. ");            // Print out statements
                System.out.println ("Please try again.");
            }
        }
        System.out.println("You have chosen box number " + number + ". \n");    // Print out statement declaring which box was picked
        
        Random boxPrize = new Random();                                         // Declare and construct an instance of Random nmed boxPrize
        int prize = boxPrize.nextInt(2);                                        // Declare and initialize an integer variable named prize with a number between 0-2
        prize++;                                                                // Increment prize by 1 to make prize to be with [1,3]
        System.out.println("The prize was located under box " + prize + ". \n");// Print out where the prize was located
        if (number == prize) {                                                  // Check to see if prize is same as number chosen
            System.out.println("You have correctly guessed the right box! ");   // Print out statements 
            System.out.println ("Congratulations! \n");
        }
        else {                                                                  // number is not equal to prize
            System.out.print ("Sorry. You have incorrectly guessed the right"); // Print out statments
            System.out.println (" box. Please come again. \n");
        }
    }
    public static void spinTheWheel() {                                         // Method for Spin the Wheel Game
        String color = "red", colorPrize = "black";                             // Declare and initialize default color and colorPrize for game
        int number = 1, numberPrize = 1;                                        // Declare and initialize default number and numberPrize for game

        while (true) {                                                          // While loop --> Ask user for color choice
            Scanner decision = new Scanner(System.in);                          // Declare and initialize an instance of Scanner named decision

            System.out.print("Please choose a color (Red/Black): ");            // Ask user for an input of color
            color = decision.next();                                            // Assign input to variable color
            if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("black")) { // Check if input is equal to "red" or "black" ignoring any uppercase
                System.out.println("You have chosen the color " + color + "."); // Print out what color was chosen by user
                break;                                                          // Exit while loop
            }
            else {                                                              // Input was neither "red" nor "black"
                System.out.print ("You have not chosen one of the given ");     // Print out statements
                System.out.println ("colors. Please try again.");
            }
        }

        while (true) {                                                          // While loop --> Ask user for number decision
            Scanner decision = new Scanner(System.in);                          // Declare and initiallize an instance of Scanner named decision

            System.out.print("Please choose a number between 1-5 inclusive:  ");// Ask user for a number between [1,5]
            if (decision.hasNextInt()) {                                        // Check if input is an integer
                number = decision.nextInt();                                    // Input is an integer --> Assign value as number
                if (number >= 1 && number <= 5) {                               // Check if number is betwee [1,5]
                    System.out.println("You have chosen the number " + number + ". \n"); // Print out statement of number chosen
                    break;                                                      // Exit while loop
                }   
                else {                                                          // number is not between [1,5]   
                    System.out.print ("The number you have chosen was not ");   // Print out statements
                    System.out.println ("between 1-5 inclusive. Please try again.");
                    continue;
                }
            }
        }

        System.out.println("The wheel will now be spun. \n");                   // Print out statement

        Random prize = new Random();                                            // Declare and initialize an instance of Random named prize
        int prizeColor = prize.nextInt(2);                                          // Declare and initialize an integer variable named prizeColor with a number between 0-2
        switch (prizeColor) {                                                   // Switch statement --> Translate number chosen with a color
            case 0:                                                             // prizeColor = 0
                colorPrize = "Red";                                             // colorPrize is red
                break;                                                          // Exit switch statement
            case 1:                                                             // colorPrize = 1
                colorPrize = "Black";                                           // colorPrize is black
                break;                                                          // Exit switch statement
        }
        numberPrize = prize.nextInt(4);                                         // Assign random integer between 0-4 as numberPrize
        numberPrize++;                                                          // Increment numberPrize by 1 to accomodate for prize range

        System.out.println("The winning color of the space is " + colorPrize + "."); // Print out statements for which color and number combination has the prize
        System.out.println("The winning number of the space is " + numberPrize + ". \n");

        if (color.equals(colorPrize) && number == numberPrize) {                // Check if user choices matched randomly generated color and number
            System.out.print ("Congratulations! You have chosen the correct ");// Print out statements
            System.out.println ("combination of color and number! \n"); 
        }
        else {                                                                  // User choices do not match randomly generated color and number
            System.out.print ("Sorry. You have not chosen the correct ");       // Print out statements
            System.out.println ("combination of color and number. Please come again. \n");
        }
    }
    public static void scrambler() {
        
    }
    public static String continueArcade() {                                     // Method for asking whether to continue in arcade
        Scanner question = new Scanner(System.in);                              // Declare and construct an instance of Scanner named question
        String answer;                                                          // Declare string variable named answer

        System.out.print("Continue playing in game center? If yes, type in ");  // Ask user input to continue in game center or not
        System.out.println ("(Y/y). If not, type in anything else. ");
        answer = question.next();                                               // Assign input as answer

        return answer;                                                          // Return the input of answer back to main method
    }

    public static void main(String[] args) {
        String choice, result;                                                  // Declare string variables for future use
        System.out.println("Welcome to CSE2 game center! Please enjoy!  \n");   // Print out statement

        Scanner question;                                                       // Declare an instance of Scanner named question
        while (true) {                                                          // While loop --> Ask user for choice in game
            question = new Scanner(System.in);                                  // Construct instance of Scanner named question

            System.out.print ("Please choose from the following options by ");  // Ask user to input which game is to be played with no spaces
            System.out.print ("typing it with no spaces: Guess the Box, Spin ");
            System.out.println ("the Wheel, and Scrambler ");
            choice = question.next();                                           // Assign input as choice

            if (choice.equalsIgnoreCase("guessTheBox")) {                       // Check if choice is the same "guessTheBox" ignoring uppercase
                System.out.println("The Guess the Box game will now begin. \n");// Print out statement
                guessTheBox();                                                  // Call on guessTheBox method
            }           
            else if (choice.equalsIgnoreCase("spinTheWheel")) {                 // Check if choice is the same as "spinTheWheel" ignoring uppercase
                System.out.println("The Spin the Wheel game will now begin. \n");// Print out statement
                spinTheWheel();                                                 // Call on spinTheWheel method
            }             
            else if (choice.equalsIgnoreCase("scrambler")) {                    // Check if choice is the same as "scrambler" ignoring uppercase
                System.out.println("The Scrambler will now begin. \n");         // Print out statement
                scrambler();                                                    // Call on scrambler method
            }    
            else {                                                              // Chouce does not match any of the games
                System.out.print ("The chosen game cannot be identified. ");    // Print out statements
                System.out.println ("The game center will now close.");
                break;                                                          // Exit while loop and program
            }
            result = continueArcade();                                          // Retrieve value from continueArcade()
                if (result.equalsIgnoreCase("Y")) {                             // Check if result is equal to "y" ignoing case
                    System.out.println("You will now be prompted to choose another game. \n");  // Result is "y" or "Y" --> Print out statement
                }
                else {                                                          // Result is not "y" or "Y"
                    System.out.println("You have exited the game center.");     // Print out statement
                    break;                                                      // Exit while loop and program
                }
        }
    }
}