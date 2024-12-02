package Programming;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(3,23,4,5,8,9,5,4,6);
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllOddNumbersInList(integerList);
        printAllCoursesIndividually(stringList);
        printAllCoursesContianingWordSpring(stringList);
        printAllCoursesContainsAtleast4Charecter(stringList);
        printAllSqaureOfEvenNumbersInList(integerList);
        printAllCubesOfOddNumbersInList(integerList);
        printAllNumberOfCharecterInEachCourse(stringList);
    }

    private static void printAllNumberOfCharecterInEachCourse(List<String> stringList) {
        stringList.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    private static void printAllCubesOfOddNumbersInList(List<Integer> integerList) {
        integerList.stream()
                .filter(n -> n%2==1)
                .map(c -> (c*c*c))
                .forEach(System.out::println);
    }

    private static void printAllSqaureOfEvenNumbersInList(List<Integer> integerList) {
        integerList.stream()
                .filter(n -> n%2==0)
                .map(s -> s*s)
                .forEach(System.out::println);
    }

    private static void printAllCoursesContainsAtleast4Charecter(List<String> stringList) {
        stringList.stream().filter(s -> s.length()>=4).forEach(System.out::println);
    }

    private static void printAllCoursesContianingWordSpring(List<String> stringList) {
        stringList.stream().filter(s -> s.contains("Spring")).forEach(System.out::println);
    }

    private static void printAllCoursesIndividually(List<String> stringList) {
        stringList.forEach(System.out::println);
    }

    private static void printAllOddNumbersInList(List<Integer> integerList) {
        integerList.stream().filter(n -> n%2 == 1).forEach(System.out::println);
    }
}
