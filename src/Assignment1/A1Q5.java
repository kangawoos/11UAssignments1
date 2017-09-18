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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city called blop
        City blop = new City ();
        
        // put things in city
        new Thing(blop, 0, 0);
        new Thing(blop, 1, 0);
        new Thing(blop, 1, 1);
        new Thing(blop, 1, 2);
        new Thing(blop, 2, 2);
        
        Robot yeye = new Robot (blop, 0, 1, Direction.WEST);
        Robot meme = new Robot (blop, 3, 3, Direction.EAST);
        
        new Wall (blop, 3, 3, Direction.SOUTH);
        new Wall (blop, 3, 3, Direction.EAST);
        new Wall (blop, 2, 3, Direction.EAST);
        new Wall (blop, 2, 3, Direction.NORTH);
        new Wall (blop, 2, 3, Direction.WEST);
        
        yeye.setLabel("M");
        meme.setLabel("K");
        
        // have meme turn
        meme.turnLeft();
        meme.turnLeft();
        
        // have meme move
        meme.move();
        
        // have meme turn
        meme.turnLeft();
        meme.turnLeft();
        meme.turnLeft();
        
        // have yeye move
        yeye.move();
        
        // have yeye pickup thing
        yeye.pickThing();
        
        // have yeye turn
        yeye.turnLeft();
        
        // have yeye move
        yeye.move();
        
        // have yeye pickup thing
        yeye.pickThing();
        
        // have yeye turn
        yeye.turnLeft();
        
        // have yeye move
        yeye.move();
        
         // have yeye pickup thing
        yeye.pickThing();
        
        // have meme move
        meme.move();
        
        // have meme pickup thing
        meme.pickThing();
        
        // have meme move
        meme.move();
        
        // have meme pickup thing
        meme.pickThing();
        
        // have meme turn
        meme.turnLeft();
    }
}
