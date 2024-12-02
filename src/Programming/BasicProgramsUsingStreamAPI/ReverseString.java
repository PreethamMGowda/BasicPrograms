package Programming.BasicProgramsUsingStreamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "preetham gowda";
        String revStringMethod1 = reverseStringMethod1(str);
        System.out.println(revStringMethod1);

        String revStringMethod2 = reverseStringMethod2(str);
        System.out.println(revStringMethod2);
    }

    private static String reverseStringMethod2(String str) {
        return str.chars().mapToObj(c -> String.valueOf((char) c))
                .reduce((s1,s2) -> s2+s1)
                .orElse("");
    }

    private static String reverseStringMethod1(String str) {
        //StringBuilder.reverse                 StringBuilder takes the string and reverse method reverses the string
        //Collect(Collectors.joining)           Collectors.joining method collects elements and converts to String
        return Stream.of(str).map(string -> new StringBuilder(string).reverse()).collect(Collectors.joining());
    }
}
