package Hangman.Main;
import java.util.Scanner;
import java.io.*;








/**
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 *  DO NOT CHANGE THIS FILE.
 */

public class LoadFile {
    public static String getWord() {
        String myWord;
        String[] wordBank = new String[8];
        try{
            File f = new File("./lib/WordBank.txt");
            Scanner reader = new Scanner(f);
            for (int i = 0; i < 8; i++){
                if (reader.hasNextLine()){
                    wordBank[i] = reader.nextLine();
                }
            }
            reader.close();
            int randomNumber = (int) (Math.random() * 8 + 1);
            myWord = wordBank[randomNumber];
            return(myWord);
        } 
        catch (FileNotFoundException e){
            System.out.print("AN ERROR OCCURED READING THE FILE \n");
            e.printStackTrace();
            return("ERROR");
        }
    }
}
