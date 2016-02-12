// Angela Nguyen// Angela Nguyen
// February 11, 2016
// CSE 2 - Prof. Brian Chen
// Pyramid Java Program

// Purpose: Ask for the dimensions of a pyramid and print out its volume

import java.util.Scanner;                                                           // Import the Scanner class for future use

public class Pyramid {
    public static void main (String [] args) {
        Scanner pyramidDimension;                                                   // Declare an instance of the Scanner class named pyramdDimension
        pyramidDimension = new Scanner (System.in);                                 // Construct the instance of the class
        
        System.out.print ("Enter the height of the pyramid: ");                   // Ask the user for an input value for the height of the pyramid
        double height = pyramidDimension.nextDouble();                              // Assign the input value in the double variable named height
        
        System.out.print ("Enter the length of one side on the base: ");          // Ask the user for an input value for length for one side of the base
        double side1 = pyramidDimension.nextDouble();                               // Assign the input value in the double variable named side1
        
        System.out.print ("Enter the length of the other side of the base: ");    // Ask the user for an input value for length of the other side of the base
        double side2 = pyramidDimension.nextDouble();                               // Assign the input bvalue in the double variable named side2
        
        double volume = height * side1 * side2 / 3;                                 // Calculate the volume of pyramid with the given dimensions
        // Print out the volume of the pyramid with the given dimensions
        System.out.println ("The volume of the pyramid with height " + height + " and base lengths " + side1 + " and " + side2 + " is " + volume + ".");
    }                                                                               // End of the main method
}