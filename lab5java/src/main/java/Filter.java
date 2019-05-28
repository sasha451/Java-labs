import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public Collection<Student> filter(Collection<Student> students, Predicate<Student> predicate){
        return students.stream().filter(predicate).collect(Collectors.toList());
    }
}
