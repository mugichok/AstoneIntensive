package Patterns.behavioral.ChainOfResponsibility;

public class LogNotifier extends Notifier{

    public LogNotifier(int priority){
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Пишу в логи: " + message);
    }
}
