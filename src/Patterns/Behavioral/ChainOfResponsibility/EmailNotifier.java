package src.Patterns.Behavioral;

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority){
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Пишу на почту: " + message);
    }
}
