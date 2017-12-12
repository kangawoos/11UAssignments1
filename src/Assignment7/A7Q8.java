/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A7Q8 {

    // create a boolean return type
    public boolean allDigitsOdd(String num) {
        // create a loop to gather the information about the number
        for (int i = 0; i < num.length(); i++) {
            // if there is an even number in the number, return false
            if (num.charAt(i) == '0' || num.charAt(i) == '2' || num.charAt(i) == '4' || num.charAt(i) == '6' || num.charAt(i) == '8') {
                // tell the user the result
                System.out.println("There are one or more even digits");
                return false;
            }
        }
        // tell the user the result
        System.out.println("There are only odd digits");
        // if the loop earlier does not return false, return true
        return true;
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q8 test = new A7Q8();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user to enter digits
        System.out.println("please enter digits...");

        // store the digit
        String digit = in.nextLine();
        boolean testing = test.allDigitsOdd(digit);
    }
}
