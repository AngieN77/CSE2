// Angela Nguyen
// March 4, 2016
// CSE 2 - Prof. Brian Chen
// Twist Generator Java Program

// Purpose: Get familiar with loops by printing out a simple "twist"

import java.util.Scanner;                                                       // Import scanner class

public class TwistGenerator {
    public static void main (String[] args) {
        Scanner length;                                                         // Declare an instance of scanner named length
        
        int twistLength = 0;                                                    // Declare and initialize integer variables to be used in later loops
        int counterTwist = 0;
        int counterExtra = 0;
        int twist = 0;
        int extra = 0;
        boolean answer = false;                                                 // Declare and initialize startng condition for while loop with boolean answer equal to false
        
        while (answer == false) {                                               // Run while loop while answer is set to false
            length = new Scanner (System.in);                                   // Construct an instance of scanner named length
            System.out.print ("Please enter the desired length of the twist (must be a positive integer): ");   // Ask user for a desired length for twist
            if (length.hasNextInt()) {                                          // Checks to see if input is an integer
                twistLength = length.nextInt();                                 // Assign value into variable twistLength
                if (twistLength > 0) {                                          // Checks to see if input is positive
                    answer = true;                                              // Changes boolean to false --> stops while loop repeating
                    twist = twistLength / 3;                                    // Divide input by 3 to determine how many full iterations will there be
                    extra = twistLength % 3;                                    // Divide input by 3 but keep only remainder to determine how many extra pieces to be added
                }
            }
        }
        while (counterTwist < twist) {                                          // Prints out top line of twist in groups of three when counterTwist is less than twist
            System.out.print ("\\");
            System.out.print (" ");
            System.out.print ("/");
            counterTwist++;                                                     // Increment counterTwist each time a group of three is printed
        }
        switch (extra) {                                                        // Prints out extra pieces if length is not divisible by 3
            case 1:                                                             // Prints out one more column when remainder/extra equals 1
                System.out.print ("\\");
                break;
            case 2:                                                             // Prints out two more columns when remainder/extra equals 2
                System.out.print ("\\ ");
                System.out.print (" /");
                break;
            default:                                                            // Prints out nothing extra if remainder/extra equals 0
                break;
        }
        System.out.println ("");                                                // Starts next line of twist
        counterTwist = 0;                                                       // Resets counterTwist back to 0
        while (counterTwist < twist) {                                          // Prints out middle line in groups of three when counterTwist is less than twist
            System.out.print (" ");
            System.out.print ("X");
            System.out.print (" ");
            counterTwist++;                                                     // Incrment counterTwist each time a group of three is printed
        }
        switch (extra) {                                                        // Prints out extra pieces if length is not divisible by 3
            case 1:                                                             // Prints out one more column when remainder/extra equals 1
                System.out.print (" ");
                break;
            case 2:                                                             // Prints out two more columns when remainder/extra equals 2
                System.out.print (" ");
                System.out.print ("X");
                break;
            default:                                                            // Prints out nothing extra if remainder/extra equals 0
                break;
        }
        System.out.println ("");                                                // Starts next line of twist
        counterTwist = 0;                                                       // Resets counterTwist back to 0 
        while (counterTwist < twist) {                                          // Prints out bottom line in groups of three whne counterTwist is less than twist
            System.out.print ("/");
            System.out.print (" ");
            System.out.print ("\\");
            counterTwist++;                                                     // Increment counterTwist each time a group of three is printed
        }
        switch (extra) {                                                        // Prints out extra pieces if length is not divisible by 3
            case 1:                                                             // Prints out one more column when remainder/extra equals 1
                System.out.print ("/");
                break;
            case 2:                                                             // Prints out two more columns when remainder/extra equals 2
                System.out.print ("/");
                System.out.print (" ");
                break;
            default:                                                            // Prints out nothing extra if remainder/extra equals 0
                break;
        }
        System.out.println ("");
    }
}