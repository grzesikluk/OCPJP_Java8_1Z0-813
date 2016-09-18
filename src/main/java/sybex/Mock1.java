package sybex;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class Mock1 {

    @Test
    public void test1() {
        Stream<String> stream = Stream.of("12","423","24");

        IntStream is = stream.mapToInt(Integer::parseInt);
        is.forEach(System.out::println);
    }

    @Test
    public void test3() {

        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());
        System.out.println(ZonedDateTime.now());

    }
    @Test
    public void test4() {

    }
}
