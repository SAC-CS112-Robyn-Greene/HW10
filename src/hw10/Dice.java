/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

/**
 * Extend the Dice class Keep track number of throws Keep track of history
 * Provide appropriate methods Rewrite Dice game to keep track of history in
 * object.
 *
 * @author Robyn
 */
import java.util.*;
import java.util.Random;

public class Dice {

    private static int lastRoll = 0;
    static Random random = new Random();
    private int die;

    //Throw() – return a random number between 1-6    
    //diceTotal() – Return current dice value  
    //start with throwing one die
    public int Throw() {
        Random random = new Random();
        die = random.nextInt(6) + 1;
        return die;
    }//die  

    //throwing more than one die
    public int Throw(int tosses) {
        int roll = 0;
        int Throw = 0;
        int numberOfThrows = 0;
        for (tosses = 1; tosses < numberOfThrows;tosses++) {
            roll = roll + (random.nextInt(6) + 1);
            
        }

        numberOfThrows = Throw();
        return numberOfThrows;

    }//throw

}//class

