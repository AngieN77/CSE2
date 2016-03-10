import java.util.Scanner;

public class NumberStack {
    public static void main (String[] args) {
        Scanner number;
        number = new Scanner (System.in);
        
        System.out.print ("Enter a number between 1 and 9 inclusive: ");
        int value = number.nextInt();
        int i, j, k ,l;
        
        System.out.println ("Using for loops: ");
        
        for (i = 1; i <= value; i++) {
            for (k = 1; k <= i; k++) {
               for (j = 1; j <= i + (i - 1); j++) {
                    System.out.print (i);
                }
                System.out.println (" "); 
            }
            for (l = 1; l <= i + (i - 1); l++) {
                System.out.print ("-");
            }
            System.out.println (" ");
        }
        
        System.out.println ("Using while loops: ");
         i = 1;
        while (i <= value) {
            k = 1;
            while (k <= i) {
                j = 1;
                while (j <= i + (i - 1)) {
                    System.out.print (i);
                    j++;
                }
                System.out.println (" ");
                k++;
            }
            l = 1;
            while (l <= i + (i - 1)) {
                System.out.print ("-");
                l++;
            }
            System.out.println (" ");
            i++;
        }
        
        System.out.println ("Using do-while loops: ");
        i = 1;
        do {
            k = 1;
            do {
                j = 1;  
                do {
                    System.out.print (i);
                    j++;
                }
                while (j <= i + (i - 1));
                System.out.println (" ");
                k++;
            } 
            while (k <= i);
            l = 1;
            do {
                System.out.print ("-");
                l++;
            }
            while (l <= i + (i - 1));
            System.out.println (" ");
            i++;
        } while (i <= value);
    }
}