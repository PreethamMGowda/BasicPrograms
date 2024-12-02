package Programming;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllAndReplaceAll {
    public static void main(String[] args) {
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> muttableStringList = new ArrayList<>(stringList);

        muttableStringList.replaceAll(String::toUpperCase);

        System.out.println(muttableStringList);

        muttableStringList.removeIf(str -> str.length()<6);

        System.out.println(muttableStringList);
    }
}
