package Programming;

import java.util.List;
import java.util.function.Predicate;

public class FP05BehaviorParameterization {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> integerSum = List.of(12,9,13,4,6,2,4,12,15);

        final Predicate<Integer> integerPredicate = even -> even % 2 == 0;
        
        filterAndPrint(integerSum, integerPredicate);
        filterAndPrint(integerSum, even -> even % 2 != 0);
        filterAndPrint(integerSum, even -> even % 3 == 0);
    }

    private static void filterAndPrint(List<Integer> integerSum, Predicate<Integer> integerPredicate) {
        integerSum.stream()
                .filter(integerPredicate)
                .forEach(System.out::println);
    }
}
