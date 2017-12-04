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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        // ask the user for the amount of students
        System.out.println("How many people?");
        // store the amount of people
        int people = input.nextInt();

        // put the information into an array
        double[] heights = new double[people];

        // set the total to zero
        double total = 0;

        // set the average to zero
        double average = 0;

        // use a loop to get the info
        for (int i = 0; i < people; i++) {
            // ask the user for the marks
            System.out.println("What were all of the heights in centimetres?");
            // have the user input the heights
            heights[i] = input.nextDouble();

            // add all the marks up
            total = total + heights[i];
            // find the average based on the total and amount of students
            average = total / people;
        }
        // use a loop to get the info
        for (int y = 0; y < people; y++) {
            // if the heights are greater than the average let the user know who is above average
            if (heights[y] > average) {
                // tell the user who is about average
                System.out.println("person " + (y + 1) + " is above the average height");
            }
        }
        // tell the user there average
        System.out.println("the average heights of the following people is " + average + "cm");
    }
}
