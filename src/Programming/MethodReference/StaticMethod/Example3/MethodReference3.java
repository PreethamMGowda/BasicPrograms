package Programming.MethodReference.StaticMethod.Example3;

import java.util.function.BiFunction;

public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        System.out.println(adder.apply(10, 20));
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        System.out.println(adder2.apply(10, 21.0f));
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
        System.out.println(adder3.apply(10.0f, 22.0f));

    }
}
