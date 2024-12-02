package Programming;

import java.util.Comparator;
import java.util.List;

public class FP02Exercises {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(3,23,4,5,8,9,5,4,6);
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllUniqueNumbersInAsscendingOrder(integerList);
        printAllNumbersInAsscendingOrder(integerList);
        printAllCoursesInDecendingOrder(stringList);
        printAllcourseBasedOnSortingCondition(stringList);
        printAllNumbersBasedOnSortingCondition(integerList);
    }

    private static void printAllNumbersBasedOnSortingCondition(List<Integer> integerList) {
        integerList.stream().sorted(Comparator.comparing(n -> n%2==0))
                .forEach(System.out::println);
    }

    private static void printAllcourseBasedOnSortingCondition(List<String> stringList) {
        stringList.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static void printAllCoursesInDecendingOrder(List<String> stringList) {
        stringList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void printAllUniqueNumbersInAsscendingOrder(List<Integer> integerList) {
        integerList.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void printAllNumbersInAsscendingOrder(List<Integer> integerList) {
        integerList.stream().sorted().forEach(System.out::println);
//      OR
        integerList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
