/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author wrigm7406
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City bruh = new City();

        // create a new robot
        Robot ninja = new Robot(bruh, 1, 1, Direction.WEST);
        
        // when the street is less than 1, move and when the direction isnt north, turn left
        while (ninja.getStreet() >= 1) {
            ninja.move();
            while (ninja.getDirection() != Direction.NORTH) {
                ninja.turnLeft();
            }
        }
        // if the avenue is less than 1, turn left and move
        if (ninja.getAvenue() >= 1) {
            ninja.turnLeft();
            ninja.move();
        }
        // when the avenue is less than 1, move
        while (ninja.getAvenue() >= 1) {
            ninja.move();
        }
    }
}
