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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // get the numbers from the user
        System.out.println("Please enter 4 numbers on seperate lines...");

        // get the numbers
        double numberone = input.nextInt();
        double numbertwo = input.nextInt();
        double numberthree = input.nextInt();
        double numberfour = input.nextInt();

        // tell the user their numbers
        System.out.print("These were your numbers...");
        System.out.print(numberone);
        System.out.print(",");
        System.out.print(numbertwo);
        System.out.print(",");
        System.out.print(numberthree);
        System.out.print(",");
        System.out.print(numberfour);
    }
}
