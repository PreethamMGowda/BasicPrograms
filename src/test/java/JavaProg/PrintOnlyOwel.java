package JavaProg;

import java.util.Set;
import java.util.stream.Collectors;

public class PrintOnlyOwel {
    public static void main(String[] args) {
        String s = "India".toLowerCase();
        char[] ch = s.toCharArray();
        for (char c:ch){
            if((c == 'a' || c == 'A') ||(c == 'e' || c == 'E') ||(c == 'i' || c == 'I') ||(c == 'o' || c == 'O') ||(c == 'u' || c == 'U')){
                System.out.println(c);
            }
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){
        Set<Character> owl = s.chars().mapToObj(c -> (char)c)
                .filter(c -> (c == 'a' || c == 'A') ||(c == 'e' || c == 'E') ||(c == 'i' || c == 'I') ||(c == 'o' || c == 'O') ||(c == 'u' || c == 'U'))
                .collect(Collectors.toSet());
        owl.forEach(System.out::println);
    }
}
