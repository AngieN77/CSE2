// Angela Nguyen
// March 25, 2016
// Professor Brian Chen
// Story Java Program

// Purpose: Create 4 methods to correspond to four sentence components
//          Each method should generate a random integer from 0-9
//          Select a random adjective//subject/verb/object from switch statement
//          Return the word as a string
import java.util.Random;
import java.util.Scanner;

public class Story {
    
    public static String article1() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(2);
        String word = " ";
        switch (randomInt) {
            case 0:
                word = "The ";
                break;
            case 1:
                word = "That ";
                break;
            case 2:
                word = "This ";
                break;
           }
        return word;
    }
    public static String adjective() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(9);
        String word = " ";
        switch (randomInt) {
            case 0:
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
        return word;
    }
    public static String subject() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(9);
        String word = " ";
        switch (randomInt) {
            case 0:
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
        return word;
    }
    public static String verb() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(9);
        String word = " ";
        switch (randomInt) {
            case 0:
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
        return word;
    }
    public static String article2() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(2);
        String word = " ";
        switch (randomInt) {
            case 0:
                word = "the ";
                break;
            case 1:
                word = "that ";
                break;
            case 2:
                word = "this ";
                break;
        }
        return word;
    }
    public static String object() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(9);
        String word = " ";
        switch (randomInt) {
            case 0:
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
        return word;
    }

    public static void main(String[] args) {
        Scanner question;
        question = new Scanner(System.in);

        while (true) {
            String word1, word2, word3, word4, word5, word6;
            
            word1 = article1();
            word2 = adjective();
            word3 = subject();
            word4 = verb();
            word5 = article2();
            word6 = object();

            System.out.println (word1 + word2 + word3 +  word4 + word5 + word6);
            System.out.print("Do you want to continue generating another sentence? ");
            String answer = " ";
            answer = question.next();
            if (answer.equals("y") || answer.equals("Y")) {
                continue;
                
            }
            else {
                System.out.println("You have exited the random sentence generator.");
                break;
            }
        }
    }
}