import java.util.Collection;
import java.util.function.BiPredicate;

public class Finder {
    public Student findMin(Collection<Student> students){
        return students.stream().min(Student::compareTo).get();
    }

    public Student findMax(Collection<Student> students){
        return students.stream().max(Student::compareTo).get();
    }
}
