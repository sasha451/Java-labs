import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VerifierTest {

    private List<Student> studentsUnder18 = new ArrayList<>();
    private List<Student> studentsAboveEqual18 = new ArrayList<>();
    private List<Student> studentsUnderAndAbove18 = new ArrayList<>();

    @Before
    public void setStudents(){
        studentsUnder18.add(new Student("Ivan",15));
        studentsUnder18.add(new Student("Alex",16));
        studentsUnder18.add(new Student("Sahs",17));

        studentsAboveEqual18.add(new Student("Povidlo",18));
        studentsAboveEqual18.add(new Student("Kekalo",19));

        studentsUnderAndAbove18.add(new Student("Gikalo",17));
        studentsUnderAndAbove18.add(new Student("Prepod",19));
    }

    @org.junit.Test
    public void checkUnder18Test() {
        assertTrue(new Verifier().checkIfAllElementsMatchCondition(studentsUnder18,student->!student.isAdult()));
    }

    @org.junit.Test
    public void checkAboveEqual18Test() {
        assertTrue(new Verifier().checkIfAllElementsMatchCondition(studentsAboveEqual18,student->student.isAdult()));
    }

    @org.junit.Test
    public void checkStudentsUnderAndAbove18Test() {
        assertFalse(new Verifier().checkIfAllElementsMatchCondition(studentsUnder18,student->student.isAdult()));
    }
}