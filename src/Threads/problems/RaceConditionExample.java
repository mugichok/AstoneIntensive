package src.Threads.problems;

public class RaceConditionExample {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Runnable task = () -> {
            for(int i =0; i < 1000; i++){
                counter.incremant();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

class SharedCounter{
    private int count = 0;

    public void incremant(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
