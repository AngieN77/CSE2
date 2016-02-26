import java.util.Scanner;

public class Convert {
    public static void main (String[] args) {
        Scanner questions;
        questions = new Scanner (System.in);
        
        System.out.print ("Please enter a binary number to be converted into a decimal: ");
        int number = questions.nextInt();
        
        switch (number) {
            case 0:
                System.out.println ("0 translated in binary is 0.");
                break;
            case 1:
                System.out.println ("1 translated in binary is 1.");
                break;
            case 10:
                System.out.println ("10 translated in binary is 2.");
                break;
            case 11:
                System.out.println ("11 translated in binary is 3.");
                break;
            case 100:
                System.out.println ("100 translated in binary is 4.");
                break;
            case 101:
                System.out.println ("101 translated in binary is 5.");
                break;
            case 110:
                System.out.println ("110 translated in binary is 6.");
                break;
            case 111:
                System.out.println ("111 translated in binary is 7.");
                break;
            default:
                System.out.println ("You did not enter a valid integer. Please try again.");
        }
    }
}