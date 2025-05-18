package src.Streams.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = List.of("Анна", "Иван", "Мария", "Ираклий");

        Map<Character, List<String>> inuqueNames = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(inuqueNames);
    }
}

