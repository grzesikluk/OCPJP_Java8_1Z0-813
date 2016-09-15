package ocpjp8x.ch06;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by grzesikl on 25/07/2016.
 */
public class FlatMapTest {
    String []string= "you never know what you have until you clean your room".split(" ");

    @Test
    public void test1() {

        Arrays.stream(string)
                .map(word -> word.split(""))
                .distinct()
                .forEach(System.out::print);
    }


    @Test
    public void test2() {

        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::print);
    }

    @Test
    public void test3() {
        List<List<Integer>> intsOfInts = Arrays.asList(
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 4));

//        How do we process the elements within the List<Integer>? For that, one way is to call stream() method on each
// of its elements. To convert those streams into Integer elements, we call the flatMap() method.

        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);
    }

}
