// Angela Nguyen
// April 14, 2016
// Professor Brian Chen
// CSE2 Linear Java Program

// Purpose: Ask the user to enter 15 ints for students' final grades
//          Check that user only enters ints
//          Error messages for: Enter something than an int, int is out of the 
//          range of [0,100], or int is not greater than or equal to last int
//          Print out final array
//          Prompt user to enter a grade to be searched for
//          Use linear search to find number and print out iterations if possible
//          Scramble the array and print out the scrambled array
//          Prompt user to enter a grade to be searched for
//          Use linear search to find number and print out iterations if possible
//          Write separate methods for linear search, binary search, selection, and random scrambling

import java.util.Scanner;                                                       // Import needed classes for future use
import java.util.Random;
import java.util.Arrays;

public class CSE2Linear {

    public static void sortedSearch(int[] grades, int key) {                    // Method to binarily search for a given grade
        int beginning = 0;                                                      // Declare and initialize needed variables for future use
        int end = grades.length - 1;
        int middle = 0;
        int counter = 0;
        boolean found = false;

        while (beginning <= end) {                                              // While loop --> Determines how many times the array can be halved
            middle = (beginning + end) / 2;                                     // Reassign middle with the value of indicating the middle of array
            if (key < grades[middle]) {                                         // If the key is less than the chosen middle of the array
                counter++;                                                      // Increment counter by adding 1
                end = middle - 1;                                               // Reassign the end of the half by subtracting 1 from the middle
            }
            else if (key > grades[middle]) {                                    // If the key is greater than the chosen middle of the array
                counter++;                                                      // Increment counter by adding 1
                beginning = middle + 1;                                         // Reassign the beginning of the half by adding 1 to the middle
            }
            else if (key == grades[middle]) {                                   // If the key is equal to the chosen middle of the array
                counter++;                                                      // Increment counter by adding 1
                found = true;                                                   // Reassign found to be true
                break;                                                          // Exit while looop
            }
        }

        if (found == true) {                                                    // If found is equal to true
            System.out.print(key + " was found in the list with " );            // Print out statements
            System.out.println(counter + " iterations.");
        }
        else {                                                                  // found is not equal to true
            System.out.print(key + " was not found in the list with " );        // Print out statements
            System.out.println(counter + " iterations.");
        }
    }

    public static void scrambledSearch(int[] grades, int key) {                 // Method to linearly search for a given grade
        int counter = 0;                                                        // Declare and initialize needed variables for future use
        boolean found = false;
        
        for (int i = 0; i < grades.length; i++) {                               // For loop --> Keeps track of how many members have been searched
            if (grades[i] == key) {                                             // If the given array member is equal to key
                counter++;                                                      // Increment counter by adding 1
                found = true;                                                   // Reassign found to be true
                break;                                                          // Exit for loop
            }
            else {                                                              // Given array member is not equal to key
                counter++;                                                      // Increment counter by adding 1
            }
        }

        if (found == true) {                                                    // If found is equal to true
            System.out.print(key + " was found in the list with " );            // Print out statements
            System.out.println(counter + " iterations.");   
        }
        else {                                                                  // found is not equal to true
            System.out.print(key + " was not found in the list with " );        // Print out statements
            System.out.println(counter + " iterations.");
        }
    }

    public static void main(String[] args) {
        int[] examGrades = new int[15];                                         // Declare and allocate an integer array named examGrades with size 15

        Scanner input = new Scanner(System.in);                                 // Declare and initialize an instance of Scanner named input
        int grade = 0;                                                          // Declare and initialize needed variables for future use
        int i = 0;
        int comparison = 0;
        int searchGrade = 0;

        System.out.println("Enter 15 integers for final grades in CSE2: ");     // Ask user to input 15 integers

            while (i < 15) {                                                    // While loop --> Keep track of how many array members have been reassigned
                if (input.hasNextInt()) {                                       // If input has an integer
                    grade = input.nextInt();                                    // Reassign the value of grade to be input value
                    if (grade >= 0 && grade <= 100 && grade >= comparison) {    // If grade is in the range [0,100] and greater than the previous array member
                        examGrades[i] = grade;                                  // Assign the value of grade to examGrades[i]
                        comparison = examGrades[i];                             // Reassign the value of comparison to be examGrades[i]
                        i++;                                                    // Increment i by adding 1
                    }
                    else {                                                      // Input is not an integer
                        if (grade < 0 || grade > 100) {                         // If grade is not in the range [0,100]
                            System.out.print("One of the grades entered was "); // Print out statements
                            System.out.println ("not in the range of [0,100].");
                            System.out.print("Please enter " + (15 - i));       // Ask user to enter remaining values needed
                            System.out.print (" more entries. ");
                            input = new Scanner(System.in);                     // Reinitalize input Scanner
                        }
                        else {                                                  // i is not in range [0,100]
                            System.out.print("One of the grades entered");      // Print out statements
                            System.out.print (" was not greater than or ");
                            System.out.println ("equal to grade previous to it.");
                            System.out.print("Please enter " + (15 - i));       // Ask user to enter remaining values needed
                            System.out.print (" more entries. ");
                            input = new Scanner(System.in);                     // Reinitalize input Scanner                
                        }
                    }
                }
                else {                                                          // Input is not an integer
                    System.out.print("One of the the grades entered was ");     // Print out statenebt
                    System.out.println("not an integer.");
                    System.out.print("Please enter " + (15 - i));               // Ask user to enter remaining values needed
                    System.out.print (" more entries. ");
                    input = new Scanner(System.in);                             // Reinitalize input Scanner
                }
            }

            System.out.println("Sorted: ");                                     // Print out statement
            Arrays.sort(examGrades);                                            // Sort the array of exam grades

            for (int number: examGrades) {                                      // For each member of the array examGrades
                System.out.print(number + " ");                                 // Print out each value and a space
            }

            System.out.println("");                                             // Print out a new line

            System.out.print("Enter a grade to search for: ");                  // Ask the user for a grade to search for
            searchGrade = input.nextInt();                                      // Assign the input to be the value of searchGrade
            
            sortedSearch(examGrades, searchGrade);                              // Call method named sortedSearch to perform a binary search on examGrades to find a grade

            for (i = 0; i < examGrades.length; i++) {                           // For loop --> Determine how to scramble the array
                int target = (int)(examGrades.length * Math.random());          // Determine which member will be switched with examGrades[i]
                int temp = examGrades[target];                                  // Assign the value of the randomly chosen array member to temp
                examGrades[target] = examGrades[i];                             // Reassign the value in examGrades[target] to be the value in examGrades[i]
                examGrades[i] = temp;                                           // Reassign the value in examGrades[i] to be the value in temp
            }

            for (int number: examGrades) {                                      // For each member of the array examGrades
                System.out.print(number + " ");                                 // Print out each value and a space
            }

            System.out.println("");                                             // Print out a new line

            System.out.print("Enter a grade to search for: ");                  // Ask the user for a grade to search for
            searchGrade = input.nextInt();                                      // Assign the input to be the value of searchGrade
            scrambledSearch(examGrades, searchGrade);                           // Call method named scrambledSearch to perform a linear search on examGrades to find a grade
    }
}
