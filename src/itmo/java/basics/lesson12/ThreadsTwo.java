package itmo.java.basics.lesson12;

public class ThreadsTwo extends Thread {
    private final Object lock;
    public ThreadsTwo(Object lock){
        this.lock = lock;
    }
    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("Thread  " + Thread.currentThread().getName());
                synchronized (lock) {
                    lock.notify();
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Object object = new Object();

        ThreadsTwo threadsTwo1 = new ThreadsTwo(object);
        ThreadsTwo threadsTwo2 = new ThreadsTwo(object);

        threadsTwo1.start();
        threadsTwo2.start();
    }

}

