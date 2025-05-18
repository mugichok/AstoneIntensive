package src.Threads;

import java.util.concurrent.CompletableFuture;

public class CompleatableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored){
            }
            return "Привет из асинхронной задачи";
        }).thenApply(result -> "Обработанный результат " + result)
                .thenAccept(System.out::println);

        System.out.println("Ждём задачку");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException ignored){
        }
    }
}
