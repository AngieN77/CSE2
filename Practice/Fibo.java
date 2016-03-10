// Angela Nguyen
// March 4, 2016
// CSE 2 - Prof. Brian Chen
// Run Factorial Java Program

// Purpose: Use while loop to calculate factorials
//          Input only between [9, 16]
//          Calculate the factorial

import java.util.Scanner;                                                               // Import Scanner class

public class Fibo {                                 
    public static void main (String[] args) {
        Scanner integer;                                                                // Declare an instance of Scanner class named integer
        
        boolean number = false;                                                         // Declare and initialize boolean variable for use in while loop
        int value = 14, counter = 1, stop  = 14, value2 = 0;                                          // Declare and initialize variables for future use in variables
        
        /* while (number == false) {                                                       // Run while loop as long as number equals false
            integer = new Scanner (System.in);                                          // Construct instance of Scanner class
            System.out.print ("Please enter an integer between 9 and 16 inclusive: ");  // Ask user for input between 9 and 16
            if (integer.hasNextInt()) {                                                 // Check to see if input is an integer
                value = integer.nextInt();                                              // Assign  input as value of variable value
                if (value >= 9 && value <= 16) {                                        // Check to see if value is between [9, 16]
                    stop = value;                                                       // Assign value to stop
                    number = true;                                                      // Change boolean to false --> Stop  while loop
                }
            }
        }
        */
        while (counter < stop) {                                                        // Run while loop as long as counter is less than stop
            value2 = value * counter;                                                    // Multiply value by counter and assign to value
            System.out.println ("Multiplication: " + value + " * " + counter + " = " +  value2);
            value = value2;
            counter++;                                                                  // Increment counter to get next number value must be multiplied with
        }
        
        System.out.println ("The answer to " + stop + "! is " + value + ".");           // Print out what the factorial of the input is
    }
}


