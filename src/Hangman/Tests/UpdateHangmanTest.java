package Hangman.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import Hangman.Main.RunGame;

public class UpdateHangmanTest {
    
    @Test  
    void updaterSingleLetterTest(){
        String[] hangmanWord = {"h", "_", "t"};
        String[] hangmanUpdated = {"h", "a", "t"};
        assertEquals(hangmanUpdated, RunGame.updateHangmanWord("a", "hat", hangmanWord));
    }

    @Test
    void updaterMultiLetterTest(){
        String[] hangmanWord1 = {"_", "h", "o", "w", "_"};
        String[] updated1 = {"s", "h", "o", "w", "s"};
        assertEquals(updated1, hangmanWord1);
    }
}
