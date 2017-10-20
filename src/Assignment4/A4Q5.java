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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // get the name from the user
        System.out.println("Please enter you name:");
        String firstName = input.nextLine();

        // get the total of the test
        System.out.println("What was the first test out of?:");
        // get the score
        double testTotal1 = input.nextInt();

        // get the results of the test
        System.out.println("What did you get on the first test:");
        // get the score
        double testResults1 = input.nextInt();

        // get the total of the test
        System.out.println("What was the second test out of?:");
        // get the score
        double testTotal2 = input.nextInt();

        // get the results of the test
        System.out.println("What did you get on the second test:");
        double testResults2 = input.nextInt();

        // get the total of the test
        System.out.println("What was the third test out of?:");
        double testTotal3 = input.nextInt();

        // get the results of the test
        System.out.println("What did you get on the third test:");
        double testResults3 = input.nextInt();

        // get the total of the test
        System.out.println("What was the fourth test out of?:");
        double testTotal4 = input.nextInt();

        // get the results of the test
        System.out.println("What did you get on the fourth test:");
        double testResults4 = input.nextInt();

        // get the total of the test
        System.out.println("What was the fifth test out of?:");
        double testTotal5 = input.nextInt();

        // get the results of the test
        System.out.println("What did you get on the fifth test:");
        double testResults5 = input.nextInt();

        // calculate percentages
        double percentage1 = testResults1 / testTotal1 * 100;
        System.out.println("Your percentage on Test 1 was " + percentage1 + " %");

        // calculate percentages
        double percentage2 = testResults2 / testTotal2 * 100;
        System.out.println("Your percentage on Test 2 was " + percentage2 + " %");

        // calculate percentages
        double percentage3 = testResults3 / testTotal3 * 100;
        System.out.println("Your percentage on Test 3 was " + percentage3 + " %");

        // calculate percentages
        double percentage4 = testResults4 / testTotal4 * 100;
        System.out.println("Your percentage on Test 4 was " + percentage4 + " %");

        // calculate percentages
        double percentage5 = testResults5 / testTotal5 * 100;
        System.out.println("Your percentage on Test 5 was " + percentage5 + " %");

        // calculate total percentage
        double percentageTotal = percentage1 + percentage2 + percentage3 + percentage4 + percentage5;

        // calculate average percentage
        double percentageAverage = percentageTotal / 5;
        System.out.println("Your average percentage is " + percentageAverage + " %");
    }
}
