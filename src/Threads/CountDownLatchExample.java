package src.Threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch latch = new CountDownLatch(3);

        Runnable worker = () -> {
            try {
                Thread.sleep((long) (Math.random() * 2000));
                System.out.println(Thread.currentThread().getName() + "завершил работу");
            } catch (InterruptedException e){
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        };

        for (int i = 0; i < 3; i++){
            new Thread(worker).start();
        }

        latch.await();
        System.out.println("Все потоки завершены, продолжаем выполнение");
    }
}
