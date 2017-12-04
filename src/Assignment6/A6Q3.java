/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // put the information into an array
        double[] num = new double[2];
        // create a place holder
        double placeHolder = 0;

        // use a loop to get the info
        for (int i = 0; i < num.length; i++) {
            // ask the user for the first and second numbers
            System.out.println("What is the " + (i + 1) + "st/nd number");
            // have the user input the numbers
            num[i] = input.nextDouble();
        }
        // if the second number is larger than the first number perform the following...
        if (num[1] > num[0]) {
            // make the place holder equal the first number
            placeHolder = num[1];
            // make the second number equal the second number
            num[1] = num[0];
            // make the first number equal the place holder
            num[0] = placeHolder;          
        }
        // if the first number is larger than the second number perform the following...
        if (num[0] > num[1]) {
            // make the place holder equal the first number
            placeHolder = num[0];
            // make the first number equal the second number
            num[0] = num[1];
            // make the second number equal the place holder
            num[1] = placeHolder;           
        }        
        // tell the user the numbers in ascending order
            System.out.println("the numbers in acsending order is " + num[0] + ", " + num[1]);       
    }
}
