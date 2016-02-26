import java.util.Scanner;

public class Practice {
    public static void main (String [] args){
        Scanner questions;
        questions = new Scanner (System.in);
        double bigMacCost = 2.22;
        double friesCost = 2.15;
        System.out.print ("Enter the number of Big Macs: ");
      if (questions.hasNextInt()) {
          int bigMac = questions.nextInt();
          if (bigMac > 0) {
              double totalBigMac = (int) (bigMacCost * bigMac * 100) / 100.0;
              System.out.printf ("You ordered " + bigMac + " Big Macs for a cost of $%2.2f. \n", totalBigMac);
              System.out.print ("Do you want an order of fries? Y/y/N/n ");
              String answer = questions.next();
              if (answer.equals("Y") || answer.equals("y")) {
                  System.out.printf ("You ordered fries at a cost of $%2.2f. \n", friesCost);
                  System.out.printf ("The total cost of your order is $%2.2f. \n", (totalBigMac + friesCost));
                  return;
              }
              if (answer.equals("N") || answer.equals("n")) {
                  System.out.printf ("The total cost of your order is $%2.2f. \n", totalBigMac);
              }
              else {
                  System.out.println ("You did not enter Y or N. Please try again.");
              }
            }
            else {
                System.out.println ("You did not enter a postive valid integer. Please try again.");
            }
          }
          else {
              System.out.println ("You did not enter a valid integer. Please try again.");
          }
      }
    }
          