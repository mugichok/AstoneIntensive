package src.Threads.problems;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class liveLockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();


    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while(true){
                if(lock1.tryLock()){
                    System.out.println("Thread 1: Захватил lock1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ignored){
                    }

                    if(!lock2.tryLock()){
                        System.out.println("Thread 1: Не смог захватить lock2, освобождает lock1");
                        lock1.unlock();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ignored){
                        }
                        continue;
                    }

                    System.out.println("Thread1: захватил lock1");
                    lock1.unlock();
                    lock2.unlock();
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored){
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while(true){
                if(lock2.tryLock()){
                    System.out.println("Thread 2: Захватил lock2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ignored){
                    }

                    if(!lock1.tryLock()){
                        System.out.println("Thread 2: Не смог захватить lock1, освобождает lock2");
                        lock2.unlock();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException ignored){
                        }
                        continue;
                    }

                    System.out.println("Thread2: захватил lock2");
                    lock1.unlock();
                    lock2.unlock();
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ignored){
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
