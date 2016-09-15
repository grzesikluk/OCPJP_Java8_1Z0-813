package ocpjp8x.ch04.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {
    @Test
    public void test() {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");

        //normal lambda usage
        strings.forEach(string -> System.out.println(string));

        //using method reference
        strings.forEach(System.out::println);
    }
}