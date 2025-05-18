package src.Streams.Streams;

import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,3,3,4);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
