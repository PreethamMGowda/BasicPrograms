package JavaProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringWithoutLengthMethod {
    public static void main(String[] args) {
        String str = "preetham";
        char[] s = str.toCharArray();
        int j=0;
        for(char st : s){
            j++;
        }
        for(int i=j-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        usingStream(str);
    }

    public static void usingStream(String str){

        List<Character> charList = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(ArrayList::new));

        // Reverse the list
        Collections.reverse(charList);

        // Collect the characters back into a string
        String arr = charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println();
        System.out.println(arr);

    }
}
