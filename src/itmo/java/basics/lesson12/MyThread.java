package itmo.java.basics.lesson12;

public class MyThread extends Thread {
    private final Object object;

    public MyThread(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Object object = new Object();
        MyThread myThread1 = new MyThread(object);
        MyThread myThread2 = new MyThread(object);

        myThread1.start();
        myThread2.start();

    }

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                System.out.println(Thread.currentThread().getName());
                try {
                    object.notify();
                    object.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
