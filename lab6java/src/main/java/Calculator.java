import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Calculator {
    public Optional<Integer> calculateFactorial(int number) {
        List<Integer> arrayFrom1ToNumber = new ArrayList<>();
        IntStream.range(1,number+1).forEach(arrayFrom1ToNumber::add);
        return arrayFrom1ToNumber.stream().reduce((prev,next)->prev*next);

    }

    public Optional<Integer> calculateSum(Collection<Integer> collection){
        return collection.stream().reduce((prev,next)->prev+next);
    }
}
