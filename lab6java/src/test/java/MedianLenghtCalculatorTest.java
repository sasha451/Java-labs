import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class MedianLenghtCalculatorTest {

    private Collection<String> collection = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        collection.add("one");
        collection.add("two");
        collection.add("three");
    }

    @Test
    public void medianStringLength() {
        //assertThat(collection.newmedianStringLength(), is(;
        assertTrue(3 == new MedianLenghtCalculator().medianStringLength(collection));
    }
}