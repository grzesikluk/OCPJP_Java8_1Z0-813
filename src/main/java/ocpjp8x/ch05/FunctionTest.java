package ocpjp8x.ch05;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class FunctionTest {

    @Test
    public void test1() {
        Arrays.stream("4, -9, 16".split(", "))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);
    }
    @Test
    public void test2() {
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("supercalifragilisticexpialidocious"));
    }

    @Test
    public void test3() {
        Function<Integer,Integer> increaseInt = i -> ++i;

        Arrays.stream("4, -9, 16".split(", "))
                .map(Integer::parseInt)
                .map(increaseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);
    }

//    What is the difference between andThen() and compose() methods in Function interface? The andThen() method applies
//    the passed argument after calling the current Function (as in this example). The compose() method calls the argument
//    before calling the current Function

    @Test
    public void combineFunctions() {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> absInt = Math::abs;
        Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);

        Arrays.stream("4, -9, 16".split(", "))
                .map(parseAndAbsInt)
                .forEach(System.out::println);
    }

}
