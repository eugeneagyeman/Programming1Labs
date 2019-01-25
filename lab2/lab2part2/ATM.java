public class ATM {
	//Initialise variables
	int balance = 0;
	int menuchoice = 0;
	Toolbox myToolbox = new Toolbox();
	private static String introText = "Welcome to online ATM banking\n" +
			"How much do you want in your account?";
	private static String menuText = "What do you want to do?\n" +
            "1 : Withdraw\n" +
            "2 : Deposit\n" +
            "3 : Inquire\n" +
            "4 : Quit\n" +
            "Enter your number";

	//Initialise class
	public static void main(String[] args) {
		ATM myATM = new ATM();
		myATM.go();
	}

	public void go() {
		System.out.println(ATM.introText);

		balance = myToolbox.readIntegerFromCmd();
		System.out.println("Your balance is " + balance);
		selection();
	}

	//Withdrawal method
	public void withdraw() {
		System.out.println("*****************************************");
		System.out.println("              Withdrawal                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");

		int withdrawal = myToolbox.readIntegerFromCmd(); //User enters how much they want to withdraw

		balance = balance - withdrawal; //deduct balance with withdrawal amount
		System.out.println("*****************************************");
		System.out.println("         Your new balance is £"+balance);  //display new balance
		System.out.println("*****************************************");


	}

	//Deposit Method
	public void deposit()
	{
		System.out.println("*****************************************");
		System.out.println("              Deposit                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit?");

		int deposit = myToolbox.readIntegerFromCmd(); //User inputs how much they'd like to deposit

		balance = balance + deposit; //Add deposit amount to balance
		System.out.println("*****************************************");
		System.out.println("         Your new balance is £"+balance); //display new balance
		System.out.println("*****************************************");
	}

	//Inquire method
	public void inquire()
	{

		System.out.println("*****************************************");
		System.out.println("          Your balance is £"+balance); //Display balance
		System.out.println("*****************************************");

	}

	//Exit method
	public void quit()
    {
		System.out.println("******************************************");
		System.out.println("         GoodBye!");
		System.out.println("******************************************");
		System.exit(0);  //Ends the instance of the program

	}

	//menu selection method
	public void selection()
    {
		System.out.println(ATM.menuText); //prints menu
		menuchoice = myToolbox.readIntegerFromCmd(); //User input to select chosen action
		if(menuchoice == 1) {
			withdraw();
		} else if(menuchoice == 2) {
			deposit();
		} else if(menuchoice == 3) {
			inquire();
		} else if(menuchoice == 4) {
			quit();
		} else {
			//If an invalid input occurs, print out the error message and run the menu again
			System.out.println("Incorrect selection");
			selection();
		}
	}
}
