/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author wrigm7406
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City country = new City();
        // create a new Robot 
        Robot steve = new Robot(country, 1, 1, Direction.EAST);
        // create new things
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);
        new Thing(country, 1, 1);

        country.showThingCounts(true);
        // create a move counting variable
        int moveCounter = 0;
        // perform directions below when counter is less than 10
        for (int count = 0; count < 10; count = count + 1) {
            steve.pickThing();
            steve.move();
            steve.putThing();
            steve.turnLeft();
            steve.turnLeft();
            steve.move();
            steve.turnLeft();
            steve.turnLeft();
        }
        // move ahead 1 spot
        steve.move();
    }
}
