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
public class A7Q1 {

    // double return type - needs to send an answer
    public double circleArea(double radiusIn) {
        // calculate area       
        double area = Math.PI * Math.pow(radiusIn, 2);
        // send back the answer
        return area;
    }

    /**
     *
     * @author wrigm7406
     */
    public static void main(String[] args) {
        // create an object to run my methods
        A7Q1 test = new A7Q1();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user to input the radius
        System.out.println("please enter the radius of a circle in cm:");
        // store the value 
        double radiusIn = in.nextDouble();

        // calculate area
        double area = test.circleArea(radiusIn);
        // tell the user their area
        System.out.println("the area of the circle is " + area + "cm");
    }
}
