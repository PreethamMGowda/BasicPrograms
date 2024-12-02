package Programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP05FunctionalInterface2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        Predicate<Integer> isEvenPredicate = even -> even%2 == 0;

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, String> append = x -> x+" ";

        Consumer<Integer> sysOutConsumer = System.out::println;

        // Operator means both input and output are the same type
        // BinaryOperator accepts two Arguments of same type, since type are same we will represent as single argument
        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
        BinaryOperator<Integer> sumBinaryOperatorMethodReference = Integer::sum;

        // No input and only Output
        Supplier<Integer> returnStaticNumber = () -> 2;
        Supplier<Integer> returnRandomNumber = () -> {
            return new Random().nextInt(1000);
        };

        UnaryOperator<Integer> unaryOperator = x -> x * 3;
    }
}
