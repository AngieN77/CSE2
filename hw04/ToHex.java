// Angela Nguyen
// February 19, 2016
// CSE 2 - Prof. Brian Chen
// ToHex Java Program

// Purpose: Converting decimal RGB values (three inputs) to hexadecimal

import java.util.Scanner;                           // Import the Scanner into Java

public class ToHex {
    public static void main (String[] args) {
        Scanner RGB;                                // Declare an instance of Scanner
        RGB = new Scanner (System.in);              // Construst the instance named RGB
        // Declare and initialize future String variables needed in if statements
        String hexa1 = " ";        String hexa2 = " ";
        String hexa3 = " ";        String hexa4 = " ";
        String hexa5 = " ";        String hexa6 = " ";
        // Declare and initialize future integer variables for if statements
        int value1, value2, value3, remainder1, remainder2, remainder3 = 0;
        int number1 = 0;    int number2 = 0;    int number3 = 0; 
        // Ask the user for three RGB values
        System.out.print ("Please enter three numbers representing RGB values with spaces in between: ");
        if (RGB.hasNextInt()) {
            number1 = RGB.nextInt();                                                                            // Assign the first input value as number1   
            if (number1 >= 0 && number1 <= 255) {                                                               // Check to see if number1 is within 0 - 255
            value1 = (number1 / 16);                                                                            // Divide number1 by 16 and store as value1
            remainder1 = number1 % 16;                                                                          // Divide number1 by 16 but store the remainder as remainder1
            switch (value1) {                                                                                   // Switch statement for value1
                case 10:                                                                                        // If value1 = 10, 
                    hexa1 = "A";                                                                                // then set hexa1 as A               
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (value1)
                    hexa1 = "B";
                    break;                                                  
                case 12:
                    hexa1 = "C";
                    break;
                case 13:
                    hexa1 = "D";
                    break;
                case 14:
                    hexa1 = "E";
                    break;
                case 15:
                    hexa1 = "F";
                    break;
                default:                                                                                        // If value1 does not equal 10, 11, 12, 13, 14, 15,
                    hexa1 = Integer.toString(value1);                                                           // then set hexa1 as value1
                    break;                                                                                      // Leave the switch statements
            }
            switch (remainder1) {                                                                               // Switch statement for remainder1
                case 10:                                                                                        // If remainder1 = 10
                    hexa2 = "A";                                                                                // then set hexa2 as A
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (remainder1)
                    hexa2 = "B";
                    break;
                case 12:
                    hexa2 = "C";
                    break;
                case 13:
                    hexa2 = "D";
                    break;
                case 14:
                    hexa2 = "E";
                    break;
                case 15:
                    hexa2 = "F";
                    break;
                default:                                                                                        // If remainder1 does not equal 10, 11, 12, 13, 14, 15
                    hexa2 = Integer.toString(remainder1);                                                       // then set hexa2 as remainder1
                    break;                                                                                      // Leave the switch statements    
            }
        }
        else {
            System.out.println ("Your first value does not lie in the range of 0 - 255. Please try again.");    // Print out an error if number1 is not between 0 - 255
            return; 
        }
        }
        else {
            System.out.println ("Your first value is not a valid integer. Please try again.");                  // Print out an error if first input is not n integer
            return;
        }
        
         if (RGB.hasNextInt()) {
            number2 = RGB.nextInt();                                                                            // Assign the first input value as number2
            if (number2 >= 0 && number2 <= 255) {                                                               // Check to see if number2 is within 0 - 255
            value2 = (number2 / 16);                                                                            // Divide number2 by 16 and store as value2
            remainder2 = number2 % 16;                                                                          // Divide number2   by 16 but store the remainder as remainder2
            switch (value2) {                                                                                   // Switch statement for value2
                case 10:                                                                                        // If value2 = 10, 
                    hexa3 = "A";                                                                                // then set hexa3 as A               
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (value2)
                    hexa3 = "B";
                    break;                                                  
                case 12:
                    hexa3 = "C";
                    break;
                case 13:
                    hexa3 = "D";
                    break;
                case 14:
                    hexa3 = "E";
                    break;
                case 15:
                    hexa3 = "F";
                    break;
                default:                                                                                        // If value2 does not equal 10, 11, 12, 13, 14, 15,
                    hexa3 = Integer.toString(value2);                                                           // then set hexa3 as value2
                    break;                                                                                      // Leave the switch statements
            }
            switch (remainder2) {                                                                               // Switch statement for remainder1
                case 10:                                                                                        // If remainder2 = 10
                    hexa4 = "A";                                                                                // then set hexa4 as A
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (remainder2)
                    hexa4 = "B";
                    break;
                case 12:
                    hexa4 = "C";
                    break;
                case 13:
                    hexa4 = "D";
                    break;
                case 14:
                    hexa4 = "E";
                    break;
                case 15:
                    hexa4 = "F";
                    break;
                default:                                                                                         // If remainder2 does not equal 10, 11, 12, 13, 14, 15
                    hexa4 = Integer.toString(remainder2);                                                        // then set hexa4 as remainder2
                    break;                                                                                       // Leave the switch statements
            }  
        }
        else {
            System.out.println ("Your second value does not lie in the range of 0 - 255. Please try again.");    // Print out an error if number2 is not between 0 - 255
            return; 
        }
        }
        else {
            System.out.println ("Your second value is not a valid integer. Please try again.");                 // Print out an error if second input is not an integer
            return;
        }
        
         if (RGB.hasNextInt()) {
            number3 = RGB.nextInt();                                                                            // Assign the third input value as number3   
            if (number3 >= 0 && number3 <= 255) {                                                               // Check to see if number3 is within 0 - 255
            value3 = (number3 / 16);                                                                            // Divide number3 by 16 and store as value3
            remainder3 = number3 % 16;                                                                          // Divide number3 by 16 but store the remainder as remainder3
            switch (value3) {                                                                                   // Switch statement for value3
                case 10:                                                                                        // If value3 = 10, 
                    hexa5 = "A";                                                                                // then set hexa5 as A               
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (value3)
                    hexa5 = "B";
                    break;                                                  
                case 12:
                    hexa5 = "C";
                    break;
                case 13:
                    hexa5 = "D";
                    break;
                case 14:
                    hexa5 = "E";
                    break;
                case 15:
                    hexa5 = "F";
                    break;
                default:                                                                                        // If value3 does not equal 10, 11, 12, 13, 14, 15,
                    hexa5 = Integer.toString(value3);                                                           // then set hexa5 as value3
                    break;                                                                                      // Leave the switch statements
            }
            switch (remainder3) {                                                                               // Switch statement for remainder3
                case 10:                                                                                        // If remainder3 = 10
                    hexa6 = "A";                                                                                // then set hexa6 as A
                    break;                                                                                      // Leave the switch statement
                case 11:                                                                                        // And repeat for the rest of switch (remainder1)
                    hexa6 = "B";
                    break;
                case 12:
                    hexa6 = "C";
                    break;
                case 13:
                    hexa6 = "D";
                    break;
                case 14:
                    hexa6 = "E";
                    break;
                case 15:
                    hexa6 = "F";
                    break;
                default:                                                                                        // If remainder3 does not equal 10, 11, 12, 13, 14, 15
                   hexa6 = Integer.toString(remainder3);                                                        // then set hexa6 as remainder3
                    break;                                                                                      // Leave the switch statements
            }
        }
        else {
            System.out.println ("Your third value does not lie in the range of 0 - 255. Please try again.");    // Print out an error if number1 is not between 0 - 255
            return; 
        }
        }
        else {
            System.out.println ("Your third value is not a valid integer. Please try again.");                  // Print out an error if third input is not an integer
            return;
        }
        // Print out the statement stating the converted hexadecimal 
        System.out.println ("The decimal numbers R: " + number1 + ", G: " + number2 + ", B: " + number3 + " are represented in hexadecimal as: " + hexa1 + hexa2 + hexa3 + hexa4 + hexa5 + hexa6);
    }
}