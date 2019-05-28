import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {

    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        students.add(new Student("Ivan",15));
        students.add(new Student("Alex",16));
        students.add(new Student("Sahs",17));
    }

    @Test
    public void findMin() {
        assertEquals(students.get(0),new Finder().findMin(students));
    }

    @Test
    public void findMax() {
        assertEquals(students.get(2),new Finder().findMax(students));
    }
}