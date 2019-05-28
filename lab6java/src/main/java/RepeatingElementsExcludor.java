import java.util.Collection;
import java.util.stream.Collectors;

public class RepeatingElementsExcludor {
    public Collection<Integer> excludeRepeating(Collection<Integer> collection){
        return collection.stream().distinct().collect(Collectors.toList());
    }
}
