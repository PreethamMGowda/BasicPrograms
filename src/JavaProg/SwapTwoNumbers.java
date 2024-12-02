package JavaProg;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        a = a + b; // 30
        b = a - b; //10
        a = a - b;
        System.out.println(a+" "+b);
        usingStream(20, 10);
    }
    private static void usingStream(int a, int b){
        //not possible using stream
    }

}
