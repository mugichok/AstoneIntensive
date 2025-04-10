package src.Patterns.Behavioral;

public class Main {
    public static void main(String[] args) {
        Notifier notifier1 = new LogNotifier(Priority.ROUTINE);
        Notifier notifier2 = new EmailNotifier(Priority.WARNING);
        Notifier notifier3 = new SMSNotifier(Priority.ASAP);

        notifier1.setNextNotifier(notifier2);
        notifier2.setNextNotifier(notifier3);

        notifier1.manageMessage(Priority.ROUTINE,"Всё хорошо");
        notifier1.manageMessage(Priority.WARNING,"Всё так себе");

        notifier1.manageMessage(Priority.ASAP,"Всё плохо");

    }



}
