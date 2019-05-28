import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatinator {
    public Collection<Integer> concatinate(Collection<Integer> ... collections){
        Stream<Collection<Integer>> collectionsStream = Arrays.stream(collections);
        Stream<Integer> integerStream = collectionsStream.flatMap(microstream->microstream.stream());
        return integerStream.collect(Collectors.toList());
    }
}
