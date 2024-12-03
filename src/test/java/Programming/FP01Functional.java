package Programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 34, 23, 2, 3, 5, 6, 7, 8, 9);
        printAllNumbersInListFunctional(integers);
        printAllEvenNumbersInListFunctional(integers);
    }
    private static void printAllNumbersInListFunctional(List<Integer> integers) {
//        integers.stream().forEach(FP01Functional::print);
        integers.forEach(System.out::println);
    }

    private static void printAllEvenNumbersInListFunctional(List<Integer> integers){
        integers.stream().filter(n -> (n%2==0)).forEach(System.out::println);
    }
}
