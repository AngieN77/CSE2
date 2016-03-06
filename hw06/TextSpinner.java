// Angela Nguyen
// March 4, 2016
// CSE 2 - Prof. Brian Chen
// Text Spinner Java Program

// Purpose: Write an infinite loop that has a cursor rotating

public class TextSpinner {
    public static void main (String[] args) {
        while (true) {                              // Infinite while loop since condition is always set to true
            System.out.print ("/");                 // Print out first stage of spin
            System.out.print ("\b");                // Backspaces/erases first stage
            System.out.print ("-");                 // Print out second stage of spin
            System.out.print ("\b");                // Backspaces/erases second stage
            System.out.print ("\\");                // Print out third stage of spin
            System.out.print ("\b");                // Backspaces/erases third stage
            System.out.print ("|");                 // Print out fourth stage of spin
            System.out.print ("\b");                // Backspaces/erases fourth stage and loops back to the beginning
        }
    }
}