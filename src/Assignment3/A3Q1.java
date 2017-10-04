/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City country = new City();
        // create a new Robot 
        Robot steve = new Robot(country, 0, 3, Direction.WEST);
        // create new walls
        new Wall(country, 1, 1, Direction.WEST);
        new Wall(country, 2, 1, Direction.WEST);
        new Wall(country, 1, 1, Direction.NORTH);
        new Wall(country, 1, 2, Direction.NORTH);
        new Wall(country, 2, 1, Direction.SOUTH);
        new Wall(country, 2, 2, Direction.SOUTH);
        new Wall(country, 2, 2, Direction.EAST);
        new Wall(country, 1, 2, Direction.EAST);

        // counted for loop
        for (int count = 0; count < 8; count = count + 1) {
            // move the robot 
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
        }
    }
