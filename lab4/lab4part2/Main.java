
import java.util.ArrayList;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) {


/* Part 1 Code

        Toolbox myToolbox = new Toolbox();
        System.out.println("Which multiplication table would you like to calculate?: ");

        int selection = myToolbox.readIntegerFromCmd();

        for (int i = 1; i < 21; i++) {
            int calculation = selection * i;
            System.out.print(calculation);
            System.out.print(" ");
        }

        System.out.println();
        boolean run = true;
        int sum = 0;
        int consecutiveInteger = 0;

        while (run) {
            sum = sum + consecutiveInteger++;

            if (sum > 501) {
                run = false;
            }
        }
        consecutiveInteger = consecutiveInteger - 1;

        System.out.println("it takes " + consecutiveInteger + " consecutive numbers to sum to just over 500");

*/

        //Initialise a new UserGroup with an empty ArrayList
        UserGroup testGroup = new UserGroup();

        testGroup.addSampleData(); //add user data to ArrayList
        testGroup.printUsernames(); //print usernames currently in ArrayList

        //Initialise a new UserGroup for admins with a new empty ArrayList
        UserGroup administrators = new UserGroup();

        Iterator loop = testGroup.getUserIterator(); //Get the Usergroup iterator

        //iterating through the user ArrayList
        while (loop.hasNext())    //while there are users to iterate through
        {

            //local variables to index element
            int index = 0;
            index++;

            if (loop.equals("admin")) { //if the user is an administrator

                //Add the user from the current index to the administrators ArrayList
                administrators.addUser(testGroup.getUser(index));
            }
        }

        administrators.printUsernames(); //print admins currently in ArrayList

/* Part 3 Code
        System.out.println("Before change of User Type");
        administrators.printsUsernames();

        System.out.println();

        System.out.println("After change");

        //Edit last admin's usertype to 'user'
        administrators.getUsers().get(administrators.getUsers().size() - 1).setUserType("user");

        administrators.printUsernames();    //reprint updated list
        */


    }
}
