// Angela Nguyen
// Professor Brian Chen
// April 22, 2016
// Ragged Array Java Program

// Purpose: Create and manipulate a 2D array
//          Ask user for an integer which will be the size of the main array (size of column)
//          Create a random-sized member array and assign one to each element of the main array
//          Loop through the array and fill it with random numbers from [0,20]; Print out aray
//          Use insertion or selection sort on each row on the array in ascending order; Print out array
//          Rearrange the ragged array so the short rows float to the top and long rows sink to the bottom; Print out array
//          Ask user to input an integer to search for inside the array
//          If integer is present: Print out column and row of location --> Multiple occurences - Print out first occurence
//          If integer is not present: Print out that the number could not be found

import java.util.Scanner;                                                       // Import needed classes for future use
import java.util.Random;

public class RaggedArray {

    public static int[][] selectionSort(int[][] array) {                        // Method for selection sort to sort numbers in each row
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is being sorted
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which member is being sorted
                int min = j;                                                    // Set default minimum to be current member being sorted
                for (int k = j + 1; k < array[i].length; k++)                   // For loop --> Keep track of the current minimum
                if (array[i][k] < array [i][min]) {                             // If the value in array[i][k] is less than the value in array[i][min]
                    min = k;                                                    // Change the value of min to be k
                }
                if (min != j) {                                                 // If the min has been changed from the default value
                    int temp = array[i][j];                                     // Set temp to the value in array[i][j]
                    array[i][j] = array[i][min];                                // Reassign the value of array[i][j] to be the minimum of array[i][min]
                    array[i][min] = temp;                                       // Reassign the value of array[i][min] to be temp
                }
            }
        }
        return array;                                                           // Return the sorted array
    }
    
    public static int[][] insertionSort(int[][] array) {                        // Method for insertion sort to sort the rows in the main array
        for (int i = 1; i < array.length; i++) {                                // For loop --> Keep track of which row is being sorted
            for (int j = i; j > 0; j--) {                                       // For loop --> Keep track of which row could be switched
                if (array[j].length < array[j - 1].length) {                    // If sorted row length is less than row above
                    int temp = array[j];                                        // Set temp to be row array[j]
                    array[j] = array[j - 1];                                    // Reassign row array[j] to be row array[j - 1]
                    array[j - 1] = temp;                                        // Reassign row array[j - 1] to be row temp
                }
            }
        }
        return array;                                                           // Return sorted array
        }
    
    public static void printArray (int[][] input) {                             // Method to print array
        for (int i = 0; i < input.length; i++) {                                // For loop --> Keep track of which row is to be printed
            for (int j = 0; j < input[i].length; j++) {                         // For loop --> Keep track of which member is to be printed
                System.out.print(input[i][j] + " ");                            // Print out value in array[i][j] and a space
            }
            System.out.println("");                                             // Print out a new line
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                 // Declare and initialize an instance of Scanner named input
        Random randomGenerator = new Random();                                  // Declare and initialize an instance of Random named randomGenerator
        int row = 0;                                                            // Declare and initialize variables for future use
        int column = 0;
        boolean found = false;

        System.out.print("Please enter an integer to denote the size of main array: "); // Ask user for the size of desired array
        int mainSize = input.nextInt();                                         // Assign input into an integer variable named mainSize
    
        int[][] array = new int[mainSize][];                                    // Declare and allocate an array with the size of mainSize with unallocated members

        for (int i = 0; i < mainSize; i++) {                                    // For loop --> Keep track of which member of the main array is to be allocated
            int memberDimension = randomGenerator.nextInt(mainSize - 1);        // Generate a random number between [0, mainSize - 1] for memberDimension
            memberDimension++;                                                  // Increment memberDimension by adding 1 to avoid rows with 0 members
            array[i] = new int[memberDimension];                                // Allocate the size of the member of array[i] to be memberDimension
        }   

        for (int i = 0; i < mainSize; i++) {                                    // For loop --> Keep track of which row is to be assigned values
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which row member is going to be assigned a value
                array[i][j] = randomGenerator.nextInt(21);                      // Assign a random number between [0,20] to array[i][j]
            }   
        }

        System.out.println("Original Array: ");                                 // Print out statement
        printArray(array);                                                      // Call the printArray method to print out current array
        System.out.println("");                                                 // Print out a new line
        
        array = selectionSort(array);                                           // Call the selectionSort method to sort the numbers in each from smallest to largest
        System.out.println("Sorting Numbers Using Selection Sort: ");           // Print out statement
        printArray(array);                                                      // Call the printArray method to print out current array
        System.out.println ("");                                                // Print out a new line
        
        array = insertionSort(array);                                           // Call the insertionSort method to sort the rows by length from shortest to longest
        System.out.println("Sorting Rows Using Insertion Sort: ");              // Print out statement
        printArray(array);                                                      // Call the printArray to print out current array
        System.out.println ("");                                                // Print out a new line
        
        System.out.print ("Please enter a number to be found in the array: ");  // Ask user for a number to be found
        int desiredNumber = input.nextInt();                                    // Assign input to an integer variable named desiredNumber
        
        for (int i = 0; i < array.length; i++) {                                // For loop --> Keep track of which row is being searched
            for (int j = 0; j < array[i].length; j++) {                         // For loop --> Keep track of which column is being searched
                if (array[i][j] == desiredNumber) {                             // If the current row and column being searched has desiredNumber
                    row = i + 1;                                                // Assign row to be i + 1
                    column = j + 1;                                             // Assign column to be j + 1
                    found = true;                                               // Assign found to be true
                    break;                                                      // Exit the for loop
                }
            }
            if (found) {                                                        // If found is true
                break;                                                          // Exit the for loop
            }
        }
        
        if (found) {                                                            // If found is true
            System.out.println (desiredNumber + " was found.");                 // Print out statements
            System.out.println (desiredNumber + " is located in row " + row + " and column " + column + ".");
        }   
        else {                                                                  // Found is false
            System.out.println (desiredNumber + " was not found.");             // Print out statement
        }
        
    }
}