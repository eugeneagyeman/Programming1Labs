/* Main Class: Executes the tests created in TestCalculator and evaluates
  the results to check if it functions correctly */
public class Main {

    public static void main(String[] args) {

        /*Declaring and initialising the Calculator and the test Class*/
        Calculator aCalc = new Calculator();
        TestCalculator testCalc = new TestCalculator();

        /* The boolean methods test different functionalities of the Calculator
         They all should return true if the tests pass.*/

        /* mainParser tests whether the Calculator can parse a string
        containing a function*/
        boolean mainParser = testCalc.testParser(aCalc);

        /*mainAdd tests whether the calculator can add two integers together*/
        boolean mainAdd = testCalc.testAdd(aCalc);

        /*mainMultiply tests whether the calculator can multiply two integers*/
        boolean mainMultiply = testCalc.testMultiplication(aCalc);

        /* They all should pass for the calculator to be deemed functional */
        if((mainParser = true) && (mainAdd = true) && (mainMultiply = true)) {
            System.out.println("Congratulations. your Calculator appears to be working");
        }

    }
}
