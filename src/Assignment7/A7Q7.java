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
public class A7Q7 {

    // create a void method type - a void performs an action
    public void firstDigit(int number) {                           
        // if the number is negative perform the following calculation
        if (number < 0){
            number = number * -1;               
        }
        // while the number is greater than or equal to 10, perform the following calculation
        while (number >= 10){
            number = number / 10;
        }
        // tell the user the first digit
        System.out.println("the first digit of the number is " + number);             
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q7 test = new A7Q7();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user for an integer
        System.out.println("please enter a number...");
        // store the info
        int number = in.nextInt();
        test.firstDigit(number);

    }
}
