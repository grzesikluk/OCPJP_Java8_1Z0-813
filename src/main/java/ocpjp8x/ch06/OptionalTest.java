package ocpjp8x.ch06;

import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class OptionalTest {
    public static void selectHighestTemperature(Stream<Double> temperatures) {
        System.out.println(temperatures.max(Double::compareTo));
    }

//    The class java.util.Optional is a holder for value that can be null

    @Test
    public void test1() {

        selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
    }

    @Test
    public void test2() {
        selectHighestTemperature(Stream.of());
    }

    @Test
    public void test3() {
        Optional<String> empty = Optional.empty();
        Optional<String> nullStr = Optional.of(null); //not proper, will result in null pointer exc
        Optional<String> nullableStr = Optional.ofNullable(null); //but this is fine? no this is also nullPointerExc

        System.out.println(nullableStr );


    }

    @Test
    public void test4() {
        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim).ifPresent(System.out::println);
    }
    @Test
    public void test5() {
        Optional<String> string = Optional.ofNullable(null);
        System.out.println(string.map(String::length).orElse(-1));


//        Optional<String> string2 = Optional.ofNullable(null);
//        System.out.println(string2.map(String::length).orElseThrow(IllegalArgumentException::new));

    }

    @Test
    public void test6() {
        DoubleStream temperatures = DoubleStream.of(1.3,1.7,1.5);
        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);
    }



}
