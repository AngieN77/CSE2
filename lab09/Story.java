// Angela Nguyen
// March 25, 2016
// Professor Brian Chen
// Story Java Program

// Purpose: Create 4 methods to correspond to four sentence components
//          Each method should generate a random integer from 0-9
//          Select a random adjective//subject/verb/object from switch statement
//          Return the word as a string

import java.util.Random;                                                        // Import needed Random and Scanner classes
import java.util.Scanner;

public class Story {
    
    public static String article1() {                                           // Method to randomly pick a random article
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named randomGenerator
        int randomInt = randomGenerator.nextInt(3);                             // Assign randomInt a random integer from randomGenerator from 0-3
        String word = " ";                                                      // Declare and initialize a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which article is picked based off of which number (0-3) is generated
                word = "The ";
                break;
            case 1:
                word = "That ";
                break;
            case 2:
                word = "This ";
                break;
           }
        return word;                                                            // Returns the word picked to the variable assigned to adjective() in main method (word1)
    }
    public static String adjective() {                                          // Method to randomly pick a random adjective
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named RandomGenerator
        int randomInt = randomGenerator.nextInt(10);                             // Assign randomInt a random integer from randomGenerator from 0-10
        String word = " ";                                                      // Declare and initialze a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which adjective is picked based off of which number (0-10) is generated
                word = "horrid";
                break;
            case 1:
                word = "musky ";
                break;
            case 2:
                word = "suspicious ";
                break;
            case 3:
                word = "crafty ";
                break;
            case 4:
                word = "fearsome ";
                break;
            case 5:
                word = "naive ";
                break;
            case 6:
                word = "bald ";
                break;
            case 7:
                word = "tiny ";
                break;
            case 8:
                word = "lost ";
                break;
            case 9:
                word = "jovial ";
                break;
        }
        return word;                                                            // Returns the word picked to the variable assigned to adjective() in the main method
    }
    public static String subject() {                                            // Method to randomly pick a random subject
       Random randomGenerator = new Random();                                   // Declare and construct an instance of Random class named RandomGenerator
        int randomInt = randomGenerator.nextInt(10);                             // Assign randomInt a random integer from randomGenerator from 0-10
        String word = " ";                                                      // Declare and initialze a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which verb is picked based off of which number (0-10) is generated
                word = "dog ";
                break;
            case 1:
                word = "teddy bear ";
                break;
            case 2:
                word = "mailman ";
                break;
            case 3:
                word = "orange ";
                break;
            case 4:
                word = "squirrel ";
                break;
            case 5:
                word = "van ";
                break;
            case 6:
                word = "umbrella ";
                break;
            case 7:
                word = "mouse ";
                break;
            case 8:
                word = "ape ";
                break;
            case 9:
                word = "zebra ";
                break;
        }
        return word;                                                            // Returns the word picked to the variable assigned to subject() in the main method
    }
    public static String verb() {                                               // Method to randomly pick a random verb
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named RandomGenerator
        int randomInt = randomGenerator.nextInt(10);                             // Assign randomInt a random integer from randomGenerator from 0-10
        String word = " ";                                                      // Declare and initialze a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which verb is picked based off of which number (0-10) is generated
                word = "coddled ";
                break;
            case 1:
                word = "kidnapped ";
                break;
            case 2:
                word = "shared ";
                break;
            case 3:
                word = "annhilated ";
                break;
            case 4:
                word = "adventured through ";
                break;
            case 5:
                word = "gouged ";
                break;
            case 6:
                word = "observed ";
                break;
            case 7:
                word = "nurtured ";
                break;
            case 8:
                word = "fought ";
                break;
            case 9:
                word = "annoyed ";
                break;
        }
        return word;                                                            // Returns the word picked to the variable assigned to verb() in the main method
    }
    public static String article2() {                                           // Method to randomly pick a second article
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named RandomGenerator
        int randomInt = randomGenerator.nextInt(3);                             // Assign randomInt a random integer from randomGenerator from 0-3
        String word = " ";                                                      // Declare and initialze a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which article is picked based off of which number (0-3) is generated
                word = "the ";
                break;
            case 1:
                word = "that ";
                break;
            case 2:
                word = "this ";
                break;
        }
        return word;                                                            // Returns the word picked to the variable assigned to article2() in the main method
    }
    public static String object() {                                             // Method to choose a random object
        Random randomGenerator = new Random();                                  // Declare and construct an instance of Random class named RandomGenerator
        int randomInt = randomGenerator.nextInt(10);                             // Assign randomInt a random integer from randomGenerator from 0-10
        String word = " ";                                                      // Declare and initialze a string variable named word with a space
        switch (randomInt) {                                                    // Switch statement based off of randomInt to determine which word will be chosen
            case 0:                                                             // Following lines: Defines which object is picked based off of which number (0-10) is generated
                word = "blueberry pancake.";
                break;
            case 1:
                word = "smelly foot.";
                break;
            case 2:
                word = "jumping rabbit.";
                break;
            case 3:
                word = "annoying adolescent.";
                break;
            case 4:
                word = "miniature muskrat.";
                break;
            case 5:
                word = "giant panda.";
                break;
            case 6:
                word = "dancing dinosaur.";
                break;
            case 7:
                word = "lying lemur.";
                break;
            case 8:
                word = "puny Pikachu.";
                break;
            case 9:
                word = "graceful giraffe.";
                break;
        }
        return word;                                                            // Returns the word picked to the variable assigned to article2() in the main method
    }

    public static void main(String[] args) {
        Scanner question;                                                       // Declare an instance of the Scanner class named question
        question = new Scanner(System.in);                                      // Construct an instance of the Scanner class

        while (true) {                                                          // While loop --> To continue program when user says yes
            String word1, word2, word3, word4, word5, word6;                    // Declare needed variable to generate sentence
            
            word1 = article1();                                                 // Call article1 method to assign a word to word1
            word2 = adjective();                                                // Call adjective method to assign a word to word2
            word3 = subject();                                                  // Call subject method to assign a word to word3
            word4 = verb();                                                     // Call verb method to assign a word to word4
            word5 = article2();                                                 // Call article2 method to assign a word to word5
            word6 = object();                                                   // Call object method to assign a word to word6
    
            System.out.println (word1 + word2 + word3 +  word4 + word5 + word6);        // Print out sentence generated from above methods
            System.out.print("Do you want to continue generating another sentence? ");  // Ask user for input to continue program or not
            String answer = " ";                                                        // Declare and initialize a string variable named answer with a space
            answer = question.next();                                                   // Assign answer with the input of the user
            if (answer.equals("y") || answer.equals("Y")) {                             // Check if answer is equal to "y" or "Y"
                continue;                                                               // Answer is either "y" or "Y" --> Continue with the program
            }   
            else {                                                                      // Answer is not "y" or "Y"
                System.out.println("You have exited the random sentence generator.");   // Print out statement
                break;                                                                  // Leave the while loop --> Ends program
            }
        }
    }
}