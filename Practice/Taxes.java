import java.util.Scanner;

public class Taxes {
    public static void main (String[] args) {
        Scanner taxes;
        taxes = new Scanner (System.in);
        
        final double standardDedeuction = 9000;
        final double userDeduction = 2500;
        final double tax1 = .1 * 12000;
        
        double netIncome, tax2, totalTax;
        
        System.out.print ("Enter your gross income for 2013 - $");
        
        if (taxes.hasNextDouble()) {
            double salary = taxes.nextDouble();
            if (salary > 0) {
                System.out.print ("Are you married (YES/NO)? ");
                String answer = taxes.next();
                if (answer.equals("YES")) {
                    System.out.print ("Enter the number of children: ");
                    int children = taxes.nextInt();
                    if (children > 0) {
                        netIncome = salary - standardDedeuction - (2 + children) * userDeduction;
                        if (netIncome < 0) {
                            System.out.println ("Your net income is less than $0, so you have no tax to pay.");
                            return;
                        }
                        tax2 = (netIncome - 12000) * .18;
                        totalTax = tax1 + tax2;
                       System.out.printf ("Your net income, after deduction, is $%4.2f, and your tax is $%4.2f\n", netIncome, totalTax);
                    }
                    else {
                        System.out.println ("You did not enter a valid answer for the number of children.");
                    }
                }
                else if (answer.equals("NO")) {
                    netIncome = salary - standardDedeuction - userDeduction;
                    if (netIncome < 0) {
                        System.out.println ("Your net income is less than $0, so you have no taxes to pay.");
                        return;
                    }
                    tax2 = (netIncome - 12000) * .18;
                    totalTax = tax1 + tax2;
                    System.out.printf ("Your net income, after deduction, is $%4.2f, and your tax is $%4.2f\n", netIncome, totalTax);
                }
                else {
                    System.out.println ("You did not enter a valid answer. Please try again.");
                }
            }
            else {
                System.out.println ("You did not enter a positive value. Please try again.");
                return;
            }
        }
        else {
            System.out.println ("You did not enter an acceptable double value. Please try again.");
        }
    }
}