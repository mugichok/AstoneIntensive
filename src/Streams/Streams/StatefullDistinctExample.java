package src.Streams.Streams;

import java.util.Arrays;
import java.util.List;

public class StatefullDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,3,4,5);

        numbers.stream()
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::println);
    }
}
