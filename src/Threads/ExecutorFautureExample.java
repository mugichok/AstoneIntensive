package src.Threads;

import java.util.concurrent.*;

public class ExecutorFautureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Задача выполнена";
        };

        Future<String> future = executor.submit(task);

        try {
            System.out.println("Ожидание результата...");
            String result = future.get();
            System.out.println("Результат: " + result);
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
