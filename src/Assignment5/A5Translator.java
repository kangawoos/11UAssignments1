/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author wrigm7406
 */
public class A5Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // ask for a word to translate to ubbi dubbi
        System.out.println("Please enter a word/phrase to translate to Ubbi Dubbi:");
        String wordUno = input.nextLine();
        // convert word to lowercase
        wordUno = wordUno.toLowerCase();
        // create an empty string to later be replaced by the translated word
        String trans = "";
        // create a string with spaces so the translator doesn't break
        String wordDos = wordUno + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
        // if the word "exit" is typed, break the translator
        String quit = "exit";

        // find a vowel by going through each letter
        for (int i = 0; i < wordDos.length(); i = i + 1) {
            // break the system if the word is "exit"
            if (wordUno.equals(quit)) {
                // say goodbye to the user
                System.out.println("Goodbye!");
                break;
            }

            // search for vowels in the word, if there is a vowel, perform multiple actions
            if (wordDos.charAt(i) == 'a' || wordDos.charAt(i) == 'e' || wordDos.charAt(i) == 'i' || wordDos.charAt(i) == 'o' || wordDos.charAt(i) == 'u') {
                // add the prefix "ub" before the vowel
                trans = trans + "ub" + wordDos.charAt(i);
                // if the vowel is 'a', check what the next letter to the right of it is
                if (wordDos.charAt(i++) == 'a') {
                    // leave the word how it originally is
                    trans = trans + wordDos.charAt(i);
                } else {
                    // if a vowel cannot be found after the original vowel, continue through the word
                    trans = trans + wordDos.charAt(i);
                }
            } else {
                trans = trans + wordDos.charAt(i);
            }

            // search for vowels in the word, if there is a vowel, perform multiple actions
            if (wordDos.charAt(i) == 'a' || wordDos.charAt(i) == 'e' || wordDos.charAt(i) == 'i' || wordDos.charAt(i) == 'o' || wordDos.charAt(i) == 'u') {
                if (wordDos.charAt(i++) == 'e') {
                    // if the vowel is 'a', check what the next letter to the right of it is
                    trans = trans + wordDos.charAt(i);
                } else {
                    // if a vowel cannot be found after the original vowel, continue through the word
                    trans = trans + wordDos.charAt(i);
                }
            }

            // search for vowels in the word, if there is a vowel, perform multiple actions
            if (wordDos.charAt(i) == 'a' || wordDos.charAt(i) == 'e' || wordDos.charAt(i) == 'i' || wordDos.charAt(i) == 'o' || wordDos.charAt(i) == 'u') {
                if (wordDos.charAt(i++) == 'i') {
                    // if the vowel is 'a', check what the next letter to the right of it is
                    trans = trans + wordDos.charAt(i);
                } else {
                    // if a vowel cannot be found after the original vowel, continue through the word
                    trans = trans + wordDos.charAt(i);
                }
            }

            // search for vowels in the word, if there is a vowel, perform multiple actions
            if (wordDos.charAt(i) == 'a' || wordDos.charAt(i) == 'e' || wordDos.charAt(i) == 'i' || wordDos.charAt(i) == 'o' || wordDos.charAt(i) == 'u') {
                if (wordDos.charAt(i++) == 'o') {
                    // if the vowel is 'a', check what the next letter to the right of it is
                    trans = trans + wordDos.charAt(i);
                } else {
                    // if a vowel cannot be found after the original vowel, continue through the word
                    trans = trans + wordDos.charAt(i);
                }
            }

            // search for vowels in the word, if there is a vowel, perform multiple actions
            if (wordDos.charAt(i) == 'a' || wordDos.charAt(i) == 'e' || wordDos.charAt(i) == 'i' || wordDos.charAt(i) == 'o' || wordDos.charAt(i) == 'u') {
                if (wordDos.charAt(i++) == 'u') {
                    // if the vowel is 'a', check what the next letter to the right of it is
                    trans = trans + wordDos.charAt(i);
                } else {
                    // if a vowel cannot be found after the original vowel, continue through the word
                    trans = trans + wordDos.charAt(i);
                }
            }
        }
        // if the word is anything but the word "exit", print the following on screen
        if (!wordUno.equals(quit)) {
            // tell the user their translated word
            System.out.println("your word/phrase is " + trans);
        }
    }
}
