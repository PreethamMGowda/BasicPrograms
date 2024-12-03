package Programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP05BehaviorParameterizationExercises {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> integerSum = List.of(12,9,13,4,6,2,4,12,15);

        List<Integer> doubled = filterAndPrint(integerSum, a -> a * a);
        List<Integer> square = filterAndPrint(integerSum, a -> a * a * a);
        List<Integer> qube = filterAndPrint(integerSum, a -> a * a * a * a);

        System.out.println(doubled);
    }

    private static List<Integer> filterAndPrint(List<Integer> integerSum, Function<Integer, Integer> mappingFunction) {
        return integerSum.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
