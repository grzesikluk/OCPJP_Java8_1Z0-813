package ocpjp8x.ch05;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 19/07/2016.
 */


public class ConsumerTest {
    Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
    @Test
    public void test2() {
        Stream.of("hello", "world")
                .forEach(System.out::println);
    }
    @Test
    public void test1() {

        printUpperCase.accept("hello");
    }

    @Test
    public void test3() {
        Stream.of("hello", "world")
                .forEach(printUpperCase);
    }


}
