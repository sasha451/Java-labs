import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ParserTest {
    private List<Student> students = new ArrayList<>();
    private List<String> expectedTheirNames = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        Student student1 = new  Student("Povidlo",18);
        Student student2 = new Student("Kekalo",19);
        Student student3 = new Student("Prepod",17);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        expectedTheirNames.add(student1.getName());
        expectedTheirNames.add(student2.getName());
        expectedTheirNames.add(student3.getName());
    }

    @Test
    public void getNames() {
        Collection<String> actualNames = new Parser().getNames(students);
        assertArrayEquals(actualNames.toArray(),expectedTheirNames.toArray());
    }
}