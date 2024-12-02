package JavaProg;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeOrNotInList {
    public static void main(String[] args) {
        int n = 11;
        int count=0;
        for(int i=n;i>=1;i--){
            int j=1;
            while(i>=j){
                if(i%j==0){
                    count++;
                }
                j++;
            }
            if(count == 2){
                System.out.println(i + " prime");
            }else {
                System.out.println(i + " not prime");
            }
            count=0;
        }
        streamLogic(n);
        }
    private static void streamLogic(int n){
        int temp = n;
        Stream<Long> list = IntStream.range(1, n+1).mapToObj(p -> {
            System.out.print(p+" ");
            return IntStream.range(1, n+1)
                    .filter(pr -> p % pr == 0)
                    .count();
        });
        list.forEach(System.out::println);
    }
}
