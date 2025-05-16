package anonymous_functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Printer p = () -> System.out.println("Print!");
        p.print();

        Greeting g = (name) -> System.out.println("Hi, " + name + "!");
        g.greet("Riddhi");

        Adder a = (x, y) -> x+y;
        System.out.println(a.add(2, 3));

        Calculator calculator = new Calculator();
        int result = calculator.compute(4, 5, (x, y) -> x+y);
        System.out.println(result);

        MaxFinder finder = (x, y) -> (x>y) ? x : y;
        System.out.println(finder.findMax(5, 8));

        StringManipulation s = (x) -> new StringBuilder(x).reverse().toString();
        System.out.println(s.reverseString("riddhi"));

        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverse.apply("Hello"));

        Predicate<String> startsWithA = str -> str.startsWith("A");
        List<String> names = Arrays.asList("Ariel", "Luke", "Haley", "Andy", "Ariana");
        String res = names.stream()
        .filter(startsWithA)
        .collect(Collectors.joining(" "));
        
        System.out.println(res);
        // .forEach(System.out::println);
        // .forEach(name -> System.out.print(name + " "));
    }
}

@FunctionalInterface
interface Printer {
    void print();
}

@FunctionalInterface
interface Greeting{
    void greet(String name);
}

@FunctionalInterface
interface Adder{
    int add(int x, int y);
}

@FunctionalInterface
interface MathOperation {
    int operate(int x, int y);
}

@FunctionalInterface
interface MaxFinder {
    int findMax(int x, int y);
}

@FunctionalInterface
interface StringManipulation {
    String reverseString(String x);
}