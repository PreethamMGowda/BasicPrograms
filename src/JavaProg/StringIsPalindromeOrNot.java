package JavaProg;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringIsPalindromeOrNot {
    public static void main(String[] args) {
        String s = "AAMANAMAA";
        String str = "";
        int count = s.length()-1;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i) == s.charAt(count)) {
               count--;
               str = str + s.charAt(i);
           }
        }
        if(s.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        streamLogic(s);
    }
    private static void streamLogic(String s){

        String str = IntStream.range(0, s.length()).mapToObj(c -> s.charAt(s.length() - 1 - c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        if(s.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
