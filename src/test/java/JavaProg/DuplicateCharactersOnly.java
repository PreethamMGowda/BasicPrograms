package JavaProg;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersOnly {
    public static void main(String[] args) {
        String s = "Character s".toLowerCase();
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            boolean present = false;
            for(int j=i+1;j<s.length();j++){
                if (ch[i] == ch[j]) {
                    present = true;
                    break;
                }
            }
            if(present){
                System.out.println(ch[i]);
            }
        }
        streamLogic(s);
    }

    private static void streamLogic(String s){
        Map<Character, Long> count = s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        count.entrySet().stream()
                .filter(key -> key.getValue()>1)
                .forEach(System.out::println);
    }

}
