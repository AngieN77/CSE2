// Angela Nguyen
// April 8, 2016
// Professor Brian Chen
// Midterms Java Program

// Purpose: Ask a user to enter a random number of students' names into an array
//          Randomly generate midterm grades into an array the same size as students array
//          Print out the two arrays with each student name next to their grade

import java.util.Scanner;
import java.util.Random;

public class Midterms {
    public static void main (String[]  args) {
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named randomGenerator
        int size = randomGenerator.nextInt(5);                                  // Assign a random value from 5-10 into an integer variable named size
        size += 5;                                                              // Add 5 to the random value to account for numbers generated less than 5
        
        String [] studentNames = new String[size];                              // Declare a string array for student names with the size of the randomly generated number
        int [] midtermGrades = new int[size];                                   // Declare an integer array for the midterm grades with the size of the randomly generated number
        
        Scanner input = new Scanner (System.in);                                // Declare and construct an instance of the Scanner class with the name input
        System.out.println ("Enter " + size + " student names: ");              // Ask the user for names of the students
        for (int i = 0; i < size; i++) {                                        // For loop --> Keep track of the number of student names inputted
            studentNames[i] = input.next();                                     // Assigns each name into studentNames array with a specific index
        }
        
        for (int i = 0; i < size; i++) {                                        // For loop --> Keep track of the number of midterm grades randomly generated
            int grade = (int) (randomGenerator.nextInt(100) / 10) * 10;
            midtermGrades[i] = grade;                    // Assigns each grade into midtermGrades array with a specific index
        }
        
        System.out.println ("Here are the midterm grades of the " + size + " students above: "); // Print out statement
        for (int i = 0; i < size; i++) {                                        // For loop --> Keeps track of the location in the array that is to be printed
            System.out.println (studentNames[i] + ": " + midtermGrades[i]);     // Print out the student name and their grade
        }
    }
}