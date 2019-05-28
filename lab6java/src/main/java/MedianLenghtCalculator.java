import java.util.ArrayList;
import java.util.Collection;

public class MedianLenghtCalculator {
    public final Integer medianStringLength(Collection<String> collection) {
        return collection.stream().map(String::length).collect(new MedianCollector());
    }
}
