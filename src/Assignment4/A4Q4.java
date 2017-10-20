/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask the user the total cost of prom food
        System.out.println("How much does the food for prom cost?");
        // get the cost
        int foodCost = input.nextInt();

        // ask the user the total cost of the DJ
        System.out.println("How much does the DJ cost?");
        // get the cost
        int djCost = input.nextInt();

        // ask the user the total cost of renting the hall
        System.out.println("How much does it cost to rent the hall?");
        // get the cost
        int hallCost = input.nextInt();

        // ask the user the total cost of decor
        System.out.println("How much does the decorations cost?");
        // get the cost
        int decorCost = input.nextInt();

        // ask the user the total cost of staff
        System.out.println("How much does it cost for staff?");
        // get the cost
        int staffCost = input.nextInt();

        // ask the user the total cost of miscellaneous items
        System.out.println("How much do miscellaneous items cost?");
        // get the cost
        int miscCost = input.nextInt();

        // add all costs to get the total cost
        int totalCost = foodCost + djCost + hallCost + decorCost + staffCost + miscCost;
        System.out.println("The total cost of the prom is " + totalCost + " $");
        
        // get the total amount of tickets that are needed to break even
        double totalTickets = totalCost / 35;
        System.out.println("The total amount of tickets needed to break even will be " + totalTickets + " tickets");
        
        // round
        totalTickets =Math.ceil(totalTickets);
        
    }
}
