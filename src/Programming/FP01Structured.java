package Programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        printAllNumbersInListStructured(List.of(1,34,23,2,3,5,6,7,8,9));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for (int interger : integers ){
            System.out.println(interger);
        }
    }
}
