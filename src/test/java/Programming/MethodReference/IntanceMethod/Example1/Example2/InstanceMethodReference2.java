package Programming.MethodReference.IntanceMethod.Example1.Example2;

public class InstanceMethodReference2 {
    public void threadStatus(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::threadStatus);
        thread.start();
    }
}
