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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // put the information into an array
        double[] mark = new double[10];
        
        // create a place holder
        double placeHolder = 0;        
                           
        // use a loop to get the info
        for (int i = 0; i < mark.length; i++) {
            // ask the user for the first and second numbers
            System.out.println("What is the #" + (i + 1) + " mark?");
            // have the user input the numbers
            mark[i] = input.nextDouble();
        }
        // use 2 for loops to assist sorting info
        for (int a = 0; a < mark.length - 1; a++) {
            for (int b = a + 1; b < mark.length; b++) {

                // if the first number is greater than any other number, arrange it to be in front of those numbers
                if (mark[a] > mark[b]) {
                    // make the place holder equal the mark
                    placeHolder = mark[a];
                    // make the larger mark equal to the numbers it is larger than
                    mark[a] = mark[b];
                    // make the smaller marks equal the place holder
                    mark[b] = placeHolder;
                }
            }
        }
        // tell the user that the numbers are about to be printed in ascending order
        System.out.println("the numbers in ascending order are...");
        for (int i = 0; i < mark.length; i++) {
            // tell the user the numbers in ascending order           
            System.out.println(mark[i] + "%");           
        }
    }
}
