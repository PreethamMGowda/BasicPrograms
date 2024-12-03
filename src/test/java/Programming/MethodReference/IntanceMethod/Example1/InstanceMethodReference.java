package Programming.MethodReference.IntanceMethod.Example1;

public class InstanceMethodReference {
    public void saySomething(){
        System.out.println("Hello, this is Instance method");
    }

    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        Sayable sayable = instanceMethodReference::saySomething;
        sayable.say();

        // or

        Sayable sayable1 = new InstanceMethodReference()::saySomething;
        sayable1.say();
    }
}
