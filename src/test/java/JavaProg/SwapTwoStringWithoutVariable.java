package JavaProg;

import java.util.List;
import java.util.stream.Stream;

public class SwapTwoStringWithoutVariable {
    public static void main(String[] args) {
        String s1 = "first";
        String temp1 = s1;
        String s2 = "second";
        String temp2 = s2;
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1+" : "+s2);
        streamLogic(temp1, temp2);
    }
    private static void streamLogic(String temp1, String temp2){
        List<String> list = Stream.of(new String[]{temp2, temp1}).toList();
        System.out.println(list.get(0)+" : "+list.get(1));
    }
}
