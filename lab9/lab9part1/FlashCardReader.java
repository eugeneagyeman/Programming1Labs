import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FlashCardReader is a class which parses the text file containing questions
and answers and creates a flashcard object out of them
*/
public class FlashCardReader {
    //BufferedReader is a Library class that parses a txt file
    public BufferedReader reader;

    /* Constructor initialises a BufferedReader and a file reader for the text file
    and handles the error where a file does not exist
    */
    public FlashCardReader(String filename) {
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }

    // getLine returns the next line of the contents of the file
    public String getLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("No lines to read.");
            return null;
        }


    }

    //fileIsReady checks to see if the file is ready to be read
    public boolean fileIsReady() {
        try {
            return reader.ready();
        } catch (IOException | NullPointerException e) {
            System.err.println("File is not ready to be read!");
            return false;
        }
    }
}
