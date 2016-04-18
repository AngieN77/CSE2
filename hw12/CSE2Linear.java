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

    public static boolean sortedCheck(int[] grades) {                           
        boolean valid = true;
        Arrays.sort(grades);

        for (int i = 1; i < grades.length - 1; i++) {
            if (grades[i] >= grades[i - 1]) {
                continue;
            }
            else {
                System.out.println("One of the values was not greater than the other.");
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static void sortedSearch(int[] grades, int key) {                    // Method to linear
        int beginning = 0;
        int end = grades.length - 1;
        int middle = 0;
        int counter = 0;
        boolean found = false;

        while (beginning <= end) {
            middle = (beginning + end) / 2;
            if (key < grades[middle]) {
                counter++;
                end = middle - 1;
            }
            else if (key > grades[middle]) {
                counter++;
                beginning = middle + 1;
            }
            else if (key == grades[middle]) {
                counter++;
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println(key + " was found in the list with " + counter + " iterations.");
        }
        else {
            System.out.println(key + " was not found in the list with " + counter + " iterations.");
        }
    }

    public static void scrambledSearch(int[] grades, int key) {
        int counter = 0;
        boolean found = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == key) {
                counter++;
                found = true;
                break;
            }
            else {
                counter++;
            }
        }
        
        if (found == true) {
            System.out.println(key + " was found in the list with " + counter + " iterations.");
        }
        else {
            System.out.println(key + " was not found in the list with " + counter + " iterations.");
        }
    }

    public static void main(String[] args) {
        int[] examGrades = new int[15];

        Scanner input = new Scanner(System.in);
        int grade = 0;
        boolean resume = true;
        boolean loop = true;

        while (resume == true) {
            System.out.println("Enter 15 integers for final grades in CSE2: ");

            for (int i = 0; i < 15; i++) {
                if (input.hasNextInt()) {
                    grade = input.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        examGrades[i] = grade;
                    }
                    else {
                        System.out.println("One of the grades entered was not in the range of [0,100].");
                        resume = false;
                        break;
                    }
                }
                else {
                    System.out.println("One of the the grades entered was not an integer.");
                    resume = false;
                    break;
                }
            }

            if (resume == false) {
                System.out.println("The program will now exit.");
                break;
            }

            /*resume = sortedCheck(examGrades);
            
             if (resume == false) {
                System.out.println("The program will now exit.");
                break;
            } */

            System.out.println("Sorted: ");
            Arrays.sort(examGrades);

            for (int number: examGrades) {
                System.out.print(number + " ");
            }

            System.out.println("");

            System.out.print("Enter a grade to search for: ");
            int searchGrade = input.nextInt();
            // Sorted --> Binary
            sortedSearch(examGrades, searchGrade);
            
            for (int i = 0; i < examGrades.length; i++) {
                int target = (int) (examGrades.length * Math.random());
                int temp = examGrades[target];
                examGrades[target] = examGrades[i];
                examGrades[i] = temp;
            }
            
            for (int number: examGrades) {
                System.out.print(number + " ");
            }
            
            System.out.println ("");
            
            System.out.print("Enter a grade to search for: ");
            searchGrade = input.nextInt();
            scrambledSearch(examGrades, searchGrade);
            
            // Scrambled --> Linear
            /* interation = scrambledSearch(examGrades, searchGrade);

            System.out.println ("interation: " + interation); */
            resume = false; 
        }
    }
}
