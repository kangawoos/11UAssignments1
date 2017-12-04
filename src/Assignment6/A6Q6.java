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
public class A6Q6 {

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

        // tell the user the lowest mark
        System.out.println("lowest mark in the class is...");
        System.out.println(marks[0]);

        // tell the user the highest mark
        System.out.println("highest mark in the class is...");
        System.out.println(marks[marks.length - 1]);

        // calculate the average of all the marks
        double average = markTot / marks.length;
        double rounded = Math.round(average * 100) / 100;
       
        // tell the user the class average
        System.out.println("the class average is...");
        System.out.println(rounded);
    }
}