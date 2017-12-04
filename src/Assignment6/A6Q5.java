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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask the user for the amount of marks
        System.out.println("print the amount of marks");
        int numMark = input.nextInt();

        // create an array to store information
        double[] marks = new double[numMark];

        // create a placeholder
        double placeHolder = 0;

        // create a variable for the total of all marks
        double markTot = 0;      

        // use a loop to get the info
        for (int i = 0; i < marks.length; i++) {
            // ask the user for the first and second numbers
            System.out.println("What are the #" + (i + 1) + " marks?");
            // have the user input the numbers
            marks[i] = input.nextDouble();

            // create a loop to calculate the median                       
            markTot = markTot + marks[i];
        }
        // create a loop to gather all of the marks then sort
        for (int a = 0; a < marks.length - 1; a++) {
            // create a loop to gather all of the marks then sort
            for (int b = a + 1; b < marks.length; b++) {

                // if the first number is greater than any other number, arrange it to be in front of those numbers
                if (marks[a] > marks[b]) {
                    // make the place holder equal the mark
                    placeHolder = marks[a];
                    // make the larger mark equal to the numbers it is larger than
                    marks[a] = marks[b];
                    // make the smaller marks equal the place holder
                    marks[b] = placeHolder;
                }
            }
        }

        // if there is an odd amount of marks perform the following calculations
        if (numMark % 2 == 1) {
            int placeHolder2 = numMark / 2;
            // tell the user the median
            System.out.println("the median of the marks is " + marks[placeHolder2] + "%");
        }
        // if there is an even amount of mark perform the following calculations
        if (numMark % 2 == 0) {
            double placeHolder3 = (marks[numMark / 2] + marks[(numMark / 2) - 1]) / 2;
            // tell the user the median
            System.out.println("the median of the marks is " + placeHolder3 + "%");
        }
    }
}
