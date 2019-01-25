import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Quiz class handles the interaction with the user by displaying the questions,
Taking an input and keeping track of the score before saving the result if requested
*/
public class Quiz {
    /*Declaring instance variables*/

    //FlashCardReader reads the question file
    FlashCardReader fcReader;

    //Array of FlashCards built
    ArrayList<FlashCard> cards;

    //Toolbox for user input
    Toolbox toolbox;

    int score;


    public Quiz(String filename) {
        toolbox = new Toolbox();
        fcReader = new FlashCardReader(filename);
        score = 0;
        cards = fcReader.getFlashCards();
        play();
    }

    /* play method loops through each question, takes input from the user and
    checks the input against answer
    */
    public void play() {

        //System.out.println("Hello welcome to the best quiz game on the planet");
        System.out.println();

        for (FlashCard loop: cards) {
            System.out.println(loop.getQuestion());
            System.out.println();

            String userAnswer = toolbox.readStringFromCmd();


            if(userAnswer.equalsIgnoreCase(loop.getAnswer())) {
                System.out.println("You are correct!!");
                score++;
            } else {
                System.out.println("Sorry! That was incorrect. The correct answer was "+loop.getAnswer());
            }

        }
    }

    public void save() {

    }

}
