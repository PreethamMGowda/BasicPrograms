package Programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOfAndBigInteger {

    public static void main(String[] args) {

        //Reference Stream
        System.out.println(
                Stream.of(12,9,13,4,6,2,4,12,15).count());

        System.out.println(
                Stream.of(12,9,13,4,6,2,4,12,15).reduce(0, Integer::sum));

        //Primitive Stream
        int[] noArrays = {12,9,13,4,6,2,4,12,15};

        System.out.println(
                Arrays.stream(noArrays).sum()
        );

        System.out.println(
                Arrays.stream(noArrays).average()
        );

        System.out.println(
                Arrays.stream(noArrays).max()
        );

        //
        System.out.println(
                IntStream.range(1,10).sum()
        );
        //O/P - 45 ----- it's not included first value

        System.out.println(
                IntStream.rangeClosed(1,10).sum()
        );
        //O/P - 55 ----- rangeClosed method includes first value

        System.out.println(
                IntStream.iterate(1, i -> i + 2).limit(10).sum()
        );

        System.out.println(
                IntStream.iterate(1, i -> i + 2).peek(System.out::println).limit(10).sum()
        );

        System.out.println(
                IntStream.iterate(2, i -> i + 2).peek(System.out::println).limit(10).sum()
        );

        System.out.println(
                IntStream.iterate(2, i -> i * 2).limit(10).sum()
        );

        //collect all the values into list, but values are primitive type, so we can use boxed method to convert to reference
        System.out.println(
                IntStream.iterate(2, i -> i * 2).limit(10).boxed().collect(Collectors.toList())
        );

        //BigInteger
        System.out.println(
                LongStream.rangeClosed(1, 500).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)
        );

        System.out.println(
                LongStream.rangeClosed(1, 500).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply).toString().length()
        );
    }
}
