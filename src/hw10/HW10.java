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

public class HW10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int roll = 0;
       
          
            Dice dice = new Dice();
            Dice dice1=new Dice();
            System.out.println(dice.Throw(1));
            System.out.println(dice1.Throw(roll));
            //dice.Throw(0);
 //  
    }//main

}//class
