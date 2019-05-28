import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RepeatingElementsExcludorTest {
    private List<Integer> collection = new ArrayList<>();
    private List<Integer> withoutRepeat = new ArrayList<>();
    @Before
    public void setUp() throws Exception {
        collection.add(1);
        collection.add(2);
        collection.add(2);
        collection.add(1);
        collection.add(5);
        collection.add(7);
        collection.add(8);
        collection.add(7);
        collection.add(9);

        withoutRepeat.add(1);
        withoutRepeat.add(2);
        withoutRepeat.add(5);
        withoutRepeat.add(7);
        withoutRepeat.add(8);
        withoutRepeat.add(9);
    }

    @Test
    public void excludeRepeating() {
        assertArrayEquals(withoutRepeat.toArray(),new RepeatingElementsExcludor().excludeRepeating(collection).toArray());
    }
}