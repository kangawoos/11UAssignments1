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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City country = new City();
        // create a new Robot 
        Robot steve = new Robot(country, 3, 3, Direction.SOUTH);
        
        // create walls
        new Wall(country, 2, 1, Direction.SOUTH);
        new Wall(country, 2, 2, Direction.SOUTH);
        new Wall(country, 1, 1, Direction.NORTH);
        new Wall(country, 1, 2, Direction.NORTH);
        new Wall(country, 1, 1, Direction.WEST);
        new Wall(country, 2, 1, Direction.WEST);
        new Wall(country, 2, 2, Direction.EAST);
        new Wall(country, 1, 2, Direction.EAST);
        
        new Wall(country, 2, 4, Direction.SOUTH);
        new Wall(country, 2, 5, Direction.SOUTH);
        new Wall(country, 1, 4, Direction.NORTH);
        new Wall(country, 1, 5, Direction.NORTH);
        new Wall(country, 1, 4, Direction.WEST);
        new Wall(country, 2, 4, Direction.WEST);
        new Wall(country, 1, 5, Direction.EAST);
        new Wall(country, 2, 5, Direction.EAST);
        
        new Wall(country, 5, 1, Direction.SOUTH);
        new Wall(country, 5, 2, Direction.SOUTH);
        new Wall(country, 4, 1, Direction.NORTH);
        new Wall(country, 4, 2, Direction.NORTH);
        new Wall(country, 4, 1, Direction.WEST);
        new Wall(country, 5, 1, Direction.WEST);
        new Wall(country, 4, 2, Direction.EAST);
        new Wall(country, 5, 2, Direction.EAST);
        
        new Wall(country, 5, 4, Direction.SOUTH);
        new Wall(country, 5, 5, Direction.SOUTH);
        new Wall(country, 4, 4, Direction.NORTH);
        new Wall(country, 4, 5, Direction.NORTH);
        new Wall(country, 4, 4, Direction.WEST);
        new Wall(country, 5, 4, Direction.WEST);
        new Wall(country, 4, 5, Direction.EAST);
        new Wall(country, 5, 5, Direction.EAST);
        
        for (int count1 = 0; count1 < 4; count1 = count1 + 1) {
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
        }
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            
            for (int count2 = 0; count2 < 4; count2 = count2 + 1) {
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
            }
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            
            for (int count3 = 0; count3 < 4; count3 = count3 + 1) {
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
    }
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
            
            for (int count4 = 0; count4 < 4; count4 = count4 + 1) {
            steve.move();
            steve.move();
            steve.move();
            steve.turnLeft();
    }
            steve.turnLeft();
            steve.turnLeft();
            steve.turnLeft();
}
