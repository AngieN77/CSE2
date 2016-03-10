// Purpose: Troubleshoot exam problems

import java.util.Scanner;

public class NoBreaks {
    public static void main(String x[]) {
        Scanner scan = new Scanner(System.in);

        int a = 0, b = 0;
        while (true) {
            System.out.println("Enter two positive ints (0 to quit)- ");
            if (!scan.hasNextInt()) {
                System.out.println("You must enter an int");
                scan.next(); //get rid of the garbage
                continue;
            }
            a = scan.nextInt();
            if (!scan.hasNextInt()) {
                System.out.println("You must enter an int");
                scan.next(); //get rid of the garbage
                continue;
            }
            b = scan.nextInt();
            if (a == 0 || b == 0)
                break;
            if (a < 0 || b < 0) {
                System.out.println("Both ints must be positive (or 0 to quit)");
                continue;
            }
            System.out.print("(" + a + ", " + b + ") = ");
            while (true) {
                if (a == b) {
                    System.out.println(a);
                    break;
                }
                if (a < b) {
                    b -= a;
                    continue;
                }
                a -= b;
            }
        }
    }
}