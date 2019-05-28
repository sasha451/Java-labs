import java.util.Collection;
import java.util.function.Predicate;

public class Printer {
    public void print(Collection<Integer> collection, Predicate<Integer> predicate){
        collection.stream().filter(value->predicate.test(value)).peek(value->System.out.println(value));
    }
}
