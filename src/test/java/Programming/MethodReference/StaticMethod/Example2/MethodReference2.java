package Programming.MethodReference.StaticMethod.Example2;

import Programming.MethodReference.StaticMethod.Example1.MethodReference;

public class MethodReference2 {
    public static void threadStatus(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReference2::threadStatus);
        thread.start();
    }
}
