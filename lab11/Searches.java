// Angela Nguyen
// April 15, 2016
// Professor Brian Chen
// Searches Java Program

// Purpose: Perform linear and binary searches on large arrays of random numbers

import java.util.Random;                                                        // Import the needed classes for later user
import java.util.Arrays;
import java.util.Scanner;

public class Searches {

    public static int[] array(int[] array) {                                    // Method to generate array1
        Random randomGenerator = new Random();                                  // Declare and initialize the random number generator
        for (int i = 0; i < 50; i++) {                                          // For loop --> Assign randomly generated numbers into each member of the array
            array[i] = randomGenerator.nextInt(101);                            // For array[i], assign a random number from [0,100]
        }
        return array;                                                           // Return the generated array to the assigned array in main method
    }

    public static int[] modifiedArray(int[] originalArray, int[] newArray) {    // Method to generate array2
        Random randomGenerator = new Random(101);                               // Declare and initialize the random number generator
        for (int i = 0; i < originalArray.length; i++) {                        // For loop --> Assign randomly concatenated numbers into each member of the array
            int number = randomGenerator.nextInt(100);                          // Generate the second random number needed for array
            String addition = "" + originalArray[i] + number;                   // Concatentate the two randomly generated numbers into a string to avoid addition
            int finalNumber = Integer.valueOf(addition);                        // "Cast" the string called addition into an integer called finalNumber
            newArray[i] = finalNumber;                                          // For newArray[i], assign the newly generated number
        }
        return newArray;                                                        // Return the new generated array to the assigned array in the main method
    }

    public static int min(int[] array) {                                        // Method to determine the minimum of the array
        int min = array[0];                                                     // Assign the minimum of the array to be generically array[0]
        for (int i = 1; i < array.length; i++) {                                // For loop --> Linearly search the entire length of array to find to the absolute minimum
            if (array[i] < min) {                                               // If the value in array[i] is less than the minimum
                min = array[i];                                                 // Set the value in array[i] to be the new minimum
            }
        }
        return min;                                                             // Return the minimum value to the assigned variable in the main method
    }

    public static int max(int[] array) {                                        // Method to determine the maximum of the array
        int max = array[0];                                                     // Assign the maximum of the array to be generically array[0]
        for (int i = 1; i < array.length; i++) {                                // For loop --> Linearly search the entire length of array to find the absolute maximum
            if (array[i] > max) {                                               // If the value in array[i] is greater than the maximum
                max = array[i];                                                 // Set the value in array[i] to be the new maximum
            }
        }
        return max;                                                             // Return the maximum value to be the new maximum
    }

    public static void findNumber(int[] array, int key) {                       // Method the search for a particular number using binary search
        int beginning = 0;                                                      // Declare and initialize the beginning of the array to be 0
        int end = array.length - 1;                                             // Declare aand initialize the ending of the array to be the length of the array minus 1
        int middle = 0;                                                         // Declare and initialize the middle of the array to be 0
        boolean found = false;                                                  // Declare and initialize boolean variable named found to false

        while (beginning <= end) {                                              // While loop --> To keep track of how many more times binary search can be done
            middle = (beginning + end) / 2;                                     // Determine the middle of the array using (beginning + end) / 2
            if (key < array[middle]) {                                          // If the value to be found is less than the value in the middle of the array
                end = middle - 1;                                               // Set the new end to be middle - 1 
            }   
            else if (key > array[middle]) {                                     // If the value to be found is greater than the value in the middle of the array
                beginning = middle + 1;                                         // Set the new beginning to be middle + 1
            }
            else if (key == array[middle]) {                                    // If the value to be found is equal to the value in the middle of the array
                found = true;                                                   // Set the found to be equal to be true
                System.out.print ("The desired number of " + key );             // Print out the statements
                System.out.println (" was found in the list.");
                break;                                                          // Exit the while loop
            }
        }
        if (found == false) {                                                   // If found is equal to false
            System.out.println("The desired number of " + key + " was not found in the list.");     //Print out statements
            System.out.println("The number above " + key + " was " + array[middle] + ".");
            System.out.println("The number below " + key + " was " + array[middle - 1] + ".");
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[50];                                             // Declare and allocate an array1 with 50 potential members
        int[] array2 = new int[50];                                             // Declare and allocate an array2 with 50 potential numbers
        int answer = 0;                                                         // Declare and initialize integer variable named answer to 0

        array1 = array(array1);                                                 // Assign array1 with the generated array from the method named array
        System.out.println ("The minimum value of array1 is: " + min(array1));  // Print out the minimum of array1
        System.out.println ("The maximum value of array1 is: " + max (array1)); // Print out the maximum of array2

        array2 = modifiedArray(array1, array2);                                 // Assign array2 with the generated array from the method named modifiedArray
         System.out.println ("The minimum value of array2 is: " + min(array2)); // Print out the minimum of array2
        System.out.println ("The maximum value of array2 is: " + max (array2)); // Print out the maximum of array2
    
        Arrays.sort(array2);                                                    // Sort array2 from small to large numbers

        Scanner question = new Scanner(System.in);                              // Declare and initialize a new instance of Scanner named question
        boolean valid = false;                                                  // Declare and initialize boolen variable named valid

        System.out.print("Please enter the integer greater than or equal to "); // Ask user for a number to be searched for
        System.out.print ("0 that is to be found: ");

        if (question.hasNextInt()) {                                            // If the input is an integer
            answer = question.nextInt();                                        // Assign the input to the variable answer
            if (answer >= 0) {                                                  // If answer is greater than or equal to 0
                findNumber (array2, answer);                                    // Call method named findNumber with array2 and answer
            }
            else {                                                              // If answer was not greater than or equal to 0, print out:
                System.out.println("The integer entered was not greater than or equal to 0. The program will now close.");
            }
        }
        else {                                                                  // If the input was not an integer, print out:
            System.out.println("The input entered was not an integer. The program will now close.");
        }
        
    }
}
