package Programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP04HowFunctionalInterfaceWorkInternally {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> integerSum = List.of(12,9,13,4,6,2,4,12,15);
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Predicate<Integer> howPredicateWorks = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Consumer<Integer> println = System.out::println;
        integerSum.stream()
                .filter(integerPredicate)
                /*
                boolean isEvenMethod(int x){
                    return x%2==0;
                }
                 */
                .map(integerIntegerFunction)
                /*
                int square(int x) {
                    return x * x;
                }
                 */
                .forEach(println);
    }
}
