package itmo.java.basics.lesson12;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
        MyThread myThread = new MyThread();

//        myRunnable.start();
//        myRunnable.run();

//        try {
//            myRunnable.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        myThread.start();


//        myThread.interrupt();

//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();

//        myThread.setDaemon(true);


//        ThreadPoolExecutor


//        ExecutorService service = Executors.newFixedThreadPool(100);
//        ForkJoinPool pool = new ForkJoinPool();

//        CountDownLatch countDownLatch = new CountDownLatch(100);
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }



    }
}
