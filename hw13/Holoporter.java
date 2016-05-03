// Angela Nguyen
// Professor Brian Chen
// April 22, 2016
// Holoporter Java Program

// Purpose: soRandom - Create a 3D string array --> 2D string arrays inside --> 1D string arrays inside
//          coder - Generate a unique code of type XXYYYY
//                  X - Letters from A - Z
//                  Y - Numbers from 0 - 9
//          print - Prints out the 3D array
//                  --- => Outerdimension
//                  | => 2nd dimension
//                  , => Elements
//          holoport - Copy each molecule from original 3D array to new 3D array of different size
//                     If original is larger than new --> Truncate objects that do not fit in new array
//                     If new is larger than original --> Add "$$$$$" to spaces that are not filled
//          sampling - Takes in a 3D array and a specific code
//                     If code in array --> Print out its location in the format (x,y,z)
//                     If code not in array --> Print out that it was not found
//          percentage - Takes in original 3D array and holoported array
//                       Prints out a percentage of how completely holoportation is
//                       Holoport has less molecules --> Negative number
//                       Holoport has more molecues --> Positive number
//                       Formula: (Number of Molecule Difference) / (Number of Molecules in Original)
//          frankenstein - Reorder elements of each member in ascending order based on the cde
//                         Reorder secnd dimension of 3D array in ascending order based on length of each array (shortest to longest)

import java.util.Random;                                                        // Import needed classes for future use
import java.util.Scanner;

public class Holoporter {

    public static String[][][] soRandom() {                                     // soRandom Method
        Random randomGenerator = new Random();                                  // Declare and initialize an instance of Random named randomGenerator
        String[][][] array = new String[randomGenerator.nextInt(9) + 1][][];    // Declare and allocate a 3D array with size from [1,10] with its subarrays not yet allocated
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which main row is being allocated
            array[i] = new String[randomGenerator.nextInt(9) + 1][];            // Allocate a size [1,10] to the row
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which row submember is being allocated next
                array[i][j] = new String[randomGenerator.nextInt(9) + 1];       // Allocate a size [1,10] to the row submember
            }
        }
        return array;                                                           // Return the randomly created array
    }

    public static String coder() {                                              // coder Method
        Random randomGenerator = new Random();                                  // Declare and initialize an instance of Randon named randomGenerator
        String code = "";                                                       // Declare and initialize a string variable named code with a space
        char character1 = (char)(randomGenerator.nextInt(26) + 'A');            // Randomly generate a capital letter for character1
        char character2 = (char)(randomGenerator.nextInt(26) + 'A');            // Randomly generate a capital letter for character2
        int number1 = randomGenerator.nextInt(10);                              // Randomly generate a number from [0,9] for number1
        int number2 = randomGenerator.nextInt(10);                              // Randomly generate a number from [0,9] for number2
        int number3 = randomGenerator.nextInt(10);                              // Randomly generate a number from [0,9] for number3
        int number4 = randomGenerator.nextInt(10);                              // Randomly generate a number from [0,9] for number4
        code = code + character1 + character2 + number1 + number2 + number3 + number4; // Concatenate the generated characters and numbers to produce a code
        return code;                                                            // Return the newly generated code
    }

    public static String[][][] holoport(String[][][] array, String[][][] transport) { // holoport Method
        int i = 0, j = 0, k = 0;                                                // Declare and initiaize needed variables for future use

        for (i = 0; i < transport.length && i < array.length; i++) {            // For loop --> Keep track of highest row that can receive a transported code
            for (j = 0; j < transport[i].length && j < array[i].length; j++) {  // For loop -> Keep track of highest row member that can receive a transported code
                for (k = 0; k < transport[i][j].length && k < array[i][j].length; k++) { // For loop --> Keep track of high rw submember that can received a transprted code
                    transport[i][j][k] = array[i][j][k];                        // Transport the string from array[i][j][k] to transport[i][j][k]
                }
            }
        }

        for (i = 0; i < transport.length; i++) {                                // For loop --> Keep track of which row to check
            for (j = 0; j < transport[i].length; j++) {                         // For loop --> Keep track of which row member to check
                for (k = 0; k < transport[i][j].length; k++) {                  // For loop --> Keep track of which row submember to check
                    if (transport[i][j][k] == null) {                           // If string in transport[i][j][k] is null
                        transport[i][j][k] = "$$$$$";                           // Replace null with "$$$$$"
                    }
                }
            }
        }

        return transport;                                                       // Return the transport array
    }

    public static void sampling(String[][][] array, String code) {              // sampling Method
        boolean found = false;                                                  // Declare and initialize needed variables for future use
        int x = 0, y = 0, z = 0;
        
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is to be searched
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which row member is to be searched
                for (int k = 0; k < array[i][j].length; k++) {                  // For loop --> Keep track of which row submember is to be searched
                    if (array[i][j][k].equals(code)) {                          // If transort[i][j][k] is equal to the code that is being searched for
                        x = i;                                                  // Reassign variables with the indices of the location of the code
                        y = j;
                        z = k;
                        found = true;                                           // Reassign found to be true
                    }
                }
            }
        }
        if (found) {                                                            // If found is true
            System.out.print("The code " + code + " was found in ");            // Print out statment and location
            System.out.println("location (" + x + "," + y + "," + z + ").");
        }
        else {                                                                  // Found is false
            System.out.println("The code " + code + " was not found.");         // Print out statement
        }
    }

    public static void percentage(String[][][] array, String[][][] transport) { //percentage Method
        double counterArray = 0;                                                // Declare and initialize counters for future use
        double counterTransport = 0;

        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is being counted
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which row member is being counted
                for (int k = 0; k < array[i][j].length; k++) {                  // For loop --> Keep track of which row submember is being counted
                    counterArray++;                                             // Increment counterArray by adding 1 for each member in the array
                }
            }
        }

        for (int i = 0; i < transport.length; i++) {                            // For loop --> Keep track of which row is being counted
            for (int j = 0; j < transport[i].length; j++) {                     // For loop --> Keep track of which row member is being counted
                for (int k = 0; k < transport[i][j].length; k++) {              // For loop --> Keep track of which row submember is being counted
                    counterTransport++;                                         // Increment counterTransport by adding 1 for each member in the array including "$$$$$"
                }
            }
        }

        double percentage = (counterTransport - counterArray) / (counterArray) * 100;                   // Calculate the percentage for the holoportation
        System.out.printf("The percentage of completion of the holoport is: %.2f%%  \n", percentage);   // Print out statement and percentage


    }

    public static void frankenstein(String[][][] array) {                       // frankenstein Method
        // Selection Sort for members
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is being sorted
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which row member is being sorted
                for (int k = 0; k < array[i][j].length; k++) {                  // For loop --> Keep track of which row submember is being sorted
                    int min = k;                                                // Set the default min to be array[i][j][k]
                    for (int l = k + 1; l < array[i][j].length; l++) {          // For loop --> Keep track of which row submember is being compared to min
                        if (array[i][j][l].compareTo(array[i][j][min]) < 0) {   // If array[i][j][l] is less than array[i][j][min] (Alphabetically and numberically)
                            min = l;                                            // Set min to be array[i][j][l]
                        }
                    }
                    if (min != k) {                                             // If min is not equal to array[i][j][k]
                        String temp = array[i][j][k];                           // Assign the string in array[i][j][k] to temp
                        array[i][j][k] = array[i][j][min];                      // Reassign string in array[i][j][k] to be array[i][j][min]
                        array[i][j][min] = temp;                                // Reassign string in array[i][j][min] to be temp
                    }
                }
            }
        }

        // Insertion Sort for row length
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is being sorted
            for (int j = 1; j < array[i].length; j++) {                         // For loop --> Keep track of which row member is being sorted
                for (int k = j; k > 0; k--) {                                   // For loop --> Keep track of which row member is currently being compared
                    if (array[i][k].length < array[i][k - 1].length) {          // If array[i][k] is less than array[i][k - 1]
                        String[] temp = array[i][k];                            // Assign row member array[i][k] to be temp
                        array[i][k] = array[i][k - 1];                          // Reassign row member array[i][k - 1] to be row member array[i][k]
                        array[i][k - 1] = temp;                                 // Reassign row member array[i][k - 1] to be row member temp
                    }
                }
            }
        }
    }

    public static void print(String[][][] input) {                              // print Method
        for (int i = 0; i < input.length; i++) {                                // For loop --> Kep track of which row is being printed
            if (i > 0) {                                                        // If i is greater than 0
                System.out.print("---");                                        // Print "---"
            }
            for (int j = 0; j < input[i].length; j++) {                         // For loop --> Keep track of which row member is being printed
                if (j > 0) {                                                    // If j is greater than 0
                    System.out.print(" | ");                                    // Print " | "
                }
                System.out.print("[");                                          // Print "["
                for (int k = 0; k < input[i][j].length; k++) {                  // For loop --> Keep track of which row submember is being printed
                    System.out.print(input[i][j][k]);                           // Print out the string in input[i][j][k]
                    if (k == input[i][j].length - 1) {                          // If k is equal to input[i][j].length - 1
                        System.out.print("]");                                  // Print "]"
                    }
                    else {                                                      // k is not equal to input[i][j].length - 1
                        System.out.print(" , ");                                // Print "."
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][][] original = soRandom();                                     // Call soRandom() method to create a 3D array for variable named original
        String[][][] holder = soRandom();                                       // Call soRandom() method to create a 3D array for variable named holder
        String desiredCode = "";                                                // Declare and initialize a string variable named desiredCode
        
        for (int i = 0; i < original.length; i++) {                             // For loop --> Keep track of which row is being filled with a new code
            for (int j = 0; j < original[i].length; j++) {                      // For loop --> Keep track of which row member is being filled with a new code
                for (int k = 0; k < original[i][j].length; k++) {               // For loop --> Kep track of which row submember is being filled with a new code
                    original[i][j][k] = coder();                                // Call coder() method to randomly generate a code for original[i][j][k]
                }
            }
        }

        System.out.println("Original Container:");                              // Print out statement
        print(original);                                                        // Call print() method to print out original
        System.out.println("\n \n");                                            // Print out two new lines

        holder = holoport(original, holder);                                    // Call holoport() to transport codes from original to holder array

        System.out.println("Holder Container:");                                // Print out statement
        print(holder);                                                          // Call print() method to print out holder
        System.out.println("\n \n");                                               // Print out a new line

        while (true) {                                                          // While loop --> Ask user for a desired code in the correct format
            boolean valid = true;                                               // Declare and initialize a boolean variable named vaild to be true
            Scanner input = new Scanner(System.in);                             // Declare and initialize an instance of Scanner named input
            System.out.print("Please enter a code (XXYYYY) that is to be searched: ");  // Ask the user for a desired code to be searched for
            desiredCode = input.next();                                         // Assign input as desiredCode
            if (desiredCode.length() == 6) {                                    // If desiredCode consists of 6 characters
                for (int i = 0; i < desiredCode.length(); i++) {                // For loop --> Keep track of which character is being checked
                    if (i <= 1) {                                               // If i is less than or equal to 1
                        char character = desiredCode.charAt(i);                 // Set the object in position i to be labeled character
                        if (!Character.isLetter(character)) {                   // If character is not a letter
                            valid = false;                                      // Set valid to be false and print out statement
                            System.out.println ("One of the first 2 characters was not a letter. Please try again.");
                            break;                                              // Exit the for loop
                        }
                    }
                    if (i > 1) {                                                // If i is greater than 1
                        char character = desiredCode.charAt(i);                 // Set the object in position i to be labeled character
                        if (!Character.isDigit(character)) {                    // If character is not a digit
                            valid = false;                                      // Set valid to be false
                            System.out.println ("One of the last 4 characters was not a number. Please try again.");
                            break;                                              // Exit the for loop
                        }
                    }
                }
                
                if (valid) {                                                    // If valid is true            
                    break;                                                      // Exit the while loop
                }
            }
            else {                                                              // desiredCode is not 6 characters long; print out statement
                System.out.println ("The input entered was not 6 characters long. Please try again.");
            }
        }

        sampling(holder, desiredCode);                                          // Call sampling() method to search for desiredCode

        percentage(original,holder);                                            // Call percentage() method to calculate the completion off holoportation

        System.out.println ("\n");                                              // Print out a new line
        
        frankenstein(original);                                                 // Call frankenstein() method to reorder row submembers and row members accordingly
        
        System.out.println("Frankenstein: ");                                   // Print out statement
        print(original);                                                        // Call print() method to print out original

        System.out.println("");                                                 // Print out a new line

    }
}