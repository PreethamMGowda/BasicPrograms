package JavaProg;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        streamLogic(n);
    }
    private static void streamLogic(int n){
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0]+f[1]})
                .limit(n)
                .map(f -> f[0])
                .forEach(System.out::println);
    }

}
