import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class SubrangeExtractor {
    public Collection<Integer> extract(List<Integer> collection, int begin, int end){
        if (begin<0 || end > collection.size()){
            throw new IllegalArgumentException("Bound error");
        }

        Collection<Integer> subrange = new ArrayList<>();
        IntStream.range(begin,end).forEach(idx->subrange.add(collection.get(idx)));
        return subrange;
    }
}
