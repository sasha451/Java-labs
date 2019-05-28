import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouper {
    public Map<String, List<Student>> group(Collection<Student> students, Function<Student,String> selector){
        return students.stream().collect(Collectors.groupingBy(selector));
    }
}
