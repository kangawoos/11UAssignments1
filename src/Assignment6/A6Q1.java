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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        // ask the user for the amount of students
        System.out.println("How many students?");
        // store the amount of students
        int students = input.nextInt();

        // put the information into an array
        double[] marks = new double[students];

        // set the total to zero
        double total = 0;

        // set the average to zero
        double average = 0;

        // use a loop to get the info
        for (int i = 0; i < students; i++) {
            // ask the user for the marks
            System.out.println("What were the marks?");
            marks[i] = input.nextDouble();

            // add all the marks up
            total = total + marks[i];
            // find the average based on the total and amount of students
            average = total / students;
        }
        // tell the user there average
        System.out.println("the average mark of the following students is " + average);
    }
}
