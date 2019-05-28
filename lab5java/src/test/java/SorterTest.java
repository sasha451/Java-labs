import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    private List<Student> students = new ArrayList<>();
    private List<Student> expectedAcsedency = new ArrayList<>();
    private List<Student> expectedDescendy = new ArrayList<>();
    @Before
    public void setUp() throws Exception {
        Student student1 = new  Student("Povidlo",18);
        Student student2 = new Student("Kekalo",19);
        Student student3 = new Student("Prepod",17);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        expectedDescendy.add(student2);
        expectedDescendy.add(student1);
        expectedDescendy.add(student3);

        expectedAcsedency.add(student3);
        expectedAcsedency.add(student1);
        expectedAcsedency.add(student2);
    }

    @Test
    public void sortAscending() {
        Collection<Student> actualAscedency = new Sorter().sort(students,(student1, student2)->student1.getAge()-student2.getAge());
        assertArrayEquals(actualAscedency.toArray(),expectedAcsedency.toArray());
    }

    @Test
    public  void sortDescending(){
        Collection<Student> actualDescendy = new Sorter().sort(students,(student1, student2)->student2.getAge()-student1.getAge());
        assertArrayEquals(actualDescendy.toArray(),expectedDescendy.toArray());
    }
}