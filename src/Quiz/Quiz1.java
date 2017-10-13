/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City country = new City();
        // create a new Robot 
        Robot steve = new Robot(country, 0, 0, Direction.EAST);

        // create walls
        new Wall(country, 0, 0, Direction.WEST);
        new Wall(country, 0, 3, Direction.NORTH);
        new Wall(country, 0, 4, Direction.NORTH);
        new Wall(country, 0, 5, Direction.NORTH);
        new Wall(country, 0, 3, Direction.SOUTH);
        new Wall(country, 0, 4, Direction.SOUTH);
        new Wall(country, 0, 5, Direction.SOUTH);
        new Wall(country, 0, 5, Direction.EAST);

        // put down the rocks
        new Thing(country, 0, 3);
        new Thing(country, 0, 4);
        new Thing(country, 0, 5);

            while (steve.frontIsClear()) {
            steve.move();
            if (steve.canPickThing() && steve.getAvenue() != 0) {
                steve.pickThing();
                steve.turnLeft();
                steve.turnLeft();
            }
            if (steve.getAvenue() == 0) {
                steve.putThing();
                steve.turnLeft();
                steve.turnLeft();
            }
            }
           if (!steve.frontIsClear()&& !steve.canPickThing()) {
               steve.turnLeft();
               steve.turnLeft();
           while (steve.frontIsClear())
               steve.move();
           }
           steve.turnLeft();
           steve.turnLeft();
    }
}
           