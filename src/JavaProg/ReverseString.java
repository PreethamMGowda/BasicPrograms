package JavaProg;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "preetham A M";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        usingStream(str);
    }
    private static void usingStream(String str){
        final String collect = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(Objects::toString)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
