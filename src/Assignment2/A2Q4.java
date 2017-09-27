/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City bruh = new City();

        // create a new robot
        Robot ninja = new Robot(bruh, 3, 1, Direction.NORTH);

        // create walls in order to imitate a castle
        new Wall(bruh, 1, 1, Direction.WEST);
        new Wall(bruh, 1, 1, Direction.SOUTH);
        new Wall(bruh, 1, 1, Direction.NORTH);
        new Wall(bruh, 1, 1, Direction.EAST);
        new Wall(bruh, 1, 4, Direction.SOUTH);
        new Wall(bruh, 1, 4, Direction.NORTH);
        new Wall(bruh, 1, 4, Direction.WEST);
        new Wall(bruh, 1, 4, Direction.EAST);
        new Wall(bruh, 4, 1, Direction.WEST);
        new Wall(bruh, 4, 1, Direction.NORTH);
        new Wall(bruh, 4, 1, Direction.SOUTH);
        new Wall(bruh, 4, 1, Direction.EAST);
        new Wall(bruh, 4, 4, Direction.SOUTH);
        new Wall(bruh, 4, 4, Direction.NORTH);
        new Wall(bruh, 4, 4, Direction.WEST);
        new Wall(bruh, 4, 4, Direction.EAST);
        new Wall(bruh, 2, 2, Direction.WEST);
        new Wall(bruh, 3, 2, Direction.WEST);
        new Wall(bruh, 2, 3, Direction.EAST);
        new Wall(bruh, 3, 3, Direction.EAST);
        new Wall(bruh, 3, 2, Direction.SOUTH);
        new Wall(bruh, 3, 3, Direction.SOUTH);
        new Wall(bruh, 2, 2, Direction.NORTH);
        new Wall(bruh, 2, 3, Direction.NORTH);

        // when the front is clear move
        while (ninja.frontIsClear()) {
            ninja.move();

            // turn left 3 times which = a right
            ninja.turnLeft();
            ninja.turnLeft();
            ninja.turnLeft();

            // if the front is not clear then turn left (1)
            if (!ninja.frontIsClear()) {
                ninja.turnLeft();
            }

            // if the front is not clear then turn left (2)
            if (!ninja.frontIsClear()) {
                ninja.turnLeft();
            }

            // if the front is not clear then turn left (3)
            if (!ninja.frontIsClear()) {
                ninja.turnLeft();
            }
        }

    }
}
