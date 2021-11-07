import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static AtomicInteger amount = new AtomicInteger(0);

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunThread(0));
        thread1.start();
        Thread thread2 = new Thread(new RunThread(1));
        thread2.start();

        System.out.println(amount.get());
    }
}