package JavaProg;

import java.util.stream.Collectors;

public class SegregateAlphabetNumberSpecialChar {
    public static void main(String[] args) {
        String s = "Sala#123ga@gmail.com".toLowerCase();
        char[] ch = s.toCharArray();
        String alpha = "";
        String num="";
        String spcl="";
        for(char c:ch){
            if(Character.isAlphabetic(c)){
                alpha = alpha + c;
            } else if (Character.isDigit(c)) {
                num = num + c;
            }else{
                spcl = spcl + c;
            }
        }
        System.out.println(alpha+" "+num+" "+spcl);
        streamLogic(s);
    }
    private static void streamLogic(String s){
        String alpha = s.chars().mapToObj(c-> (char) c)
                .filter(Character::isLetter)
                .map(String::valueOf)
                .collect(Collectors.joining());
        String num =s.chars().mapToObj(c -> (char)c)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
        String spcl = s.chars().mapToObj(c -> (char)c)
                .filter(c -> !Character.isLetterOrDigit(c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(alpha+" "+num+" "+spcl);
    }
}
