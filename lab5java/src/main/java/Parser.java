import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class Parser {
    public Collection<String> getNames(Collection<Student> students){
        Collection<String> names= new ArrayList<>();
        students.stream().forEach(student -> names.add(student.getName()));
        return names;
    }
}
