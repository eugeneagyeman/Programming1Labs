public class ATM {

	//declared variables
	int balance = 0;
	int menuchoice = 0;
	Toolbox myToolbox = new Toolbox();


	private static String introText = "Welcome to online ATM banking\n" +
			"How much do you want in your account?";

	//Menu Output	Text
	private static String menuText = "What do you want to do?\n" +
            "1 : Withdraw\n" +
            "2 : Deposit\n" +
            "3 : Inquire\n" +
            "4 : Quit\n" +
            "Enter your number";

	//Initialising the class
	public static void main(String[] args) {
		ATM myATM = new ATM();
		myATM.go();
	}


	public void go() {
		System.out.println(ATM.introText); //prints the initial text upon opening
		balance = myToolbox.readIntegerFromCmd(); //balance becomes the value of the user's input
		System.out.println("Your balance is " + balance); //Display Balance
	}
}
