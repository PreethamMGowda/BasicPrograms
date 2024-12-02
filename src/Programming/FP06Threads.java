package Programming;

import java.util.stream.IntStream;

public class FP06Threads {

    public static void main(String[] args) {
        //traditional
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    System.out.println(Thread.currentThread().getId()+":"+i);
                }
            }
        };

        //Functional
        Runnable runnable2 = () -> IntStream.range(20000, 30000)
                .forEach(i -> System.out.println(Thread.currentThread().getId()+":"+i));

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}
