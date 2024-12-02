package JavaProg;


public class SumOfEachDigitInString {
    public static void main(String[] args) {
        String s = "a12@c3";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sum = sum + (s.charAt(i)-48);
            }
        }
        System.out.println(sum);
        streamLogic(s);
    }
    private static void streamLogic(String s){
        int sum = s.chars().filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
