package Programming.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FlapMapAndHigherOrder {
    public static void main(String[] args) {
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> stringList2 = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println(
                stringList.stream().collect(Collectors.joining(" "))
        );
        //Or
        System.out.println(
                String.join(" ", stringList)
        );

        System.out.println(
                Arrays.toString("Spring".split(""))
        );

        //Stream of string[] -> to convert it to stream of string, we uses
        System.out.println(
                stringList.stream().map(cos -> cos.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())
        );

        System.out.println(
                stringList.stream().flatMap(str -> stringList2.stream().map(str2 -> List.of(str, str2))).collect(Collectors.toList())
        );

        System.out.println(
                stringList.stream().flatMap(str -> stringList2.stream().map(str2 -> List.of(str, str2))).filter(list -> !list.get(0).equals(list.get(1)))
                        .collect(Collectors.toList())
        );

        System.out.println(
                stringList.stream().flatMap(str -> stringList2.stream().filter(str2 -> str2.length()==str.length()).map(str2 -> List.of(str, str2)))
                        .filter(list -> !list.get(0).equals(list.get(1)))
                        .collect(Collectors.toList())
        );

        //HigherOrder Functions
        // refer FP05FunctionalCustomClass - line 178

        //Parallel
        long beforeSequenceTime = System.currentTimeMillis();
        System.out.println(
                LongStream.rangeClosed(0, 1000000000).sum()
        );
        System.out.println(
                System.currentTimeMillis() - beforeSequenceTime
        );

        long beforeParallelTime = System.currentTimeMillis();
        System.out.println(
                LongStream.rangeClosed(0, 1000000000).parallel().sum()
        );
        System.out.println(
                System.currentTimeMillis() - beforeParallelTime
        );
    }
}
