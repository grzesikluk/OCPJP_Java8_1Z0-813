package ocpjp8x.ch06;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class SearchDataTest {


//    The “match” and “find” methods for searching elements are “short-circuiting” in nature.


    @Test
    public void test1() {
        // Average temperatures in Concordia, Antarctica in a week in October 2015

        boolean anyMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);

        boolean allMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp < 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);
    }


    @Test
    public void test2() {
        //  Returns true if the stream is empty without evaluating the predicate!
        boolean allMatch
                = IntStream.of().allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);
    }

    @Test
    public void test3() {
        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
                .sorted()
                .findFirst()
                ;

        System.out.println("Result: " + methodName.orElse("No suitable method found"));
    }


//    Why does the java.util.function package have both findFirst() and findAny() methods? In parallel streams, findAny()
//    is faster to use than findFirst()

    @Test
    public void test4() {
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();
        System.out.println("First matching temperature > 0 is " + temperature.getAsDouble());

//        In this stream of double values, the filter() method filters the elements, 10.1 and -5.4 because the condition
//        temp > 0 is false. For the element 6.0, the filter() method evaluates the condition to true and findFirst()
//        returns that element. Notice that the remaining elements get ignored in this stream pipeline: the elements 8.9
//        and 2.2 also satisfy the condition temp > 0, but the stream pipeline is closed as the findFirst() method already
//        returned the value 6.0

    }
}
