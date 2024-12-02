package Programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP03IntermediateAndTerminalOperations {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(3,23,4,5,8,9,5,4,6);
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        integerList.stream()
                .sorted(Comparator.comparing(n -> n%2==0)) // Intermediate -> the method which returns Stream is a intermediate operation
                .forEach(System.out::println); // terminal

        integerList.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        stringList.stream()
                .map(String::length)
                .forEach(System.out::println);

        integerList.stream()
                .filter(n -> n%2==1)
                .map(c -> (c*c*c))
                .forEach(System.out::println);
    }
}
