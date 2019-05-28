import java.util.Collection;
import java.util.function.Predicate;

public class Verifier {
    public boolean checkIfAllElementsMatchCondition(Collection<Student> students, Predicate<Student> predicate){
        return students.stream().allMatch(predicate);
    }
}
