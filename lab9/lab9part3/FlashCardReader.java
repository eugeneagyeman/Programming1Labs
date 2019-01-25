import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
FlashCardReader is a class which parses the text file containing questions
and answers and creates a flashcard object out of them
*/
class FlashCardReader {
    //BufferedReader is a Library class that parses a txt file
    private BufferedReader reader;
    private final ArrayList<FlashCard> flashCardArray = new ArrayList<>();

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
            try {
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
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

    //returns the flashCards built and stored in the array
    public ArrayList<FlashCard> getFlashCards() {
        try {
            String line;
            while((line = reader.readLine()) != null) {

                String[] lineToSplit = line.split(":");
                flashCardArray.add(new FlashCard(lineToSplit[0],lineToSplit[1]));
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("No lines to read.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("No lines to read.");
            }

        }
        return flashCardArray;
    }

}
