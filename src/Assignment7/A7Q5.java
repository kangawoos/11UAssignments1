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
public class A7Q5 {

    // create a procedure type method
    public void chaotic(int linesAsterisks) {
        // create an array for the amount of asterisks
        String[] asterisksNum = new String[5];
        // give asterisks 5 different print types
        asterisksNum[0] = "*";
        asterisksNum[1] = "**";
        asterisksNum[2] = "***";
        asterisksNum[3] = "****";
        asterisksNum[4] = "*****";

        // create a loop to print asterisks on the screen
        for (int i = 0; i < linesAsterisks; i++) {
            int random = (int) (Math.random() * (5));
            // print the asterisks on the screen
            System.out.println(asterisksNum[random]);
        }
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q5 test = new A7Q5();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user the amount of lines of asterisks they want
        System.out.println("how many lines of asterisks do you want?:");
        // store their number
        int linesAsterisks = in.nextInt();
        test.chaotic(linesAsterisks);


    }
}
