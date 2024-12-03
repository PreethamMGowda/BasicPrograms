package JavaProg;

import java.util.stream.IntStream;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 10;
        int j=1, count=0;
        while(n>=j){
            if(n%j==0){
                count++;
            }
            j++;
        }
        if(count == 2){
            System.out.println(n + " prime");
        }else{
            System.out.println(n + " not prime");
        }
        streamLogic(n);
    }
    private static void streamLogic(int n){
        final long count = IntStream.range(1, (n+1)).filter(no -> n % no == 0).count();
        if(count == 2){
            System.out.println(n + " prime");
        }else{
            System.out.println(n + " not prime");
        }
    }
}
