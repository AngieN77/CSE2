// Purpose: Troubleshoot exam problems

import java.util.Scanner;

public class Exam {
    public static void  main (String[] args) {
            Scanner scan = new Scanner( System.in );
          System.out.println("input octal integer with value between 0 and 512.");

          int octalVal = scan.nextInt();
          
          // it is also acceptable to have >=1000
          if( octalVal < 0 || octalVal > 777 ){	
               System.out.println("bad value.  exiting.\n");
               System.exit(0); //not necessary
          }
          else{
               int sixtyFoursDigit = octalVal / 100;
               System.out.println (sixtyFoursDigit);
               int eightsDigit = (octalVal % 100) / 10;
               int onesDigit = (octalVal % 10);
          
               int decimalResult = (sixtyFoursDigit*64) + (eightsDigit*8) + (onesDigit*1);
               System.out.println("The value is " + decimalResult + " in decimal.");
          }

    }
}