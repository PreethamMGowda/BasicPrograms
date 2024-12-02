package JavaProg;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintOnlyDuplicateWord {
    public static void main(String[] args) {
        String s = "Welcome to india to welcome to mandya".toLowerCase();
        String[] str = s.split(" ");
        LinkedHashSet<String> uni = new LinkedHashSet<>(Arrays.asList(str));
        int count;
        for(String st:uni){
            count=0;
            for (String string : str) {
                if (st.equals(string)) {
                    count++;
                }
            }
            if(count>=2){
                System.out.println(st + " " + count);
            }
        }
        streamLogic(s);
    }
    public static void streamLogic(String s){
        Map<String, Long> res = Stream.of(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> dup = res.entrySet().stream()
                  .filter(val -> val.getValue() > 1)
                  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        dup.forEach((key, val) -> System.out.println(key + " "+ val));
    }
}
