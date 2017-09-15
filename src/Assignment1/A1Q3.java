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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called boom
         City boom = new City ();
         
         // create a robot named boop
         Robot boop = new Robot (boom, 3, 0, Direction.EAST);
         
         new Thing(boom, 3, 1);
         new Wall (boom, 3, 2, Direction.WEST);
         new Wall (boom, 3, 2, Direction.NORTH);
         new Wall (boom, 2, 3, Direction.WEST);
         new Wall (boom, 1, 3, Direction.WEST);
         new Wall (boom, 1, 3, Direction.NORTH);
         new Wall (boom, 1, 3, Direction.EAST);
         new Wall (boom, 1, 3, Direction.WEST);
         new Wall (boom, 2, 4, Direction.NORTH);
         new Wall (boom, 2, 4, Direction.EAST);
         new Wall (boom, 3, 4, Direction.EAST);
         
         // have boop move
         boop.move();
         
         // have boop pickup thing
         boop.pickThing();
         
         // have boop turn
         boop.turnLeft();
         
         // have boop move
         boop.move();
         
         // have boop turn
         boop.turnLeft();
         boop.turnLeft();
         boop.turnLeft();
         
         // have boop move
         boop.move();
         
         // have boop turn
         boop.turnLeft();
         
         // have boop move
         boop.move();
         boop.move();
         
         // have boop turn
         boop.turnLeft();
         boop.turnLeft();
         boop.turnLeft();
         
         // have boop move
         boop.move();
         
         // have boop put thing
         boop.putThing();
         
         // have boop move
         boop.move();
         
         // have boop turn
         boop.turnLeft();
         boop.turnLeft();
         boop.turnLeft();
         
         // have boop move
         boop.move();
         
          // have boop turn
         boop.turnLeft();
         
          // have boop move
         boop.move();
         
          // have boop turn
         boop.turnLeft();
         boop.turnLeft();
         boop.turnLeft();
         
         // have boop move
         boop.move();
         boop.move();
         
         // have boop turn
         boop.turnLeft();
         
         
    }
}
