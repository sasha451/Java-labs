import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorter {
    public Collection<Student> sort(Collection<Student> students, Comparator<Student> comparator){
        return students.stream().sorted(comparator).collect(Collectors.toList());
    }
}
