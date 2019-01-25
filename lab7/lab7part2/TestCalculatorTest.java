import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCalculatorTest {

    @Test
    @DisplayName("Test caluclatorTest parses correctly")
    void onetest() {
        TestCalculator testCalculator = new TestCalculator();

        TestCal testCal = new TestCal(new Double(17), new Double(60), null);
        assertTrue(testCalculator.testParser(testCal));

        testCal = new TestCal(new Double(12), new Double(60), null);
        assertFalse(testCalculator.testParser(testCal));

        testCal = new TestCal(new Double(17), new Double(61), null);
        assertFalse(testCalculator.testParser(testCal));

        testCal = new TestCal(new Double(17), new Double(60), new Double(1));
        assertFalse(testCalculator.testParser(testCal));

    }


    @Test
    @DisplayName("Test caluclatorTest identifies correct adding")
    void addingTest() {
        TestCalculator testCalculator = new TestCalculator();

        InaccurateCalculator testCal2 = new InaccurateCalculator(new Double(0));
        assertTrue(testCalculator.testAdd(testCal2));
    }

    @Test
    @DisplayName("Test caluclatorTest identifies correct multiplication")
    void multiplingTest() {
        TestCalculator testCalculator = new TestCalculator();
        InaccurateCalculator testCal3 = new InaccurateCalculator(new Double(0));
        assertTrue(testCalculator.testMultiplication(testCal3));
    }

    @Test
    @DisplayName("Test caluclatorTest identifies incorrect adding")
    void badAddingTest() {

        TestCalculator testCalculator = new TestCalculator();
        InaccurateCalculator testCal4 = new InaccurateCalculator(new Double(1));
        assertFalse(testCalculator.testAdd(testCal4));
    }

    @Test
    @DisplayName("Test caluclatorTest identifies incorrect muliplication")
    void badMultiplingTest() {
        TestCalculator testCalculator = new TestCalculator();
        InaccurateCalculator testCal5 = new InaccurateCalculator(new Double(1));
        assertFalse(testCalculator.testMultiplication(testCal5));
    }

}

class TestCal extends Calculator{

    Double a, b, c;

    public TestCal(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double x(String x){
        switch(x.replace(" ", "")) {
            case "12+5": return a;
            case "12x5": return b;
            case "12[3": return c;
        }
        return null;

    }

}

class InaccurateCalculator extends Calculator{

    Double a;

    public InaccurateCalculator(Double a) {
        this.a = a;
    }

    public Double x(String x){

        Pattern pattern = Pattern.compile("\\d+|[\\-]\\d+");
        List<Double> list = new ArrayList<Double>();
        Matcher m = pattern.matcher(x);

        while (m.find()) {
            list.add(new Double(m.group()));
        }

        if(x.contains(" + ") & list.size()==2){
            return new Double(a + list.get(0) + list.get(1));

        } else if(x.contains(" * ") & list.size()==2){
            return new Double(a + list.get(0) * list.get(1));
        } else if(x.contains(" - ") & list.size()==2){
            return new Double(a + list.get(0) - list.get(1));
        } else if(x.contains(" / ") & list.size()==2){
            return new Double(a + list.get(0) / list.get(1));
        } else {
            return null;
        }
    }
}
