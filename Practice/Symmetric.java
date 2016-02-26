import java.util.Scanner;

public class Symmetric {
      public static void main(String[]  args){  
          Scanner question;
          question = new Scanner (System.in);
          
          System.out.print ("Enter a number to reverse: ");
          int originalNumber = question.nextInt();
          int number = originalNumber;
          int reverse = 0;
          int remainder;
          
          while (number != 0) {
              remainder = number % 10;
              reverse = reverse * 10 + remainder;
              number = number / 10;
          }
          
          int check = originalNumber % reverse;
          if (check != 0) {
              System.out.println ("The number " + originalNumber + " is not symmetric.");
          }
          else {
              System.out.println ("The number " + originalNumber + " is symmetric.");
          }
      }
}