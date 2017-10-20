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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // get the number
        double number = input.nextDouble();
        
        // ask the user to input a measurement
        System.out.println("Input a mearsurement in inches");
        
        // calculate number in cm
        double inches = 2.54 * number;
        
        // tell the user their measurement
        System.out.println("The measurement is " + inches + " centimetres");
        
        
    }
}
