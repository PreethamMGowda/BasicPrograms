package JavaProg;

public class SumOfEachDigit {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int rem, sum=0;
        while(n>0){
            rem = n%10;
            n = n/10;
            sum = sum + rem;
        }
        System.out.println(sum);
        streamLogic(temp);
    }
    private static void streamLogic(int n){
        final int sum = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
