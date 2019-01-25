import java.util.ArrayList;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {

        //Declaring instance variables
        Toolbox myToolbox = new Toolbox(); //readIntegerFromCmd() in this class

        System.out.println("Which multiplication table would you like to calculate?: ");

        //takes user input and sets the integer value
        int selection = myToolbox.readIntegerFromCmd();

        //loop to print timetable up to 20 times the user input
        for (int i = 1; i < 21; i++) {
            int calculation = selection * i;    //input times multiple
            System.out.print(calculation);    // output calculation to cmd line
            System.out.print(" ");    // leaves a space in between each multiple
        }

        System.out.println();

        /*Sub routine to calculate how many successive integers to add to make a
        total over 500*/

        boolean run = true;    //allows the program to run

        //local variables for calculation
        int sum = 0;    //sum so far
        int consecutiveInteger = 0;    //integer to sum with

        while (run) {

            //sum up the current sum and the incremented integer
            sum = sum + consecutiveInteger++;

            if (sum > 501) {

                run = false;    //end loop once you exceed 500
            }
        }

        //detract one to account for the loop of summing 0
        consecutiveInteger = consecutiveInteger - 1;

        //output results to command line
        System.out.println("it takes " + consecutiveInteger + " consecutive numbers to sum to just over 500");

    }
}