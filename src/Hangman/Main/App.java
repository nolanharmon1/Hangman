package Hangman.Main;

import java.util.Scanner;

/**
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * DO NOT MAKE CHANGES TO THE FIRST LINE OF CODE.
 * 
 * 
 * YOU SHOULD USE A WHILE LOOP TO GIVE YOUR GAME THE FOLLOWING:
 * 
 *  1. THE ABILITY TO PLAY THE GAME MORE THAN ONCE AT A TIME
 *  2. AFTER EACH GAME PROMPT THE USER "WOULD YOU LIKE TO PLAY AGAIN?"
 *  3. IF THE USER CHOOSES TO STOP PLAYING OUTPUT A WIN/LOSS RECORD (USE RUNGAME'S RETURN VALUE TO DETERMINE A VICTORY)
 */


public class App {
    public static Scanner readInput = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean winLose;
        boolean continuePlaying = true;
        
        while(continuePlaying){
            //this will run your game and return true or false.
            winLose = RunGame.play(); 
            //TODO: calc win / loss
            //TODO: do you want to play again?
            readInput.nextLine();
        }
        //TODO: Print Win / Loss
        readInput.close();
    }
}
