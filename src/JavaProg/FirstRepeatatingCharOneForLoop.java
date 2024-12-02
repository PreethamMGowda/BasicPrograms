package JavaProg;

import java.util.Arrays;
import java.util.stream.Stream;

public class FirstRepeatatingCharOneForLoop {

    public static void main(String[] args) {

        String s = "programming";

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                System.out.println(s.charAt(i));
                break;
            }
        }
        System.out.println();
        s.chars().filter(s1 -> s.indexOf(s1) != s.lastIndexOf(s1)).limit(1).mapToObj(c -> String.valueOf((char) c)).forEach(System.out::println);
    }
}
