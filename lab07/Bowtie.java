// Angela Nguyen
// March 11, 2016
// CSE 2 - Prof. Brian Chen
// Bowtie Java Program

// Purpose: Write a program that prints out a bowtie
//          Using a while loop, for loop, and do-while loop
//          With break statements

import java.util.Scanner;                                                                               

public class Bowtie {
    public static void main(String[] args) {
        // Declaring and initializing variables for future use in loops
        int nStars = 0;
        int limitStar;
        int limitLine = 0;
        int limitSpace = 0;
        int space = 0;
        int spaceIncrement = 2;
        int starIncrement = 2;
        int line = 0;
        int star = 0;
        boolean flip = false;
        String answer = " ";
        // Constructing and declaring instance of Scanner to ask for user input
        Scanner stars;
        stars = new Scanner(System.in);
        
        // While loop to ask for continuation of program and input value
        while (true) {
            System.out.print("Please press Y/y in order to continue if not click anything else: ");     // Ask the user if they want to continue with the program
            answer = stars.next();                                                                      // Assigns the string answer with the input value
            if (answer.equals("y") || answer.equals("Y")) {                                             // Checks to see if answer matches "y" or "Y"
                while (true) {                                                                          // Answer is either "y" or "Y" --> Continue with Bowtie program
                    System.out.print("Enter an odd integer between 3 and 33 inclusive: ");              // Asks user for an odd integer between [3,33]
                    if (stars.hasNextInt()) {                                                           // Checks to see if input is an integer
                        nStars = stars.nextInt();                                                       // Input is an integer --> Assign nStars with input value
                        if (nStars >= 3 && nStars <= 33) {                                              // Checks to see if nStars is between [3,33]
                            if ((nStars + 1) % 2 == 0) {                                                // nStars is within range --> Checks to see if nStars is odd
                                limitLine = nStars;                                                     // nStars is odd --> Assign limitLine with value of nStars
                                limitStar = nStars;                                                     // nStars is odd --> Assign limitStar with value of nStars
                                break;                                                                  // Exit the loop if all conditions are met
                            }
                        }
                    }
                }
                
                // While Loop
                while (true) {                                                                          // While loop --> Keeps track of how many lines are printed
                    if (line == limitLine) {                                                            // Checks to see if # of lines printed is equal to limitLine
                        break;                                                                          // Exit the line printing loop
                    }
                    while (true) {                                                                      // While loop --> Keeps track of how many spaces are printed
                        if (space == limitSpace) {                                                      // Checks to see if # of spaces printed is equal to limitSpace
                            limitSpace += spaceIncrement;                                               // Space equals limitSpace --> Add spaceIncrement to limitSpace
                            space = 0;                                                                  // Space equals limitSpace --> Reset space to 0
                            break;                                                                      // Exit the space printing loop
                        }
                        System.out.print(" ");                                                          // Print out a space
                        space++;                                                                        // Increment space by 1
                        if (limitSpace == (nStars - 1) && flip == false) {                              // Check to see if limitSpace = nStars - 1 and flip = false
                            spaceIncrement *= -1;                                                       // limitSpace = nStars - 1 && flip = false --> Flip parity of spaceIncrement
                            flip = true;                                                                // limitSpace = nStars - 1 && flip = false -->
                        }                                                                               // Set flip to true to prevent parity change
                    }
                    while (true) {                                                                      // While loop --> Keeps track of how many stars are printed
                        if (star >= limitStar) {                                                        // Checks to see if # of stars printed equals limitStar
                            limitStar -= starIncrement;                                                 // star equals limitStar --> Subtract starIncrement from limitStar
                            star = 0;                                                                   // Reset star to 0
                            break;                                                                      // Exit star printing loop
                        }
                        System.out.print("* ");                                                         // Print out a star with a space
                        star++;                                                                         // Increment star by 1
                        if (limitStar <= 1) {                                                           // Check to see if limitStar is greater than 1
                            starIncrement *= -1;                                                        // limitStar greater than 1 --> Flip parity of starIncrement
                        }
                    }
                    System.out.println(" ");                                                            // Begin a new line
                    line++;                                                                             // Increment line by 1
                } 
                // For loop
                /* for (line = 0; line < limitLine; line++) {                                           // For loop --> Keeps track of lines printed is less than limitLine
                    for (space = 0; space < limitSpace; space++) {                                      // For loop --> Keeps track of spaces printed is less than limitSpace
                        System.out.print (" ");                                                         // Print out a space
                    }                                                                                   // Increment space by 1
                    limitSpace += spaceIncrement;                                                       // Add spaceIncrement to limitSpace if line is greater than limitLine
                    if (limitSpace == (nStars - 1) && flip == false) {                                  // Check to see if limitSpace = nStars - 1 and flip = false
                        spaceIncrement *= -1;                                                           // limitSpace = nStars - 1 && flip = false --> Flip parity of spaceIncrement
                        flip = true;                                                                    // limitSpace = nStars - 1 && flip = false -->
                        }                                                                               // Set flip to true to prevent parity change
                    for (star = 0; star < limitStar; star++) {                                          // For loop --> Keeps track of stars is less than limitStar
                        System.out.print ("* ");                                                        // Print out a star and space
                    }                                                                                   // Increment star by 1
                    limitStar -= starIncrement;                                                         // Subtract starIncrement from limitStar if star is greater than limitStar
                    if (limitStar <= 1) {                                                               // Check to see if limitStar is less than or equal to 1
                        starIncrement *= -1;                                                            // limitStar less than or equal to 1 --> Flip parity of starIncrement
                    }
                    System.out.println(" ");                                                            // Begine a new line
                } */                                                                                    // Increment line by 1
                // Do while loop
               /* do {                                                                                  // Do-while loop --> Keeps track of lines printed
                    space = 0;                                                                          // Reset space to 0
                    do {                                                                                // Do-while loop --> Keeps track of spaces printed
                        if (space == limitSpace) {                                                      // Check to see if space is equal to limitSpace
                            limitSpace += spaceIncrement;                                               // space equal to limitSpace --> Add spaceIncrement to limitSpace
                            if (limitSpace == (nStars - 1) && flip == false) {                          // Check to see if limitSpace = nStars - 1 and flip = false
                                spaceIncrement *= -1;                                                   // limitSpace = nStars - 1 && flip = false --> Flip parity of spaceIncrement
                                flip = true;                                                            // limitSpace = nStars - 1 && flip = false -->
                            }                                                                           // Set flip to true to prevent parity change
                            break;                                                                      // Exit the space printing loop
                        }
                        System.out.print(" ");                                                          // Print out a space
                        space++;                                                                        // Increment space by 1
                    }
                    while (space <= limitSpace);                                                        // Check to see if space is less than or equal to limitSpace
                    star = 0;                                                                           // Reset star to 0
                    do {                                                                                // Do-while loop --> Keeps track of stars printed
                        if (star == limitStar) {                                                        // Check to see if star is equal to limitStar
                            limitStar -= starIncrement;                                                 // star equal to limitStar --> Subtract starIncrement from limitStar
                            if (limitStar <= 1) {                                                       // Check to see if limitStar less than or equal to 1
                                starIncrement *= -1;                                                    // limitStar less than or equal to 1 --> Flip parity of starIncrement
                            }
                            break;                                                                      // Exit the star printing loop
                        }
                        System.out.print("* ");                                                         // Print out a star with a space
                        star++;                                                                         // Increment star by 1
                    }
                    while (star <= limitStar);                                                          // Check to see if star is less than or equal to limitStar
                    line++;                                                                             // Increment line by 1
                    System.out.println(" ");                                                            // Begin a new line
                }
                while (line < limitLine); */                                                            // Check to see if line is less than limitLine
                // Reinitialize variables for continuous loop
                nStars = 0;
                limitLine = 0;
                limitSpace = 0;
                space = 0;
                spaceIncrement = 2;
                starIncrement = 2;
                line = 0;
                star = 0;
                flip = false;
                answer = " ";
            }
            else {                                                                                      // If user inputs something other than "y" or "Y"
                System.out.println ("You have exited the program.");                                    // Print out statement
                break;                                                                                  // Exit out of the entire program
            }
        }
    }
}