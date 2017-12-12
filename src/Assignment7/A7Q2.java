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
public class A7Q2 {

    public void examGrade(double mark) {
        // create a blank string for the grade
        String grade = "";

        // if the mark is equal to or greater than 80, print A
        if (mark >= 80) {
            System.out.println("A");
        }
        // if the mark is equal to or greater than 70 and equal to or less than 79, print B
        if (mark >= 70 && mark <= 79) {
            System.out.println("B");
        }
        // if the mark is equal to or greater than 60 and equal to or less than 69, print C
        if (mark >= 60 && mark <= 69) {
            System.out.println("C");
        }
        // if the mark is equal to or greater than 50 and equal to or less than 59, print D
        if (mark >= 50 && mark <= 59) {
            System.out.println("D");
        }
        // if the mark is lees than 50, print F
        if (mark < 50) {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        // create an object to run my methods
        A7Q2 test = new A7Q2();

        // create a scanner for input
        Scanner in = new Scanner(System.in);

        // ask the user for their mark
        System.out.println("please enter your mark");
        // store thier grade
        double mark = in.nextDouble();
        test.examGrade(mark);
    }
}
