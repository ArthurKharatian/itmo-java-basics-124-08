package itmo.java.basics.lesson12;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;

        while (i < 10) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("My runnable is running " + Thread.currentThread().getName());
            i++;
        }
    }
}
