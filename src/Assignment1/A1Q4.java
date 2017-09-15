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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city called babygirl
        City babygirl = new City ();
        
        Robot diddo = new Robot (babygirl, 0, 0, Direction.SOUTH); 
        Robot brap = new Robot (babygirl, 0, 1, Direction.SOUTH); 
        
        new Wall (babygirl, 0, 1, Direction.WEST);
        new Wall (babygirl, 1, 1, Direction.WEST);
        new Wall (babygirl, 1, 1, Direction.SOUTH);
        
        // have diddo move
        diddo.move();
        diddo.move();
    }
}
