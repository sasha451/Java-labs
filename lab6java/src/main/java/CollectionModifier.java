import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionModifier {
    public Collection<Integer> modify(Collection<Integer> collection, Function<Integer,Integer> modifier){
        return collection.stream().map(value-> modifier.apply(value)).collect(Collectors.toList());
    }
}
