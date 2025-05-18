package src.Streams.Streams;

import java.util.Arrays;
import java.util.List;

public class StatefullExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .peek(System.out::println)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
