/*
TestCalculator is the test harness for the object Calculator. Each method within
TestCalculator evaluates a different functionality of the calculator
*/
public class TestCalculator {

    /*
    testParser evaluates whether the calculator can correctly parse a string
    and call the correct function to calculate the result.
    */
    public boolean testParser(Calculator calculator) {
        boolean pass = false;

        //Test Case 1: Adding two positive integers
        Double twelveAddFive = calculator.x("12 + 5");
        int successCount = 0;

        if(twelveAddFive == 17.0) {       //If the calculator successfully calculates the equation
            successCount++;
        } else {
            System.out.println("[FAIL] Basic parsing fails to add");
        }

        //Test Case 2: Multiplying two positive integers
        Double twelveTimesFive = calculator.x("12 x 5");
        if(twelveTimesFive == 60.0) {
            successCount++;
        } else {
            System.out.println("[FAIL] Basic parsing fails to multiply");
        }

        //Test Case 3: Invalid operand (Testing the error handling)
        Double twelveNullFive = calculator.x("12 [ 3");
        if(twelveNullFive == null) {
            successCount++;
        } else {
            System.out.println("[FAIL] Parser does not return null for operators which are not supported");
        }

        return successCount == 3;    //If all three pass return true

    }

    /*
    testAdd tests the adding component of the calculator. The calculator should
    be able to correctly add two integers and output its result.
    */
    public boolean testAdd(Calculator calculator) {

        //initialising the instance variable x
        calculator.x = 1.0;

        int successCount = 0;

        //Test Case 1: Adding Two Positive Integers
        Double positive = calculator.x + calculator.x((Double) 10.0);
        System.out.println(positive);

        //If calculator correctly adds 10 to the instance variable x
        if(positive == 10.0) {
            successCount++;
        } else
            {
            System.out.println("Your system adds incorrectly for positive numbers");
        }

        //Test Case 2: Adding a positive integer and a negative integer
        Double negative = calculator.x+calculator.x((Double) (-102.0));
        System.out.println(negative);

        //Checks to see if calculation matches expected result
        if(negative == -102.0) {
            successCount++;
        } else {
            System.out.println("Your system adds negative numbers incorrectly");
        }

        //If both test cases pass, return true
        return successCount == 2;

    }

    /*
    testsMultiplication tests the multiplication component of the calculator.
    The calculator should be able to multiply two integers together
    */
    public boolean testMultiplication(Calculator calculator) {

        int successCount = 0;

        //initialising instance variable x
        calculator.x = (double) 1;

        //Test Case 1: Multiplying two positive integers
        double positive = calculator.x*calculator.x(100.0);
        if(positive == 100.0) {
            successCount++;
        } else{
            System.out.println("Your system multiplies incorrectly for positive numbers");
        }

        //Test Case 2: Multiplying a positive integer and a negative integer
        double negative = calculator.x*calculator.x(-80.0);
        if(negative == -80.0) {
            successCount++;
        } else {
            System.out.println("Your system multiplies incorrectly for negative numbers");
        }

        //Return true if both cases pass
        return successCount == 2;
    }
}
