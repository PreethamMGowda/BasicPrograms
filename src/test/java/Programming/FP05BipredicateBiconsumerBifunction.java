package Programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP05BipredicateBiconsumerBifunction {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = even -> even%2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> append = x -> x+" ";

        Consumer<Integer> sysOutConsumer = System.out::println;

        // Accepts two inputs returns boolean, since always boolean is output no need to specify it
        BiPredicate<Integer, String> biPredicate = (x,y) -> {
          return x<10 && y.length()>5;
        };

        System.out.println(biPredicate.test(15, "in28minutes"));

        // Accepts two inputs and returns single output, here output can be anything need to specify the output type
        BiFunction<Integer, String, String> biFunction = (x,y) -> {
          return x+" "+y;
        };

        System.out.println(biFunction.apply(15, "in28minutes"));

        BiConsumer<String, String> biConsumer = (s1,s2) -> {
            System.out.println(s1+" "+s2);
        };

        biConsumer.accept("Stocks", "Mutual Funds");
    }
}
