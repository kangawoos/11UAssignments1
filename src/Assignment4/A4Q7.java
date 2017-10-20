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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // create an integer
        int square = 1;

        // perform the following actions while the user is on a square less than 100       
        while (square < 100) {
            System.out.println("please enter the number from the dice roll (2-12):");
            int diceRoll = input.nextInt();

            // new value of the square the user is on
            square = square + diceRoll;

            // if the user rolls under a 2 or over a 12, terminate
            if (diceRoll > 12 || diceRoll < 2) {
                System.out.println("cannot roll this number, game over:");
                break;
            }
            // if at specific square, go to another square using a snake or ladder
            if (square == 9) {
                square = square + 25;
            }
            if (square == 40) {
                square = square + 24;
            }
            if (square == 54) {
                square = square - 25;
            }
            if (square == 67) {
                square = square + 19;
            }
            if (square == 90) {
                square = square - 42;
            }
            if (square == 99) {
                square = square - 22;
            }
            // tell the user what square they are on
            System.out.println("You are now on square " + square);

            // if the user is on a square greater than 99, tell them they win 
            if (square > 99) {
                System.out.println("You win boi!");
                // if the user is on square 100, terminate
                if (square == 100) {
                    break;
                }
            }
        }
    }
}
