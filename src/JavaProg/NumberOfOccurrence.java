package JavaProg;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        String s = "occurrence";
        char[] ch = s.toCharArray();

        for(int j=0;j<s.length();j++) {
            int count = 1;
            if(ch[j] != ' ') {
                for (int i = j + 1; i < s.length(); i++) {
                    if (ch[j] == ch[i]) {
                        count++;
                        ch[i] = ' ';
                    }
                }
                System.out.println(ch[j]+" : "+count);
            }
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){
        final Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((w,q) -> System.out.println(w+" : "+q));
    }
}
