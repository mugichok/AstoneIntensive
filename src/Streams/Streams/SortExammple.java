package src.Streams.Streams;

import java.util.List;

public class SortExammple {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5,2,9,1,7);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
