public class FizzBuzz {		//public class called FizzBuzz
	public static void main(String[] args) {
		for(Integer i = new Integer(1); i < 61; i++){	//Loop iterating from 1 to 61

			if(i % 3 == 0){
				System.out.print("Fizz");	//if the integer is a factor of 3, print out "Fizz"
			}
			if(i % 5 == 0){
				System.out.print("Buzz");	//if the integer is a factor of 5, print out "Buzz"
			}
			if(i % 3 != 0 && i % 5 != 0){
				System.out.print(i);		//if the integer is a factor of both 3 and 5, print out "Fizz" and "Buzz" together
			}
			System.out.println();		//creates a new line

		}
	}
}
