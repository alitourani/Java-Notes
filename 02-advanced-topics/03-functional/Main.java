import java.util.List;
import java.util.stream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // First log
        System.out.println("Java Functional Interfaces!");
        
        // I. Lambda expression
        Square s = (int x) -> x * x;
        
        int ans = s.calculate(5);
        System.out.println(ans);
        
        // II. Consumer
        // It accepts a single input argument and returns no result.
        Consumer<String> display =
            name -> System.out.println("Hello, " + name);
        display.accept("Ali"); // Accepts a single arguments and performs the operation
        
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(50);
        numbers.add(150);
        numbers.add(250);
        Consumer<List<Integer> > dispList = 
            list -> list.stream().forEach(a -> System.out.print(a + " "));
        dispList.accept(numbers);
        System.out.println();
        
        // III. Predicate
        // It accepts a single argument and returns a boolean result.
        Predicate<Integer> isEven =
            num -> num % 2 == 0;
        System.out.println(isEven.test(20));
        
        // IV. Supplier
        // It does not take any arguments but provides a result.
        Supplier<String> message =
            () -> "Welcome to Java";
        System.out.println(message.get());

        // V. Stream
        List<String> veggies = List.of(
            "Spinach",
            "Carrot",
            "Cabbages",
            "Green Peas",
            "Brussels Sprouts"
        );
        // Check for vegetables with more than one word
        veggies.stream().anyMatch(v->v.contains(" "));
        veggies.stream().allMatch(v->v.contains("s")); // False
        veggies.stream()
            .filter(v->v.startsWith("c"))
            .forEach(System.out::println);
        veggies.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}

@FunctionalInterface
interface Square {
    int calculate(int x);
}