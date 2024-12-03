package Programming;

import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {
        List<Integer> integerSum = List.of(12,9,13,4,6,2,4,12,15);
        System.out.println(printSumOfAllNumbersInList(integerSum));
    }

    private static int printSumOfAllNumbersInList(List<Integer> integerSum) {
        int sum = 0;
        for(int integer : integerSum){
            sum += integer;
        }
        return sum;
    }
}
