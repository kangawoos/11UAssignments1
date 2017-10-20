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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask the user for the speed limit
        System.out.println("Enter speed limit:");
        // get the speed limit
        int speedLimit = input.nextInt();
        // ask the user for the speed of the car
        System.out.println("What is the recorded speed of the vehicle");
        int carSpeed = input.nextInt();

        String nospeeding = "congrats, you are not speeding";
        String speeding1 = "you are speeding, the fine for speeding is $100...";
        String speeding2 = "you are speeding, the fine for speeding is $270...";
        String speeding3 = "you are speeding, the fine for speeding is $500...";

        // if the car isnt speeding, print out no speeding message
        if (carSpeed < speedLimit) {
            System.out.println(nospeeding);
        }
        // if the car is speeding print out the speeding messages
        if (carSpeed > speedLimit) {
            if (carSpeed - speedLimit < 21) {
                System.out.println(speeding1);
            }
            if (carSpeed - speedLimit < 31 && carSpeed - speedLimit > 21) {
                System.out.println(speeding2);
            }
            if (carSpeed - speedLimit > 31) {
                System.out.println(speeding3);
            }
        }

    }
}
