// Angela Nguyen
// March 28, 2016
// Professor Brian Chen
// Rectangularize Java Program

// Purpose: Overload two methods with the same name with return type void
//          One method --> Accepts integers
//                         Print out a square of % with length
//                         and width of number input
//          Other method --> Accepts strings
//                           Print out string same number of times as there are
//                              characters in string

import java.util.Scanner;                                                       // Import the Scanner class

public class Rectangularize {  
    public static void rectangle (int dimension) {                              // Method for printing out "%" with integer input
        char text = '%';                                                        // Declare and initialize char variable named text with '%'
        
        for (int i = 0; i < dimension; i++) {                                   // For loop --> Keeping track of lines until i = dimension
            for (int j = 0; j < dimension; j++) {                               // For loop --> Keeping track of how many characters printed until j = dimension
                System.out.print (text);                                        // Print out '%'
            }                                                                   // Increment j by 1
            System.out.println (" ");                                           // Begin a new line
        }                                                                       // Increment i by 1
    }
    public static void rectangle (String copy) {                                // Method for print out word inputted for how many lines
        int length = copy.length();                                             // Declare and initialize integer variable named length with the how many characters are in copy
        for (int i = 0; i < length; i++) {                                      // For loop --> Keeping track of how many lines printed until i = length
            System.out.println (copy);                                          // Print out word
        }                                                                       // Increment i by 1
    }
    
    public static void main (String[] args) {   
        Scanner input = new Scanner (System.in);                                // Declare and initialize an instance of Scanner class named input
        int number = 0;                                                         // Declare and initialize default values and strings
        String word = "";
        
        System.out.print ("Please enter either an integer value or a word: ");  // Ask the user for an input of either an integer or word
        if (input.hasNextInt()) {                                               // Check if input is an integer
            number = input.nextInt();                                           // Input is an integer --> Assign value to number
        }  
        else {                                                                  // Input not an integer
            word = input.next();                                                // Assign input to word
        }

        System.out.println ("The output is: ");                                 // Print out statement
        rectangle (number);                                                     // Call on rectangle method using an integer
        rectangle (word);                                                       // Call on rectangle method using a string
    }
}