import java.util.Collection;

public class Printer {
    public void print(Collection<Student> students){
        students.forEach(System.out::println);
    }
}
