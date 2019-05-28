import org.junit.internal.runners.statements.ExpectException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class SubrangeExtractorTest {
    private List<Integer> mainRange = new ArrayList<>();
    private List<Integer> subrangeFrom3To7 = new ArrayList<>();

    @org.junit.Before
    public void setUp() throws Exception {
        mainRange.add(1);
        mainRange.add(2);
        mainRange.add(3);
        mainRange.add(4);
        mainRange.add(5);
        mainRange.add(6);
        mainRange.add(7);
        mainRange.add(8);
        mainRange.add(9);

        subrangeFrom3To7.add(4);
        subrangeFrom3To7.add(5);
        subrangeFrom3To7.add(6);
        subrangeFrom3To7.add(7);
    }

    @org.junit.Test
    public void getSubrangeFrom3To7() {
        Collection<Integer> actual = new SubrangeExtractor().extract(mainRange,3,7);
        assertArrayEquals(actual.toArray(),subrangeFrom3To7.toArray());
    }
}