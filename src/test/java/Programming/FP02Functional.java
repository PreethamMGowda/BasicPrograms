package Programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> integerSum = List.of(12,9,13,4,6,2,4,12,15);
        System.out.println(printSumOfAllNumbersInList(integerSum));
    }

    private static int sum(int a, int b){
        return a+b;
    }

    private static int printSumOfAllNumbersInList(List<Integer> integerSum) {
        return integerSum.stream()
//                .reduce(0, FP02Functional::sum);
//                .reduce(0, (a,b) -> (a + b));
                .reduce(0, Integer::sum);
    }
}
