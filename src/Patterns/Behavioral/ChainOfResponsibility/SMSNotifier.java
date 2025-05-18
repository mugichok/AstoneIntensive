package src.Patterns.Behavioral.ChainOfResponsibility;

public class SMSNotifier extends Notifier{

    public SMSNotifier(int priority){
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Пишу в сообщения: " + message);
    }
}
