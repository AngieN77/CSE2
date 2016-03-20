// Angela Nguyen
// March 18, 2016
// CSE 2 - Prof. Brian Chen
// Twisty Java Program

// Purpose: Write a program asking for the length and width
//          Length - How many characters the pattern should 
//                   spread horizontally across the screen
//          Width - How many characters the pattern should
//                  spread vertically across the screen

import java.util.Scanner;                                                               // Import the Scanner class 

public class Twisty {
    public static void main(String[] args) {
        Scanner dimension;                                                              // Declare an instance of the class named dimension
                                                                                        // Declaring and intializing variables for future use
        int length;                                                             
        int width;
        int line = 0;
        int counter = 1;
        int blockType = 1;
        int startBlock = 1;
        int endBlock;
        int remainder;
        int counterBlock = 1;

        while (true) {                                                                  // While loop --> Asking for length of twist
            dimension = new Scanner(System.in);                                         // Construct an instance of the Scanner dimension
            System.out.print("Enter length of twist as an integer less than 80: ");     // Ask the user for input
            if (dimension.hasNextInt()) {                                               // Check if input is an integer
                length = dimension.nextInt();                                           // Input is integer --> Assign input as length
                if (length <= 80) {                                                     // Check if length is less than 80
                    break;                                                              // Length less than 80 --> Exit the while loop
                }
                else {                                                                  // Input was not less than 80
                    System.out.print ("The value entered was not less than 80. ");      // Print out statements
                    System.out.println ("Please try again.");
                }                                                                       // Reset while loop to ask again
            }   
            else {                                                                      // Input was not an integer
                System.out.print ("The value entered is not an integer. ");             // Print out statements
                System.out.println ("Please try again.");
            }                                                                           // Reset while loop to ask again
        }
        while (true) {                                                                  // While loop --> Asking for width of twist
            dimension = new Scanner(System.in);                                         // Construct an instance of the Scanner dimension
            System.out.print("Enter width of twist as an integer less ");               // Ask the user for input
            System.out.print ("than entered length: ");
            if (dimension.hasNextInt()) {                                               // Check if input is an integer
                width = dimension.nextInt();                                            // Input is integer --> Assign input as width
                if (width < length) {                                                   // Check if width is less than length
                    endBlock = width;                                                   // Width less than length --> Assign endblock with width
                    break;                                                              // Width less than length --> Exit while loop
                }   
                else {                                                                  // Input was not less than length
                    System.out.print ("The value entered is not less than  given length."); // Print out statements
                    System.out.println (" Please try again.");                          
                }                                                                       // Reset while loop to ask again
            }
            else {                                                                      // Input was not an integer
                System.out.print ("The value entered is not an integer. ");             // Print out statements
                System.out.println ("Please try again.");
            }                                                                           // Reset while loop to ask again
        }
        while (line < width) {                                                          // While loop --> Keeps track of # of lines printed
            while (counter <= length) {                                                 // While loop --> Keeps track of # of characters printed
                if (counterBlock == startBlock && counterBlock != endBlock) {           // Check if counterBlock is equal to startBlock and counterBlock is not equal to endBlock
                    if (blockType == 1) {                                               // Check if blockType is equal to 1
                        System.out.print("#");                                          // blockType equal to 1 --> Print out "#"
                    }
                    else {                                                              // blockType not equal to 1
                        System.out.print("\\");                                         // Print out "\\"
                    }
                }
                if (counterBlock == endBlock && counterBlock != startBlock) {           // Check if counterBlock is equal to endBlock and counterBlock is not equal to startBlock
                    if (blockType == 1) {                                               // Check if blockType is equal to 1    
                        System.out.print("/");                                          // blockType equal to 1 --> Print out "/"
                    }
                    else {                                                              // blockType not equal to 1
                        System.out.print("#");                                          // Print out "#"
                    }
                }
                if (counterBlock == startBlock && counterBlock == endBlock) {           // Check if counterBlock is equal to startBlock and equal to endBlock
                    if (blockType == 1) {                                               // Check if blockType equal to 1
                        System.out.print("#");                                          // Print out "#"
                    }   
                    else {                                                              // blockType not equal to 1
                        System.out.print("\\");                                         // Print out "\\"
                    }
                }
                if (counterBlock != startBlock && counterBlock != endBlock) {           // Check counterBlock is not equal to startBlock and is not equal to endBlock
                    System.out.print(" ");                                              // Print out a space
                }
                if (width % 2 == 1) {                                                   // Check if the width is odd
                    if (counterBlock == endBlock && line <= (width / 2)) {              // Check if counterBlock is equal to endBlock and line is less than or equal to width/2
                        blockType *= -1;                                                // Flip the parity of blockType
                    }
                    if (counterBlock == startBlock && line > (width / 2)) {             // Check if counterBlock is equal to startBlock and line is greater than width/2
                        blockType *= -1;                                                // Flip the parity of blockType
                    }
                }
                if (width % 2 == 0) {                                                   // Check if width is even
                    if (counterBlock == endBlock && line < (width / 2)) {               // Check if counterBlock is equal to endBlock and line is less than width/2
                        blockType *= -1;                                                // Flip the parity of blockType
                    }
                    if (counterBlock == startBlock && line >= (width / 2)) {            // Check if counterBlock is equal to startBlock and line is greater than or equal to width/2
                        blockType *= -1;                                                // Flip the parity of blockType
                    }
                }
                counter++;                                                              // Increment counter by 1
                counterBlock++;                                                         // Increment counterBlock by 1
                if (counterBlock > width) {                                             // Check if counterBlock is greater than width
                    counterBlock = 1;                                                   // counterBlock greater than width --> Reset counterBlock to 1
                }
            }                                                                           // Reset variables for the next line of twist
            counter = 1;                                                
            counterBlock = 1;
            blockType = 1;
            startBlock++;                                                               // Increment startBlock by 1 to account for extra space                   
            endBlock--;                                                                 // Decrement endBlock by 1 to accound for extra space
            line++;                                                                     // Increment line by 1
            System.out.println(" ");                                                    // Begin next line
        }
    }
}