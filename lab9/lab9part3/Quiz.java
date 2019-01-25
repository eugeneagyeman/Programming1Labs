import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/*
Quiz class handles the interaction with the user by displaying the questions,
Taking an input and keeping track of the score before saving the result if requested
*/
class Quiz {
    /*Declaring instance variables*/

    private final ArrayList<FlashCard> cards;
    private final Toolbox toolbox;
    private final ArrayList<String> resultArray = new ArrayList<>();
    private int score;

    public Quiz(String filename) {
        toolbox = new Toolbox();
        FlashCardReader fcReader = new FlashCardReader(filename);
        score = 0;
        cards = fcReader.getFlashCards();
        play();
    }

    /* play method loops through each question, takes input from the user and
    checks the input against answer
    */
    private void play() {


        System.out.println("Hello welcome to the best quiz game on the planet");
        System.out.println();
        System.out.println("Would you like to save their results before the quiz begins?");
        System.out.println("Y/N");
        String choice = toolbox.readStringFromCmd();

        boolean savePermitted = true;
        switch (choice) {
            case "Y":
                savePermitted = true;
                break;
            case "y":
                savePermitted = true;
                break;
            case "n":
                savePermitted = false;
                break;
            case "N":
                savePermitted = false;
                break;
            default:
                System.out.println("Incorrect input");
                savePermitted = false;
                break;

        }

        for (FlashCard loop : cards) {
            String question = loop.getQuestion();
            System.out.println(question);

            String userAnswer = toolbox.readStringFromCmd();
            System.out.println();

            boolean correctCheck;
            if (userAnswer.equalsIgnoreCase(loop.getAnswer())) {
                System.out.println("You are correct!!");
                score++;
                correctCheck = true;
            } else {
                System.out.println("Sorry! That was incorrect. The correct answer was " + loop.getAnswer());
                correctCheck = false;
            }
            resultArray.add(String.format("%s,%s,%s", question, userAnswer, correctCheck));

        }
        if(savePermitted) {
            save();
        }

    }

    private double percentage() {
        return ((double) score/cards.size()) * 100.0;

    }
    /*
    Add total score, number of questions asked and percentage of questions correct
    to end of line.
    */
    private void save() {
        PrintStream ps = null;
        try {
            ps = new PrintStream("save.txt");
            for (String aResultArray : resultArray) {
                ps.print(aResultArray+"\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not created");
        } finally {
            ps.printf("%s,%s,%s",score,cards.size(),percentage());
            ps.flush();
            ps.close();
        }

    }



}
