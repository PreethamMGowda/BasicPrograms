package JavaProg;

import java.util.stream.IntStream;

public class IntegerIsPalindromeOrNot {
    public static void main(String[] args) {
        int n = 1211;
        int temp = n;
        int rem ;
        int sum = 0;
        while(n>0){
            rem = n % 10;
            n = n / 10;
            sum = (sum*10)+rem;
        }
        if(temp == sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        streamLogic(temp);
    }
    private static void streamLogic(int n){
        String str = String.valueOf(n);
        boolean isPalin = IntStream.range(0, str.length()).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        if(isPalin){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
