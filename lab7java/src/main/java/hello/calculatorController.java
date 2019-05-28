package hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorController{
    @GetMapping("/calculateFibonacci/{number}")
    public int greeting(@PathVariable("number") int number) {
        return calculateFibonacci(number);
    }

    private int calculateFibonacci(int number) {
        if (number == 0)
            return 0;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= number; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}