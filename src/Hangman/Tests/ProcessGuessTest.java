package Hangman.Tests;

import org.junit.Test;

import Hangman.Main.RunGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class ProcessGuessTest {
    
    @Test
    void processGuessTest(){
        String guess = "a";
        int misses = 2;
        String[] hangmanOld = {"h", "_", "t"};
        String[] hangmanUpdated = {"h", "a", "t"};

        Object[] holder = {hangmanUpdated, misses, true};
        assertEquals(holder, RunGame.processUserGuess(guess, "hat", hangmanOld, misses));
    }

    @Test
    void processGuessTest2(){
        String[] hangmanOld = {"h", "_", "t"};
        String guess = "a";
        int misses = 2;
        String[] hangmanUpdated = {"h", "_", "t"};
        Object[] holder = {hangmanUpdated, misses+1, true};
        assertEquals(holder, RunGame.processUserGuess(guess, "hot", hangmanOld, misses));
    }
}
