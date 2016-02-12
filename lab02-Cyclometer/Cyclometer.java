// Angela Nguyen
// February 5, 2016
// CSE 2 - Prof. Brian Chen
// Cyclometer Java Program

// Purpose: Record the time elapsed in seconds and
// the number of rotations of the front wheel

// Print out the number of minutes for each trip,
// number of counts for each trip
// distance of each trip in miles
// distance of the two trips combined

public class Cyclometer {
    // main method required for every Java program
    public static void main (String[] args) {
        // Information of the two trips
        int trip1Sec = 480;         // declares integer variable assigning the number of seconds for Trip1
        int trip1Rotation = 1561;    // declares integer variable assigning the number of rotations for Trip 1
        int trip2Sec = 3220;         // declares integer varaible assigning the number of seconds for Trip2
        int trip2Rotation = 9037;    // declares integer variable assiging the number of rotations for Trip2
        
        // Other information needed for calculations
        double diameterWheel = 27.0; // declares double variable assigning the diamter of the wheel
        double PI = 3.14159;                // assigns the value of pi to the variable PI
        double feetToMile = 5280;           // assigns the conversion of 5280 feet in 1 mile to variable
        double inchesToFeet = 12;           // assigns the conversion of 12 inches in 1 foot to variable
        double secondsToMinutes = 60;       // assigns the conversion of 60 seconds in 1 minutes to variable
        double trip1Distance, trip2Distance, totalDistance; // declares double variables for the distances of the trips and total distance
        
        // Printing out the information of each trip
        System.out.println ("The time for Trip 1 was " + (trip1Sec / secondsToMinutes) + // Print out the information for Trip 1
        " minutes and had " + (trip1Rotation) + " counts.");
        System.out.println ("The time for Trip 2 was " + (trip2Sec / secondsToMinutes) + // Print out the information for Trip 2
        " minutes and had " + (trip2Rotation) + " counts.");
        
        // Perform the calculations for distance traveled in miles and the total distance in mmiles
        trip1Distance = (trip1Rotation * diameterWheel * PI);       // gives the distance traveled in inches
        trip1Distance = trip1Distance / inchesToFeet / feetToMile;  // gives the distance traveled in miles 
        trip2Distance = (trip2Rotation * diameterWheel * PI);       // gives the distance traveled in inches
        trip2Distance = trip2Distance / inchesToFeet / feetToMile;  // gives the distance traveled in miles 
        totalDistance = trip1Distance + trip2Distance;                  // adds the two trip distances together for total distance traveled
        
        // Print out the distances traveled for each trip in miles
        System.out.println ("The distance traveled for Trip 1 was " + (trip1Distance) + " miles."); // Print out the distance traveled for Trip 1 in miles
        System.out.println ("The distance traveled for Trip 2 was " + (trip2Distance) + " miles."); // Print out the distance traveled for Trip 2 in miles
        System.out.println ("The total distance traveled was " + (totalDistance) + " miles."); // Print out the total distance traveled in miles
    } // end of main method
} // end of class
