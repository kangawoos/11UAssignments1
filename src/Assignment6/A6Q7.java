/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a starting point for prime numbers
        int n = 1000;

        // create an array
        boolean randomNumber[] = new boolean[n];
        // since the prime numbers start at 2 in this case, make the numbers 0 and 1 false
        randomNumber[0] = false;
        randomNumber[1] = false;

        // make every number turn into a prime 
        for (int y = 1; y < n; y++) {
            randomNumber[y] = true;

        }
        // use a loop to make all of the numbers turn into prime numbers
        for (int x = 2; x < n; x++) {
            if (randomNumber[x - 1]) {
                
                // print out every prime number    
                System.out.println(x);
               
                // take out every number that is not a prime number
                for (int z = x; z < n; z += x) {
                    randomNumber[z - 1] = false;
                }
            }
        }
    }
}
