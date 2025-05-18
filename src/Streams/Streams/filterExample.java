package src.Streams.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class filterExample {
    public static void main(String[] args) {
        List<String> names = List.of("Андрей", "Саша", "Юля", "вика");

        List<String> filtred = names.stream()
                .filter(name -> name.startsWith("А"))
                .collect(Collectors.toList());

        System.out.println(filtred);
    }
}
