import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {
    private List<Integer> collection = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
    }

    @Test
    public void calculateFactorial() {
        assertTrue(720 == new Calculator().calculateFactorial(6).get());
    }

    @Test
    public void calculateSum() {
        assertTrue(15 == new Calculator().calculateSum(collection).get());
    }
}