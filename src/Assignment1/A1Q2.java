/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author wrigm7406
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called doink
        City doink = new City ();
        
        Robot bob = new Robot (doink, 1, 2, Direction.SOUTH);
        
        new Wall (doink, 1, 2, Direction.SOUTH);
        new Wall (doink, 1, 2, Direction.EAST);
        new Wall (doink, 1, 2, Direction.NORTH);
        new Wall (doink, 1, 1, Direction.NORTH);
        new Wall (doink, 1, 1, Direction.WEST);
        new Wall (doink, 2, 1, Direction.WEST);
        new Wall (doink, 2, 1, Direction.SOUTH);
        new Thing(doink, 2, 2);
        
        // have bob turn
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob pickup thing
        bob.pickThing();
        
        // have bob turn
        bob.turnLeft();
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        // have bob move
        bob.move();
        
        // have bob turn
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        
        
        
        
        
    }
}
