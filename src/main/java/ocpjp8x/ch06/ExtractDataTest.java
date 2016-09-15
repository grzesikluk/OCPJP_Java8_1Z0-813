package ocpjp8x.ch06;

import org.junit.Test;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class ExtractDataTest {
    @Test
    public void test1() {
        long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();
        System.out.printf("The stream has %d elements", count);
    }

    @Test
    public void test2() {
        long count = Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
        System.out.printf("%nThe stream has %d elements", count);
    }

    @Test
    public void test3() {
        long count = Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
        System.out.printf("%nThe stream has %d elements", count);
    }

    @Test
    public void test4() {
        DoubleStream.of(1.0, 4.0, 9.0)
                .map(Math::sqrt)
                .peek(System.out::println)
                .sum();
    }
}
