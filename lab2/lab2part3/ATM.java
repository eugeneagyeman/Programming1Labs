public class ATM {

    //Declare variables
    int balance = 0; //Balance for user account
    int menuchoice = 0; //Users chosen menu choice
    Toolbox myToolbox = new Toolbox();

    //Intro text and Menu Text
    private static String introText = "Welcome to online ATM banking\n" +
            "How much do you want in your account?";
    private static String menuText = "What do you want to do?\n" +
            "1 : Withdraw\n" +
            "2 : Deposit\n" +
            "3 : Inquire\n" +
            "4 : Quit\n" +
            "Enter your number";

    //Initialise class and start the program
    public static void main(String[] args) {
        ATM myATM = new ATM();
        myATM.go();
    }

    public void go() {
        System.out.println(ATM.introText); //Outputs intro text
        balance = myToolbox.readIntegerFromCmd(); //balance becomes the amount the user inputs
        System.out.println("Your balance is " + balance); //display balance

        //loop to return to the menu until user quits
        while (true) {
            selection();
        }
    }

    //Withdrawal method
    public void withdraw() {
        System.out.println("*****************************************");
        System.out.println("              Withdrawal                 ");
        System.out.println("*****************************************");
        System.out.println("How much would you like to withdraw?");

        int withdrawal = myToolbox.readIntegerFromCmd(); //User enters chosen withdrawal amount

        if (withdrawal > balance) {  //Should the withdrawal amount exceed the balance
            System.out.println("You cannot be overdrawn. Your balance is £" + balance);
            withdraw();  //rerun the method to choose new amount

        } else if (withdrawal < 0) {  //Should the withdrawal be a negative number
            System.out.println("You cannot withdraw a negative amount");
            withdraw();
        } else
            balance = balance - withdrawal; //Deduct balance by withdrawal amount if none of the above conditions are met
        selection(); //return to the menu


        System.out.println("*****************************************");
        System.out.println("         Your new balance is £" + balance + ""); //display new balance
        System.out.println("*****************************************");


    }

    //Deposit method
    public void deposit() {
        System.out.println("*****************************************");
        System.out.println("              Deposit                 ");
        System.out.println("*****************************************");
        System.out.println("How much would you like to deposit?");

        int deposit = myToolbox.readIntegerFromCmd(); //User enters deposit amount

        if (deposit < 0) {  //Should the input be a negative number
            System.out.println("You cannot deposit a negative amount");
            deposit(); //reruns the method to allow the user to enter a new number
        } else {
            balance = balance + deposit; //add the deposit to the balance if the above condition is not met

        }


        System.out.println("*****************************************");
        System.out.println("         Your new balance is £" + balance);  //Display new balance
        System.out.println("*****************************************");

    }

    //Inquire method
    public void inquire() {

        System.out.println("*****************************************");
        System.out.println("          Your balance is £" + balance); //Display balance
        System.out.println("*****************************************");

    }

    //Exit method
    public void quit() {
        System.out.println("******************************************");
        System.out.println("         GoodBye!");
        System.out.println("******************************************");
        System.exit(0);  //quits program

    }

    //Menu method
    public void selection() {
        System.out.println(ATM.menuText); //outputs menu

        menuchoice = myToolbox.readIntegerFromCmd();

        //Method to run based on user input
        if (menuchoice == 1) {
            withdraw();
        } else if (menuchoice == 2) {
            deposit();
        } else if (menuchoice == 3) {
            inquire();
        } else if (menuchoice == 4) {
            quit();
        } else {
            //If an unaccepatble input is taken
            System.out.println("Incorrect selection");
            selection(); //run the menu method again
        }
    }
}