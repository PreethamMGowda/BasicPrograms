package JavaProg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicatesUniqueWord {
    public static void main(String[] args) {
        String s = "Welcome to india to welcome to mandya".toLowerCase();
        String[] str = s.split(" ");
        LinkedHashSet<String> uni = new LinkedHashSet<>(Arrays.asList(str));
        uni.forEach(System.out::println);
        streamLogic(s);
    }
    public static void streamLogic(String s){
        List<String> uni = Stream.of(s.split(" "))
                .distinct()
                .toList();
        uni.forEach(System.out::println);
    }

}
