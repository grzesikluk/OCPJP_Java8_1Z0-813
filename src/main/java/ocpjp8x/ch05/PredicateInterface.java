package ocpjp8x.ch05;

import org.junit.Test;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 22/06/2016.
 */
public class PredicateInterface {

    @Test
    public void testPredicate() {
        Stream.of("hello", "world")
                .filter(str -> str.startsWith("h"))
                .forEach(System.out::println);
    }

    @Test
    public void testOwnPredicate() {
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));

        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));
    }

//    @Test



}
