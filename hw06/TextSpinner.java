// Angela Nguyen
// March 4, 2016
// CSE 2 - Prof. Brian Chen
// Text Spinner Java Program

// Purpose: Write an infinite loop that has a cursor rotating

public class TextSpinner {
    public static void main (String[] args) {
        while (true) {
            System.out.print ("/");
            System.out.print ("\b");
            System.out.print ("-");
            System.out.print ("\b");
            System.out.print ("\\");
            System.out.print ("\b");
            System.out.print ("|");
            System.out.print ("\b");
        }
    }
}