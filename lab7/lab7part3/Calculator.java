
import java.util.Arrays;

public class Calculator {
    Double x;

    /*
     * Chops up input on ' ' then decides whether to add or multiply.
     * If the string does not contain a valid format returns null.
     */

    public Double x(String x) {
        Double returnValue = 0.0;

        //Splits the string to obtain the integers and the operand
        x = Arrays.toString(x.split(" "));

        //If it is an addition calculation
        if (x.contains("+")) {
            System.out.println("== Adding ==");

            System.out.println(Double.valueOf(x.substring(1,x.indexOf(","))) + " + " + Double.valueOf(x.substring(x.lastIndexOf(",") + 1, x.length() - 1)));

            returnValue = x(Double.valueOf(x.substring(1, x.indexOf(",")))) + x(Double.valueOf(x.substring(x.lastIndexOf(",") + 1, x.length() - 1)));
            System.out.println(returnValue);

            return returnValue;

        // Else if it is a multiplication calculation
        } else if (x.contains("x") || x.contains("*")) {
            System.out.println("== Multiplying ==");
            //System.out.println(x);
            System.out.println(Double.valueOf(x.substring(1,x.indexOf(","))) +" x "+Double.parseDouble(x.substring(x.lastIndexOf(",")+1, x.length()-1)) );

            returnValue = x(Double.parseDouble(x.substring(1, x.indexOf(",")))) * x(Double.parseDouble(x.substring(x.lastIndexOf(",") + 1, x.length() - 1)));
            System.out.println(returnValue);
            return returnValue;

          //Else return false
        } else {
            return null;
        }
    }

    /*
     * Adds the parameter x to the instance variable x and returns the answer as a Double.
     */
    public Double x(Double x) {
        this.x = 0.0;
        this.x += x;
        return this.x;
    }

    /*
     * Multiplies the parameter x by instance variable x and return the value as a Double.
     */
    public Double x(double x) {
        this.x = 1.0;
        this.x *= x;
        return this.x;
    }
}
