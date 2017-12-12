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
public class A7Q3 {

    // create a double return type
    public double factors(double number) {
        // create a double for a factor
        double factors = 0;

        // use a loop to arrange the info 
        for (double i = 0; i <= number; i++) {
            // do the math in order to achieve the factors
            factors = number / i;
            // if the mark is equal to or greater than 80, print A
            if (factors % 1 == 0) {
                // print out the factors of the number on separate lines
                System.out.println(factors);
            }
        }
        // send back the answer
        return factors;
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q3 test = new A7Q3();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user for an integer
        System.out.println("please enter a number");

        // store their number
        double numberIn = in.nextDouble();

        // tell the user their factors of the specific number
        System.out.println("the factors of the number are...");
        double testing = test.factors(numberIn);
    }
}
