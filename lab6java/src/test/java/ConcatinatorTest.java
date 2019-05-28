import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class ConcatinatorTest {

    @Test
    public void concatinate() {
        Collection<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        Collection<Integer> arr2 = new ArrayList<>();
        arr1.add(3);
        arr1.add(4);
        Collection<Integer> arr3 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        Integer[] expectedConcatinated = new Integer[]{1,2,3,4,5,6};
        assertArrayEquals(expectedConcatinated,new Concatinator().concatinate(arr1,arr2,arr3).toArray());
    }
}