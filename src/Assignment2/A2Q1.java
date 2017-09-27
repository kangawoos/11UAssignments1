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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City waterblue = new City();

        // create a new robot
        Robot bill = new Robot(waterblue, 1, 1, Direction.EAST);
        
        // create new things
        new Thing(waterblue, 1, 2);
        new Thing(waterblue, 1, 3);
        new Thing(waterblue, 1, 4);
        new Thing(waterblue, 1, 5);
        new Thing(waterblue, 1, 6);
        new Thing(waterblue, 1, 7);
        new Thing(waterblue, 1, 8);
        new Thing(waterblue, 1, 9);
        new Thing(waterblue, 1, 10);
        new Thing(waterblue, 1, 11);
        new Thing(waterblue, 1, 12);

        // while bill is on a avenue less than 13, move
        while (bill.getAvenue() < 13) {
            bill.move();

            // if bills backpack has less than 8 things in it, pickup things
            if (bill.countThingsInBackpack() < 8) {
                bill.pickThing();
            }
        }












    }
}
