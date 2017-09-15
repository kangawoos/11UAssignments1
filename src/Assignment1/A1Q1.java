/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called assign
        City assign = new City ();
        
        // create a robot
        Robot bob = new Robot (assign, 0, 2, Direction.WEST);
        
        new Wall (assign, 1, 2, Direction.NORTH);
        new Wall (assign, 1, 1, Direction.NORTH);
        new Wall (assign, 1, 1, Direction.WEST);
        new Wall (assign, 2, 1, Direction.WEST);
        new Wall (assign, 2, 2, Direction.EAST);
        new Wall (assign, 1, 2, Direction.EAST);
        new Wall (assign, 2, 2, Direction.SOUTH);
        new Wall (assign, 2, 1, Direction.SOUTH);
        
        // have bob move
        bob.move();
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
        bob.move();
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
        bob.move();
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
        bob.move();
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
    }
}
