package src.Threads;

public class DeadLockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 захватил Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored){
                }

                synchronized (lock2){
                    System.out.println("Thread1 захватил lock2");
                }
            }
        });

        Thread thread2 = new Thread(() ->{
            synchronized (lock2){
                System.out.println("Thread2 захватил lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored){}

                synchronized (lock1){
                    System.out.println("Thread2 захватил lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
