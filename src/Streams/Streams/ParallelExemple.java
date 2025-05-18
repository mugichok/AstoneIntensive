package src.Streams.Streams;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class ParallelExemple {
    public static void main(String[] args) {
        int n = 500_000;

        BigInteger factorial = LongStream.rangeClosed(1, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Факториал " + n + "=" + factorial);
    }
}
