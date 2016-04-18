// Angela Nguyen
// April 14, 2016
// Professor Brian Chen
// CSE2 Linear Java Program

// Purpose: Write the code for three methods: randomInput(), delete(list,pos) and remove (list,target)
//          randomInput: Generates an array of 10 random integers between 0 to 9
//                       Implement so it fills the array with random integers and return the filled array
//          delete: Takes an integer array as input called list and an integer called pos
//                  Create a new array that has one member fewer than list
//                  New array be composed of all the same memeers except the members in the position pos
//          remove: Deletes all the elements that are equal to target
//                  Returns a new list without target

import java.util.Scanner;                                                       // Import needed classs for future use
import java.util.Random;

public class RemoveElements {

    public static String listArray(int num[]) {                                 // Method to print out the array
        String out = "{";                                                       // Declare and initialize string variable out with a curly brace
        for (int j = 0; j < num.length; j++) {                                  // For loop --> Keep track of the numbers being printed from array
            if (j > 0) {                                                        // If j is greater than 0
                out += ", ";                                                    // Print out a comma
            }
            out += num[j];                                                      // Add to out string the value of num[j]
        }                                                                       
        out += "} ";                                                            // Add closing curly brace to out
        return out;                                                             // Return out to the assigned variable in main
    }

    public static int[] randomInput() {                                         // Method for randomly generating numbers to assign to array members
        Random randomGenerator = new Random();                                  // Declare and initialize the random number generator
        int[] array = new int[10];                                              // Declare an array with size 10

        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of how many numbers are being added to the array
            array[i] = randomGenerator.nextInt(10);                             // For every array[i], assign a random number
        }
        return array;                                                           // Return the randomly generated array to the variable assigned in main method
    }

    public static int[] delete(int[] list, int pos) {                           // Method to delete an element in a certain position
        int[] array = new int[list.length];                                     // Generically declare an array of size equal to list
        if (pos >= 0 && pos < 10) {                                             // If pos is greater than or equal to 0 and less than 10
            array = new int[list.length - 1];                                   // Reallocate the size of array to be 9
            for (int i = 0; i < array.length; i++) {                            // For loop --> Keep track of how many numbers are being added to the array
                if (i < pos) {                                                  // If i is less than pos
                    array[i] = list[i];                                         // Assign the value of array[i] to be the value in list[i]
                }
                if (i >= pos) {                                                 // if i is greater than pos
                    array[i] = list[i + 1];                                     // Assign the value of array[i] to be the value in list[i + 1]
                }
            }
            System.out.println ("Index " + pos + " element is removed.");       // Print out statement
        }
        else {                                                                  // If pos is not between [0,9]
            System.out.println("The index is not valid.");                      // Print out statement
            for (int i = 0; i < list.length; i++) {                             // For loop --> Keep track of how many numbers are being added to the array
                array[i] = list[i];                                             // Assign the value of array[i] to be the value in list[i]
            }
        }
        return array;                                                           // Return the modified array to the variable assigned in main method
    }

    public static int[] remove(int[] list, int target) {                        // Method to remove all elements containing target value
        int counter = 0;                                                        // Declare and initialize integer variables needed for future user
        int index = 0;
        int[] array = new int[list.length];                                     //Generically declare an array of size equal to list
        for (int i = 0; i < list.length; i++) {                                 // For loop --> Keep track of how many numbers have been checked
            if (list[i] == target) {                                            // If value in member is equal to target
                counter++;                                                      // Increment counter by adding 1
            }
        }
        if (counter != 0) {                                                     // If counter is not equal to 0
            array = new int[list.length - counter];                             // Reallocate array to be of size (10 - counter)
            for (int i = 0; i < array.length; i++) {                            // For loop --> Keep track of how many numbers are being added to the array
                for (int j = index; j < list.length; j++) {                     // For loop --> Keep track of numbers being checked in list
                    if (list[index] == target) {                                // If the value in member is equal to target
                        index++;                                                // Increment index by adding 1
                    }
                    else {                                                      // If the value in member is not equal to target
                        array[i] = list[j];                                     // Assign the value of array[i] to be the value in list[j]
                        index++;                                                // Increment index by adding 1
                        break;                                                  // Exit the innermost for loop
                    }
                }
            }
            System.out.println ("Element " + target + " has been found.");      // Print out statement
        }
        else {                                                                  // If counter is equal to 0
            for (int i = 0; i < list.length; i++) {                             // For loop --> Keep track of how many numbers are being added to the array
                array[i] = list[i];                                             // Assign the value of array[i] to be the value in list[i]
            }
            System.out.println ("Element " + target + " was not found.");       // Print out statement
        }
        return array;                                                           // Return the modified array to the variabled assigned in main method
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);                                  // Declare and initialize Scanner with named scan
        int num[] = new int[10];                                                // Declare and allocate an integer array named num with size 10
        int newArray1[];                                                        // Declare integer arrays and variables
        int newArray2[];
        int index, target;
        String answer = "";                                                     // Declare and initialize string variable named answer with nothing

        do {                                                                    // Do while loop --> Continue if user input "Y" or "y"
            System.out.println("Random input 10 ints [0-9]");                   // Print out statement
            num = randomInput();                                                // Call randomInput method to randomly generate array
            String out = "The original array is: ";                             // Declare and initialize string variable named out with following statement
            out += listArray(num);                                              // Concatentate out with output returned from listArray method after being called
            System.out.println(out);                                            // Print out out statement
            System.out.println("");                                             // Print out new line

            System.out.print("Enter the index ");                               // Ask user to enter an integer
            index = scan.nextInt();                                             // Assign input as the value for index
            newArray1 = delete(num, index);                                     // Call method named delete to produce modified array if possible
            String out1 = "The output array is ";                               // Declare and initialize string variable named out1 with following statement
            out1 += listArray(newArray1);                                       // Concatentate out1 with output returned from listArray method after being called
            System.out.println(out1);                                           // Print out out1 statement
            System.out.println("");                                             // Print out new line

            System.out.print("Enter the target value ");                        // Ask user to enter an integer
            target = scan.nextInt();                                            // Assign input as the value for target
            newArray2 = remove(num, target);                                    // Call method named remove to omit members containing target value
            String out2 = "The output array is ";                               // Declare and initialize string variable named out2 with following statement
            out2 += listArray(newArray2);                                       // Concatentate out2 with output returned from listArray method after being called
            System.out.println(out2);                                           // Print out out2 statement
            System.out.println("");                                             // Print out new line

            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // Ask user if they want to continue again
            answer = scan.next();                                               // Assign input as the value for answer
            System.out.println("");                                             // Print out a new line 
        } while (answer.equals("Y") || answer.equals("y"));                     // Restart the program if answer equal "Y" "y"
    }

}
