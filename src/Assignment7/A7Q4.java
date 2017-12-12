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
public class A7Q4 {

    public double compoundInterest(double principal, double interestRate, double totalYears) {
        // calculate the new balance
        double newBalance = principal * (Math.pow(1 + interestRate, totalYears));
        // tell the user their balance
        System.out.println("the new balance is " + newBalance);
        // send back the answer
        return newBalance;

    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q4 test = new A7Q4();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user for an integer
        System.out.println("please enter the intial amount of money in the account...");
        // store the info
        double principalIn = in.nextDouble();

        // ask the user for an integer
        System.out.println("please enter the interest rate... (0-100)");
        // store the info
        double interestIn1 = in.nextDouble();
        // turn the interest into a percent
        double interestIn2 = interestIn1 / 100;

        // ask the user for an integer
        System.out.println("please enter the amount of years you would like...");
        // store the info
        double yearsIn = in.nextDouble();

        double testing = test.compoundInterest(principalIn, interestIn2, yearsIn);
    }
}
