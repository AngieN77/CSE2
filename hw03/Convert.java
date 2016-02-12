// Angela Nguyen// Angela Nguyen
// February 11, 2016
// CSE 2 - Prof. Brian Chen
// Convert Java Program

// Purpose: Convert meters to inches
//          Ask the user for measurements in meters

import java.util.Scanner;                                       // Import the Scanner class for future use

public class Convert {
    public static void main (String [] args) {
        double inchesToMeters = 0.0254;                         // Declare double variable and assigning value of 
                                                                // 0.0254 for the conversion of inches to meters
        Scanner convert;                                        // Declare an instance of the Scanner class named convert
        convert = new Scanner (System.in);                      // Construct the instance
        
        System.out.print ("Enter a measurement in meters: "); // Ask the user for an input value for the number of meters
        double meters = convert.nextDouble();                   // Assign the input value from Scanner to the double variable meters
        double inches = meters / inchesToMeters;                // Converting from meters to inches
        
        inches = (int) (inches * 100) / 100.0;                  // Truncate decimal places that are not needed
        // Print out the converted value from meters to inches
        System.out.println ((meters) + " meters is about " + (inches) + " inches."); 
    }
}