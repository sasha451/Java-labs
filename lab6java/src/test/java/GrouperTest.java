import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class GrouperTest {
    private List<Student> ksisStudents = new ArrayList<>();
    private List<Student> fkpStudents = new ArrayList<>();

    private Map<String,List<Student>> expectedGroupedByFaculty = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        ksisStudents.add(new Student("Alex","KSIS"));
        ksisStudents.add(new Student("Dima","KSIS"));
        ksisStudents.add(new Student("Keks","KSIS"));

        fkpStudents.add(new Student("Pasha","FKP"));
        fkpStudents.add(new Student("Galya","FKP"));
        fkpStudents.add(new Student("Vitya","FKP"));

        expectedGroupedByFaculty.put("FKP",fkpStudents);
        expectedGroupedByFaculty.put("KSIS",ksisStudents);

    }

    @Test
    public void group() {
        List<Student> concatenetedStudents = new ArrayList<Student>(){{
            addAll(fkpStudents);
            addAll(ksisStudents);
        }};

        assertTrue(expectedGroupedByFaculty.equals(new Grouper().group(concatenetedStudents,Student::getFaculty)));
    }
}