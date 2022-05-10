package Hangman.Main;

/**
 *  THIS WILL RUN THE GAME LOGIC. KEEPING TRACK OF THE ANSWER, NUMBER OF GUESSES, GUESSES MADE,
 *  AND PROGRESS IN GUESSING THE WORD.
 * 
 *   1. During the game it prints out whether the currently guessed letter is in the word by printing
 *      "you missed: LETTER not in word", where LETTER is replaced by the letter the user guess.
 * 
 *   2. When the game is over according to processUserGuess, it determines if the user won or not,
 *      prints out the corresponding text: 
 *      
 *      If the user won, it prints out "you guessed the word: " + secretWord.
 *      If the user lost, it prints out "GAME OVER" and then on a new line "word is " + secretWord.
 * 
 *   3. After printing out whether the user won, it also prints "you made GUESSES guesses with MISSES misses"
 *      where GUESSES is the number of guesses by the user and MISSES is the number of misses by the user.
 *      
 *      Your code can keep track of the number of misses as the game is played, or it can calculate the number
 *      of misses at the end by subtracting the number of misses left from the total number of misses allowed.
 * 
 *      Returns: Type: bool
 *      Returns True if the user won the game and False otherwise.
 *  
 */

public class RunGame {
    //THE SECRET WORD IS THE WORD THAT YOU SHOULD TRY AND GUESS
    public static boolean play(){
        //initialize any variables you may need
        String secretWord = LoadFile.getWord();
        System.out.println("my secret word: " +secretWord);
        //begin the while loop to play the game.


        //return true on win or false on loss.        
        return false;
    }

    /** 
     *  THIS FUNCTION WILL KEEP TRACK OF:
     *      GUESSED LETTERS IN AN ARRAY OF ONE LETTER STRINGS
     *      THE NUMBER OF MISSES REMAINING
     *      A LIST OF THE HANGMAN WORD'S GUESSED LETTERS AND IF NOT GUESSED AN _ WILL BE IN IT'S PLACE
     *      
     * THIS METHOD SHOULD RETURN:
     *      Type: string
     *      A string that should be displayed to the user at each turn. Like so:
     *          letters you've guessed: SPACE_SEPARATED_STR_OF_LETTERSGUESSED
     *          misses remaining: MISSESLEFT
     *          SPACE_SEPARATED_STR_OF_HANGMANWORD
     * 
     *      EXAMPLE OF OUTPUT STRING:
     *          letters you've guessed: a e i o s u
     *          misses remaining: 4
     *          s _ _ _ o o _
     * 
     * */

    public static String createDisplayString(String[] lettersGuessed, int missesRemaining, String[] hangmanWord){
        //TODO take all contents of the game state and print it in a legible state
        //it should look similar to the example above.
        return null;
    }

    /**
     * Handles the user inputting a letter to guess. It first prints out the displayString, then calls the input function 
     * with "letter> " (note the space after ">") and takes an input from the user. 
     * If that input is not in lettersGuessed, it returns that value. 
     * If that input is in lettersGuessed, it prints out "you already guessed that" and starts over. 
     * Therefore, this function should not return until the user inputs a valid character that has not been guessed yet. 
     * We recommend using a while loop to handle this
     * 
     * PARAMETERS:
     *  lettersGuessed (type: list of strings) - a list of one character strings where each is a letter that the user 
     *  has already guessed
     *  displayString (type: string) - the value returned by createDisplayString
     */


    public static String handleUserInputLetterGuess(String[] lettersGuessed, String displayString){
        //TODO prompt a user guess and verify it is a valid guess.
        //Return the valid guess as a string.
        String guess = "";
       //take input from user
       guess = App.readInput.nextLine();
       //validate input
       //return letter
        return guess;
    }

    /**
     * Returns: Type: String[]
     *      The new hangmanWord, which is a list of strings where each string is a single letter either corresponding
     *      to the same letter in secretWord or '_' if the user has not guessed the letter yet in the game.
     * 
     * 
     * Example:
     *      guessedLetter = "a"
     *      secretWord = "cat"
     *      hangmanWord = ["c", "_", "_"]
     * 
     * Returns ["c", "a", "_"]
     */

    public static String[] updateHangmanWord(String guessedLetter, String secretWord, String[] hangmanWord){
        //TODO take the original hangman word and update it to include the guessed letter
        //for each index of the letter
        return hangmanWord;
    }


    /**
     * processUserGuess(guessedLetter, secretWord, hangmanWord, missesLeft) -- 
Takes the user's guess, the secret word, the user's current progress on the word, and the number of misses left and updates the current game state of hangmanWord, number of misses left, and whether the user missed.

Parameters:

guessedLetter (type: string) - the user's current guess, represented as a string of length 1, the return value of handleUserInputLetterGuess
secretWord (type: string) - the secret word returned by getWord
hangmanWord (type: list of strings) - represents the currently displayed hangman, each element in the list represents a letter in the secret word and it is either the actual letter or "_" representing that the user has not yet guessed that letter
missesLeft (type: int) - the number of misses the user has left

Returns:

Type: list

A list with the following at each index:

Index 0: (type: list of strings) the "new" hangmanWord based on the user's guess in guessedLetter, it should use the helper function updateHangmanWord to do this.
Index 1: (type: int) an updated value for missesLeft based on the user's guess in guessedLetter
Index 2: (type: bool) indication of whether the user made a correct guess, where True means the user guessed a letter in the word and False means the user missed

     * @param guessedLetter
     * @param secretWord
     * @param missesLeft
     * @return
     */
    public static Object[] processUserGuess(String guessedLetter, String secretWord, String[] hangmanWord, int missesLeft){
        //TODO Calculate updates to game state and return in an Array
        //This should be an Array of Objects (Remember Wrapper Classes for primitives)
        Object[] gameInfo = new Object[3];
        return null;
    }



}
