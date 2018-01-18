/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city
        City bruh = new City();

        // create a new robot
        Robot ninja = new Robot(bruh, 2, 1, Direction.EAST);

        // create walls to imitate hurdles
        new Wall(bruh, 2, 1, Direction.SOUTH);
        new Wall(bruh, 2, 1, Direction.EAST);
        new Wall(bruh, 2, 2, Direction.EAST);
        new Wall(bruh, 2, 4, Direction.EAST);
        new Wall(bruh, 2, 7, Direction.EAST);
        new Wall(bruh, 2, 2, Direction.SOUTH);
        new Wall(bruh, 2, 3, Direction.SOUTH);
        new Wall(bruh, 2, 4, Direction.SOUTH);
        new Wall(bruh, 2, 5, Direction.SOUTH);
        new Wall(bruh, 2, 6, Direction.SOUTH);
        new Wall(bruh, 2, 7, Direction.SOUTH);
        new Wall(bruh, 2, 8, Direction.SOUTH);
        new Wall(bruh, 2, 9, Direction.SOUTH);

        // create new thing
        new Thing(bruh, 2, 9);

        // when the robot cannot pickup a thing and the front is clear, move
        while (!ninja.canPickThing()) {
            if (ninja.frontIsClear()) {
                ninja.move();

                // if front isnt clear, turn left, move, left, left, left, move, left, left, left, move, left
            } else {
                ninja.turnLeft();
                ninja.move();
                ninja.turnLeft();
                ninja.turnLeft();
                ninja.turnLeft();
                ninja.move();
                ninja.turnLeft();
                ninja.turnLeft();
                ninja.turnLeft();
                ninja.move();
                ninja.turnLeft();

            }
        }
    }
}
