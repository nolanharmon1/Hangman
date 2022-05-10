package Hangman.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Hangman.Main.RunGame;

public class DisplayStringCreationTest {
    @Test
    void displayTest(){
        String[] guesses = {"h", "y", "t"};
        String[] hangman = {"h", "_", "t"};
        String output = "letters you've guessed: " + guesses.toString()+"\n"+"misses remaining: "+10+"\n"+hangman;
       
        assertEquals(output, RunGame.createDisplayString(guesses, 10, hangman));
    }
}
