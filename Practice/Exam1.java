// Purpose: Troubleshoot Exam 1 problems

public class Exam1 {
    public static void main (String[] args) {
        char val;
        
        val = 'd';
        
        switch (val) {
            case 'a':
                System.out.println ("rabbits");
                break;
            case 'd':
                System.out.println ("purple");
            default:
                System.out.println ("default");
            case 'c':
                System.out.println ("yellow");
            case 'f':
                System.out.println ("Jason");
                break;
            case 'e':
                System.out.println ("Trang");
             case 'l':
                System.out.println ("November");
        }
        
        int number1 = 15;
        int number2 = 0;
        
        if (number1 > 10 && number1/number2 < 2) {
            System.out.println ("Works!");
        }
    }
}