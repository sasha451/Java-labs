import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CollectionModifierTest {

    private List<Integer> collection = new ArrayList<>();
    private List<Integer> expectedMultipliedBy2 = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        collection.add(1);
        collection.add(2);
        collection.add(2);
        collection.add(1);
        collection.add(5);


        expectedMultipliedBy2.add(2);
        expectedMultipliedBy2.add(4);
        expectedMultipliedBy2.add(4);
        expectedMultipliedBy2.add(2);
        expectedMultipliedBy2.add(10);
    }

    @Test
    public void modify() {
        assertArrayEquals(expectedMultipliedBy2.toArray(),
                new CollectionModifier().modify(collection,value->value*2).toArray());
    }
}