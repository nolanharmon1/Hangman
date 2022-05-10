## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


MAIN PROGRAM BLOCK APP.JAVA 

The main program block of Hangman (App.java) should use a while loop to implement the following functionality when run:

Running App.java should begin a “session” in which the user will play one or more games of Hangman.
The user should always play at least one game of Hangman.

After each game, the user should be prompted if they want to play again.

Once the user indicates that they are ready to stop playing, win-loss summary stats for the “session” should be printed.
Use the return value of RunGame.play, which indicates a win or loss in a game, to accumulate a win-loss count for the “session”.

RUN GAME - 

PLAY -- 

play() -- 

After the initial setup of the game, it should use a loop (we highly recommend the while loop) to run each round of the game (where “round” means each time the user guesses a letter). 
In this loop it does the following:
    Tracks: the letters guessed, the current hangmanWord, the number of misses left
    Calls createDisplayString, handleUserInputLetterGuess, and processUserGuess.
    Prints out whether the currently guessed letter is in the word.
    Determines whether the game is over, where the user:
        Won if there are no more "_" in hangmanWord
        Lost if missesLeft <= 0
        Prints the ending message to the user.
        When the game is over, returns whether the user won.


PROCESS USER GUESS -- 

processUserGuess(guessedLetter, secretWord, hangmanWord, missesLeft) -- 
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

Assumptions:

guessedLetter has the value returned from handleUserInputLetterGuess, which means that it is guaranteed to be a letter that the user has not already guessed. hangmanWord is the same length as secretWord and any letter in hangmanWord that is not '_' is the corresponding letter in secretWord.

updateHangmanWord(guessedLetter, secretWord, hangmanWord) -- 

If guessedLetter is in the secretWord, it updates the corresponding positions in the list hangmanWord with that letter. This function should handle the case where guessedLetter is not in secretWord.


Parameters:

guessedLetter (type: string) - the user's current guess, represented as a string of length 1, the return value of handleUserInputLetterGuess
secretWord (type: string) - the secret word returned by getWord
hangmanWord (type: list of strings) - represents the currently displayed hangman, each element in the list represents a letter in the secret word and it is either the actual letter or "_" representing that the user has not yet guessed that letter

Returns:

Type: list

The new hangmanWord, which is a list of strings where each string is a single letter either corresponding to the same letter in secretWord or '_' if the user has not guessed the letter yet in the game.


handleUserInputLetterGuess(lettersGuessed, displayString) -- 

Handles the user inputting a letter to guess. It first prints out the displayString, then calls the input function with "letter> " (note the space after ">") and takes an input from the user. If that input is not in lettersGuessed, it returns that value. If that input is in lettersGuessed, it prints out "you already guessed that" and starts over. Therefore, this function should not return until the user inputs a valid character that has not been guessed yet. We recommend using a while loop to handle this (see the note about while loops below if your program gets into an infinite loop.)


Parameters:

lettersGuessed (type: list of strings) - a list of one character strings where each is a letter that the user has already guessed
displayString (type: string) - the value returned by createDisplayString

Returns:

Type: string

a string of length one that the user has inputted and is not in the list lettersGuessed


Assumptions:

The user will input a string of length 1


createDisplayString(lettersGuessed, missesLeft, hangmanWord) -- 

Creates the string that will be displayed to the user, using the information in the parameters. Ensure that the display string contains spaces between characters in the right places.


Parameters:

lettersGuessed (type: list of strings) - a list of one character strings where each is a letter that the user has already guessed
missesLeft (type: int) - the number of incorrect guesses the user has remaining
hangmanWord (type: list of strings) - represents the currently displayed hangman, each element in the list represents a letter in the secret word and it is either the actual letter or "_" representing that the user has not yet guessed that letter

Returns:        

Type: string

A string that should be displayed to the user at each turn. Like so:

letters you've guessed: SPACE_SEPARATED_STR_OF_LETTERSGUESSED

misses remaining = MISSESLEFT

SPACE_SEPARATED_STR_OF_HANGMANWORD