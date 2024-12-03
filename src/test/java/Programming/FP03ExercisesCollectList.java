package Programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP03ExercisesCollectList {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(3,23,4,5,8,9,5,4,6);
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> doubledList = doubleNumbers(integerList);
        List<Integer> lengthOfCourse = findLengthOfCourse(stringList);
        System.out.println(doubledList);
        System.out.println(lengthOfCourse);

    }

    private static List<Integer> findLengthOfCourse(List<String> lengthString){
        return lengthString.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }
    private static List<Integer> doubleNumbers(List<Integer> numbers){
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
