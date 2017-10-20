/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // get the name from the user
        System.out.println("Please enter you name:");
        String firstName = input.nextLine();

        // output variable to screen
        System.out.println("Hi, how's it going? " + firstName);
    }
}
