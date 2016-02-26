// Angela Nguyen
// February 12, 2016
// CSE 2 - Prof. Brian Chen
// Check Java Program

// Purpose: Use the Scanner class to obtain the cost of the check
//          Percentage tip wished to pay
//          Number of ways check is to be split
//          How much each person will have to pay


import java.util.Scanner;       // Import the Scanner class

public class Check {
    public static void main (String [] args) {
        // Setting up the scanner class
        Scanner myScanner;                      // Declare instance of Scanner
        myScanner = new Scanner (System.in);    // Construct the instance
        // Asking user for input
        System.out.print ("Enter the cost of the check in the form XX.XX: $");                          // Ask the user for the cost of the check
        double cost = myScanner.nextDouble();                                                           // Assign the value to the double variable cost
        System.out.print ("Enter the wished percentage tip that is to be paid as a whole number: ");    // Ask the user for the perecentage tip
        double tip = myScanner.nextDouble();                                                            // Assign the value to the integer varible tip
        tip /= 100;
        System.out.print ("Enter the number of people that the check will be split between: ");         // Ask the user for the amount of people splitting the check
        int numberPeople = myScanner.nextInt();                                                         // Assign the value to the integer variable numberPeople
        // Declaring and initializing needed variables for future calculations
        double totalCost, costPerPerson;                                                                // Declaring and initializing the variables to hold the total cost and number of people
        int dollars, dimes, pennies;
        // Calculating the cost for each person
        totalCost = cost * (1 + tip);                                                                   // Calculating the cost of the bill plus tip
        costPerPerson = totalCost / numberPeople;                                                       // Dividing the total cost of the bill between the amount of people
        dollars = (int) costPerPerson;                                                                  // Calculating the amount of the dollars in the cost of one person
        dimes = (int) (costPerPerson * 10) % 10;                                                        // Calculating the amount of the dimes in the cost of one person
        pennies = (int) (costPerPerson *100) % 10;                                                      // Calculating the amount of the pennies in the cost of one person
        // Printing out the statement statement stating how much each person will have to pay
        System.out.println ("Each person in the group will have to pay $" + dollars + "." + dimes + pennies + ".");
    }
}