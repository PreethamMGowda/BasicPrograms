package JavaProg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrenceOfEachWord {
    public static void main(String[] args) {
        String s = "Welcome to india to welcome to mandya".toLowerCase();
        String[] str = s.split(" ");
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//        for(int i=0;i<str.length;i++){
//            set.add(str[i]);
//        }

//        instead we can use below one line
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(str));
        for(String st : set){
            int count = 0;
            for(int i=0;i< str.length;i++){
                if(st.equals(str[i])){
                    count++;
                }
            }
            System.out.println(st + " : "+count);
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){
        Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key1, value) -> System.out.println(key1 + " : " + value));
    }
}
