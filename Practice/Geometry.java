import java.util.Scanner;

public class Geometry {
    public static void main (String[] args) {
        Scanner questions;
        questions = new Scanner (System.in);
        int choice;
        double areaTriangle, areaRectangle, areaCircle;
        
        final double PI = 3.14159;
        
        System.out.print ("Please choose a shape (1) Triangle, (2) Rectangle, (3) Circle - ");
        if (questions.hasNextInt()) {
            choice = questions.nextInt();
           switch (choice) {
               case 1:
                   System.out.print ("Enter the base of the triangle - ");
                   double baseTriangle = questions.nextDouble();
                   System.out.print ("Enter the height of the triangle - ");
                   double heightTriangle = questions.nextDouble();
                   areaTriangle = baseTriangle * heightTriangle * 1/2;
                   System.out.println ("The area of a triangle with base " + baseTriangle + " and height " + heightTriangle + " is " + areaTriangle + ".");
                   break;
                case 2:
                   System.out.print ("Enter the base of the rectangle - ");
                   double baseRectangle = questions.nextDouble();
                   System.out.print ("Enter the height of the rectangle - ");
                   double heightRectangle = questions.nextDouble();
                   areaRectangle = baseRectangle * heightRectangle;
                   System.out.println ("The area of a rectangle with base " + baseRectangle + " and height " + heightRectangle + " is " + areaRectangle + ".");
                    break;
                case 3:
                   System.out.print ("Enter the radius of the circle - ");
                   double radiusCircle = questions.nextDouble();
                   areaCircle = PI * radiusCircle * radiusCircle;
                   System.out.println ("The area of a circle with radius " + radiusCircle + " is " + areaCircle + ".");
                    break;
                default:
                    System.out.println ("You did not choose of the shapes shown above. Please try again.");
                    break;
                   
           }
        }
        else {
            System.out.println ("You did not enter an integer value. Please try again.");
        }
    }
}