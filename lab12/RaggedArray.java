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

import java.util.Scanner;
import java.util.Random;

public class RaggedArray {

    public static int[][] selectionSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int min = j;
                for (int k = j + 1; k < array[i].length; k++) 
                if (array[i][k] < array [i][min]) {
                    min = k;
                }
                if (min != j) {
                    int temp = array[i][j];
                    array[i][j] = array[i][min];
                    array[i][min] = temp;
                }
            }
        }

        return array;
    }
    
    public static int[][] insertionSort(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].length < array[j - 1].length) {
                    int[] temp= array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
    
    public static void printArray (int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        int row = 0;
        int column = 0;
        boolean found = false;

        System.out.print("Please enter an integer to denote the size of main array: ");
        int mainSize = input.nextInt();

        int[][] array = new int[mainSize][];

        for (int i = 0; i < mainSize; i++) {
            int memberDimension = randomGenerator.nextInt(mainSize - 1);
            memberDimension++;
            array[i] = new int[memberDimension];
        }

        for (int i = 0; i < mainSize; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomGenerator.nextInt(21);
            }
        }

        System.out.println("Original Array: ");

        printArray(array);

        System.out.println("");
        array = selectionSort(array);

        System.out.println("Sorting Numbers Using Selection Sort: ");
        printArray(array);
        
        System.out.println ("");
        array = insertionSort(array);
        
        System.out.println("Sorting Rows Using Insertion Sort: ");
        printArray(array);
        
        System.out.println ("");
        System.out.print ("Please enter a number to be found in the array: ");
        int desiredNumber = input.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == desiredNumber) {
                    row = i + 1;
                    column = j + 1;
                    found = true;
                }
            }
        }
        
        if (found) {
            System.out.println (desiredNumber + " was found.");
            System.out.println (desiredNumber + " is located in row " + row + " and column " + column + ".");
        }
        else {
            System.out.println (desiredNumber + " was not found.");
        }
        
    }
}