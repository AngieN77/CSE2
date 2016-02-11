// Angela Nguyen
// February 8, 2016
// CSE 2 - Prof. Brian Chen
// Arithmetic Java Program

// Purpose: Compute cost of items bought with 6% sales tax
//          Total cost of each kind of item
//          Sales tax charged on each item
//          Total cost of the purchase before tax
//          Total sales tax charged
//          Total paid the transaction, including sales tax

public class Arithmetic {
    // main method required for every Java program
    public static void main (String[] args) {
        // Assigning values to variables that represent the amount of items bought and their cost
        int pantsNumber = 3;        // declare integer variable and assigning value of 3 for number of pants
        double pantsCost = 34.98;   // declare double variable and assigning value of 34.98 for cost of 1 pant
        int shirtNumber = 2;        // declare integer variable and assigning value of 2 for number of shirts
        double shirtCost = 24.99;   // declare double variable and assigning value of 24.99 for cost of 1 shirt
        int beltNumber = 1;         // declare integer variable and assigning value of 1 for of belts
        double beltCost = 33.99;    // declare double variable and assigning value of 33.99 for cost of 1 belt
        double salesTax = 0.06;     // declare double variable and assigning value of 0.06 for PA sales tax
        
        // Declaring other needed double variables for following calcuations
        double pantsTotal, shirtTotal, beltTotal, pantsTax, shirtTax, beltTax, totalBefore, totalTax, totalAfter;
        // Calculating the total cost of each kind of item before tax
        pantsTotal = pantsNumber * pantsCost;   // Calculating total cost of pants
        shirtTotal = shirtNumber * shirtCost;   // Calculating total cost of shirts
        beltTotal = beltCost;                   // Assigning price of belt to total cost of belts
        
        // Calculating the totals sales tax paid for each kind of item
        pantsTax = (int) (pantsTotal * salesTax * 100) / 100.0; // Calculating the sales tax on pants
        shirtTax = (int) (shirtTotal * salesTax * 100) / 100.0; // Calculating the sales tax on shirts
        beltTax = (int) (beltTotal * salesTax * 100) / 100.0;   // Calculating the sales tax on belts
        
         // Calulating the total amounts
        totalBefore = pantsTotal + shirtTotal + beltTotal;  // Calculating the total cost before tax
        totalTax = pantsTax + shirtTax + beltTax;           // Calculating the total cost of ssales tax
        totalAfter = totalBefore + totalTax;                // Calculating the total cost including sales tax
        
        // Printing out the total cost of each item and their sales tax and the total costs of the purchase
        System.out.println ("The total cost for the pants is $" + (pantsTotal) + " with a sales tax of $" + (pantsTax) + ".");
        System.out.println ("The total cost for the shirts is $" + (shirtTotal) + " with a sales tax of $" + (shirtTax) + ".");
        System.out.println ("The total cost for the belt is $" + (beltTotal) + " with a sales tax of $" + (beltTax) + ".");
        System.out.println ("The total cost of the purchase before sales tax is $" + (totalBefore)  + ".");
        System.out.println ("The total cost of the sales tax on the purchase is $" + (totalTax) + ".");
        System.out.println ("The total cost of the purchase including sales tax is $" + (totalAfter) + ".");
    } // end of the main method
}