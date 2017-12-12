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
public class A7Q6 {

    // double return type - needs to send an answer
    public int lastDigit(int number) {
        // create an integer for negative numbers
        int numberNeg = 0;
        // perform the calculations for negative numbers
        numberNeg = number *- 1;
        // find the last digit of the number
        if (number > 0){    
        // tell the user their last digit
        System.out.println("the last digit of the number is " + number % 10);
        } else {        
        // tell the user their last digit
        System.out.println("the last digit of the number is " + numberNeg % 10);        
    }
            // return an answer
            return number;
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q6 test = new A7Q6();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user for an integer
        System.out.println("please enter a number...");
        // store the info
        int number = in.nextInt();
        int testing = test.lastDigit(number);

    }
}
