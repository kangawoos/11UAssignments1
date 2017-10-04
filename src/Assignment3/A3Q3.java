/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author wrigm7406
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City guyana = new City();
        // create a new Robot      
        Robot neil = new Robot(guyana, 1, 1, Direction.EAST, 20);
        // perform the following actions 20 times
        for (int count = 0; count < 20; count = count + 1) {
            // move the robot 
            neil.move();
            neil.putThing();
            // if the robot has 15 things in his backpack perform the following actions
            if (neil.countThingsInBackpack() == 15) {
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.putThing();
            }
            // if the robot has 10 things in his backpack perform the following actions
            if (neil.countThingsInBackpack() == 10) {
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.putThing();
            }
            // if the robot has 5 things in his backpack perform the following actions
            if (neil.countThingsInBackpack() == 5) {
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
                neil.turnLeft();
                neil.turnLeft();
                neil.putThing();
            }
            // if the robot has 0 things in his backpack perform the following actions
            if (neil.countThingsInBackpack() == 0) {
                neil.turnLeft();
                neil.move();
                neil.turnLeft();
            }
            // if the robot has 0 things in his backpack perform the following action
            while (neil.countThingsInBackpack() == 0) {
                neil.canPickThing();
            }

        }

    }
