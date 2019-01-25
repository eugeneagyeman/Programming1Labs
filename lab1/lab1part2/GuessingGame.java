public class GuessingGame {
	public static void main(String[] args){
		Toolbox myToolbox = new Toolbox();
		int numberToGuess = myToolbox.getRandomInteger(10);  //Selects a random integer from 1-10
		int guessedNumber = myToolbox.readIntegerFromCmd();			//reads the user input from the command line

		System.out.println("Welcome to the Guessing Game!");

		//Assess whether the input number matches the random integer
		if(guessedNumber > numberToGuess) {
			System.out.println("too high");
			} else if (guessedNumber < numberToGuess) {
					System.out.println("too low");
				} else {
					System.out.println("Right");
				}


	}

}
