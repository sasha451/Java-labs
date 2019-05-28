import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {
    private List<Student> students = new ArrayList<>();
    private List<Student> expectedOldBoys = new ArrayList<>();
    private List<Student> expectedYoungBoys = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        Student old1 = new  Student("Povidlo",18);
        Student old2 = new Student("Kekalo",19);
        Student old3 = new Student("Prepod",19);

        Student young1 = new Student("Ivan",15);
        Student young2 = new Student("Gikalo",17);

        students.add(young1);
        students.add(old1);
        students.add(old2);
        students.add(young2);
        students.add(old3);

        expectedOldBoys.add(old1);
        expectedOldBoys.add(old2);
        expectedOldBoys.add(old3);

        expectedYoungBoys.add(young1);
        expectedYoungBoys.add(young2);
    }

    @Test
    public void excludeAdult() {
        Collection<Student> actualOldBoys = new Filter().filter(students,Student::isAdult);
        assertArrayEquals(actualOldBoys.toArray(),expectedOldBoys.toArray());
    }

    @Test
    public void excludeYoung() {
        Collection<Student> actualYoungBoys = new Filter().filter(students,student -> student.getAge()<18);
        assertArrayEquals(actualYoungBoys.toArray(),expectedYoungBoys.toArray());
    }
}