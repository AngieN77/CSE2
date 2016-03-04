// Angela Nguyen
// March 4, 2016
// CSE 2 - Prof. Brian Chen
// Fibonacci Java Program

// Purpose: Ask the user for three postive integers
//          Input wrong --> Ask again in while loop
//          First two integers be first two numbers in sequence
//          Third number be number of integers to be printed
//          Separate the numbers with a comma but the last one should have period

import java.util.Scanner;                                                       // Import Scanner class

public class Fibonacci {
    public static void main (String[] args) {
        Scanner numbers;                                                        // Declare instance of Scanner named numbers
        
        boolean question = false;                                               // Declare and initialize boolean called question for use in while loop
        int number1 = 0, number2 = 0, number3 = 0, terms = 0;                   // Declare and initialize needed variable for future use
        int counter = 2;                                                        // Declare and initialize counter equal to 2 for first two input terms
        
        while (question == false) {                                                     // Run while loop while question is equal to false
            numbers = new Scanner (System.in);                                          // Construct instance of Scanner named numbers
            System.out.print ("Enter the FIRST number in your Fibonacci sequence: ");   // Ask user for first number in sequence
            if (numbers.hasNextInt()) {                                                 // Check to see if input is an integer
                number1 = numbers.nextInt();                                            // Assign input to variable number1
                if (number1 > 0) {                                                      // Check to see if number1 is postive
                    question = true;                                                    // Change boolean to false --> Stop while loop
                }
            }
        }
        
        question = false;                                                               // Reset boolean variable to false for next while loop
         while (question == false) {                                                    // Run while loop while question is equal to false
            numbers = new Scanner (System.in);                                          // Construct instance of Scanner named numbers
            System.out.print ("Enter the SECOND number in your Fibonacci sequence: ");  // Ask user for second number in sequence
            if (numbers.hasNextInt()) {                                                 // Check to see if input is an integer
                number2 = numbers.nextInt();                                            // Assign input to variable number2
                if (number2 > 0) {                                                      // Check to see if number2 is postive
                    question = true;                                                    // Change boolean to false --> Stop  while loop
                }
            }
        }
        
        question = false;                                                                               // Reset boolean variable to false for next while loop
         while (question == false) {                                                                    // Run while loop while question is equal to false
            numbers = new Scanner (System.in);                                                          // Construct instance of Scanner named numbers
            System.out.print ("Enter the number of terms to be printed in your Fibonacci sequence: ");  // Ask user for number of terms to be printed out
            if (numbers.hasNextInt()) {                                                                 // Check to see if input is an integer
                terms = numbers.nextInt();                                                              // Assign input to variable terms
                if (terms > 0) {                                                                        // Check to see if terms is postive
                    question = true;                                                                    // Change boolean to false --> Stop while loop
                }
            }
        }
        
        System.out.print ("Your custom Fibonacci sequence is: " + number1 + ", " + number2 + ", ");     // Print out beginning of sequence
        while (counter <= terms) {                                                                      // Run while loop while counter is less than number or equal 
                                                                                                        // to number terms to be printed
            number3 = number1 + number2;                                                                // Add first and second numbers to get next term in sequence    
            System.out.print (number3);                                                                 // Print out next term (number3)
            number1 = number2;                                                                          // Assign value of number2 to be value of number1
            number2 = number3;                                                                          // Assign value of number3 to be value of number2
            counter++;                                                                                  // Increment the counter to account for addition of new tern
            if (counter == terms) {                                                                     // Check to see if counter is equal to number of terms desired
                System.out.println (".");                                                               // Print out a period to end the sequence
                break;                                                                                  // Exit while loop
            }       
            else {                                                                                      // If counter does not equal the number of terms desired
                System.out.print (", ");                                                                // Print out a comma and continue in the while loop
            }
        }
    }
}