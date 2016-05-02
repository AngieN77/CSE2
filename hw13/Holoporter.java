// Angela Nguyen
// Professor Brian Chen
// April 22, 2016
// Ragged Array Java Program

// FIX PRINT METHOD!

// Purpose: soRandom - Creates a 3D string array --> 2D string arrays inside --> 1D string arrays inside
//          coder - Generate a unique code of type XXYYYY
//                  X - Letters from A - Z
//                  Y - Numbers from 0 - 9
//          print - Prints out the 3D array
//                  --- => Outerdimension
//                  | => 2nd dimension
//                  , => Elements
//          holoport - 
//          sampling -
//          percentage - 
//          frankenstein - 

import java.util.Random;
import java.util.Scanner;

public class Holoporter {
    
    public static String[][][] soRandom() {
        Random randomGenerator = new Random();;
        String[][][] array = new String[randomGenerator.nextInt(9) + 1][][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new String[randomGenerator.nextInt(9) + 1][];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new String[randomGenerator.nextInt(9) + 1];
            }
        }
        return array;
    }
    
    public static String coder() {
        Random randomGenerator = new Random();
        String code = "";
        char character1 = (char) (randomGenerator.nextInt(26) + 'A');
        char character2 = (char) (randomGenerator.nextInt(26) + 'A');
        int number1 = randomGenerator.nextInt(10);
        int number2 = randomGenerator.nextInt(10);
        int number3 = randomGenerator.nextInt(10);
        int number4 = randomGenerator.nextInt(10);
        code = code + character1  + character2 + number1 + number2 + number3 + number4;
        return code;
    }
    
    public static String[][][] holoport (String[][][] array, String[][][] transport) {
        int i = 0, j = 0, k = 0;
        
        for (i = 0; i < transport.length && i < array.length; i++) {
            for (j = 0; j < transport[i].length && j < array[i].length; j++) {
                for ( k = 0; k < transport[i][j].length && k < array[i][j].length; k++) {
                    transport[i][j][k] = array[i][j][k];
                }
            }
        }
        
        for (i = 0; i < transport.length; i++) {
            for (j = 0; j < transport[i].length; j++) {
                for (k = 0;  k < transport[i][j].length; k++) {
                    if (transport[i][j][k] == null) {
                        transport[i][j][k] = "$$$$$";
                    }
                }
            }
        }
        
        return transport;
    }
    
    public static void print (String[][][] input) {
        for (int i = 0; i < input.length; i++) {
            if (i > 0) {
                System.out.println ("---");
                System.out.println ("");
            }
            for (int j = 0; j < input[i].length; j++) {
                if (j > 0) {
                    System.out.println (" | ");
                }
                System.out.print ("[");
                for (int k = 0; k < input[i][j].length; k++) {
                    System.out.print (input[i][j][k]);
                    if (k == input[i][j].length - 1) {
                        System.out.print ("]");
                    }
                    else {
                        System.out.print (" , ");
                    }
                }
            }
        }
    }
    
    public static void main (String[] args) {
        String[][][] original = soRandom();
        String[][][] holder = soRandom();
        
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                for (int k = 0; k < original[i][j].length; k++) {
                    original[i][j][k] = coder();
                }
            }
        }
        
        System.out.println ("Original Container:");
        print(original);
        System.out.println("");
        System.out.println ("");
        
        holder = holoport(original, holder);
        
        System.out.println ("Holder Container:");
        print(holder);
        System.out.println ("");
        
    }
}