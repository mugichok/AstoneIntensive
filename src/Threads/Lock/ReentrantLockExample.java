package src.Threads.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private static int count = 0;
    private static final ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) throws InterruptedException {
        Runnable acton = ReentrantLockExample::incrementWithLock;
        Thread thread1 = new Thread(acton);
        Thread thread2 = new Thread(acton);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final count (ReentrrantLock): " + count);
    }

    private static void incrementWithLock(){
        for(int i = 0; i< 1000; i++){
            lock.lock();
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }
    }
}
