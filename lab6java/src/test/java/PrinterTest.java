import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrinterTest {

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
    public void printEven() {
        new Printer().print(collection,value->value%2==0);
    }
}