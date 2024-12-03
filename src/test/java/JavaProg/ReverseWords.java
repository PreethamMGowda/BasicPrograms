package JavaProg;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Welcome to india to welcome to mandya".toLowerCase();
        String[] str = s.split(" ");
        for(int i= str.length-1;i>=0;i--){
            System.out.println(str[i]);
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){
        List<String> reverse = Stream.of(s.split(" "))
                .collect(Collectors.collectingAndThen(Collectors.toList(), st -> {
                    Collections.reverse(st);
                    return st.stream();
                })).toList();
        reverse.forEach(System.out::println);
    }
}
