package Programming.MethodReference;

import java.util.List;
import java.util.function.Supplier;

public class MR01Exercises {

    private static void print(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<String> stringList = List.of("Spring", "Spring boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        stringList.stream()
                .map(String::toUpperCase)
//                .forEach(System.out::println);
                .forEach(MR01Exercises::print);

//      Constructor
        Supplier<String> object = String::new;

    }


}
