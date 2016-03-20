// Angela Nguyen
// March 19, 2016
// CSE 2 - Prof. Brian Chen
// Triangles Java Program

// Purpose: Write a program asking user to input an integer
//          between [5,30] and then prints a display in
//          the shape of a triangle
//          Using for loops, while loops, and do-while loops

import java.util.Scanner;                                                       // Import the Scanner class

public class Triangles {
    public static void main(String[] args) {
        int number;                                                             // Declare variables for future use
        int counter;
        int amount;

        Scanner value;                                                          // Declare an instance of Scanner class
        while (true) {                                                          // While loop --> Asks the user for a value
            value = new Scanner(System.in);                                     // Construct the instance of the Scanner class
            System.out.print("Enter a number between 5 and 30 inclusive: ");    // Ask the user for a value
            if (value.hasNextInt()) {                                           // Check if input is an integer
                number = value.nextInt();                                       // Input is integer --> Assign input to number
                if (number >= 5 && number <= 30) {                              // Check if number is between 5 and 30 inclusive
                    break;                                                      // number between 5 and 30 inclusive --> Exit while loop
                }
                else {                                                          // number not between 5 and 30 inclusive
                    System.out.print("The value entered is not between [5,30].");   // Print out statements
                    System.out.println(" Please try again. ");
                }                                                               // Restart while loop
            }
            else {                                                              // Input is not an integer
                System.out.print("The value entered was not an integer.");      // Print out statements
                System.out.println(" Please try again.");
            }                                                                   // Restart while loop
        }

        System.out.println ("FOR LOOP: ");                                      // Print out statement
        for (counter = 1; counter <= number; counter++) {                       // For loop --> Keeps track of what number is to be printed incrementally (top half)
            for (amount = 1; amount <= counter; amount++) {                     // For loop --> Keeps track of how many times number is printed
                System.out.print (counter);                                     // Print out the number assigned to counter
            }                                                                   // Increment amount by 1
            System.out.println (" ");                                           // Begin new line
        }                                                                       // Increment counter by 1
        for (counter = (number - 1); counter >= 1; counter--) {                 // For loop --> Keeps track of what number is to be printed decrementally (bottom half)
            for (amount = 1; amount <= counter; amount++) {                     // For loop --> Keeps track of how many times number is to be printed
                System.out.print (counter);                                     // Print out the number assigned to counter
            }                                                                   // Increment amount by 1
            System.out.println (" ");                                           // Begin new line
        }                                                                       // Decrement counter by 1
        
        System.out.println ("WHILE LOOP:");                                     // Print out statement
        counter = 1;                                                            // Reset counter to 1
        while (counter <= number) {                                             // While loop --> Keeps track of what number to be printed incrementally (top half)
            amount = 1;                                                         // Reset amount to 1
            while (amount <= counter) {                                         // While loop --> Keeps track of how many times number is printed
                System.out.print (counter);                                     // Print out the number assigned to counter
                amount++;                                                       // Increment amount by 1
            }
            counter++;                                                          // Incrment counter by 1
            System.out.println (" ");                                           // Begin new line
        }
        counter = number - 1;                                                   // Set counter to (number - 1)
        while (counter >= 1) {                                                  // While loop --> Keeps track of what is to be printed decrementally (bottom half)
            amount = 1;                                                         // Reset amount to 1
            while (amount <= counter) {                                         // While loop --> Keps track of how many times number is printed
                System.out.print (counter);                                     // Print out the number asssigned to counter
                amount++;                                                       // Increment amount by 1
            }
            counter--;                                                          // Decrement counter by 1
            System.out.println (" ");                                           // Begin new line
        }
        
        System.out.println("DO-WHILE LOOP:");                                   // Print out statement
        counter = 1;                                                            // Reset counter to 1
        do {                                                                    // Do while loop --> Keeps track of what number is to be printed (top half)
            amount = 1;                                                         // Reset amount to 1
            do {                                                                // Do while loop --> Keeps track of how many times number is printed
                System.out.print(counter);                                      // Print out number assigned to counter
                amount++;                                                       // Increment amount by 1
            }                           
            while (amount <= counter);                                          // Check if amount is still less than or equal to counter after incrementing to continue do-while
            System.out.println(" ");                                            // Begin new line
            counter++;                                                          // Increment counter by 1
        }
        while (counter <= number);                                              // Check if counter is still less than or equal to number after incrementing to continue do while
        counter = number - 1;                                                   // Set counter to (number - 1)
        do {                                                                    // Do while loop --> Keeps track of what number is to be printed (top half)
            amount = 1;                                                         // Reset amount to 1
            do {                                                                // Do while loop --> Keeps track of how many times number is printed
                System.out.print(counter);                                      // Print out the number assigned to counter
                amount++;                                                       // Increment amount by 1
            }                               
            while (amount <= counter);                                          // Check if amount is still less than or equal to counter after incrmenting to continue do-while
            System.out.println(" ");                                            // Begin new line
            counter--;                                                          // Decrement counter by 1
        }   
        while (counter >= 1);                                                   // Check if counter is less than or equal to 1 after decrementing to continue do-while
    }
}