// Purpose: Practice using Math.random (Random Number Generator)

import java.util.Random;

public class RandomNumber {
    public static void main (String [] args) {
        int number = (int) (Math.random() * 7 + 1);
        System.out.println (number);
    }
}