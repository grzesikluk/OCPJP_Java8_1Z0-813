package ocpjp8x.ch06;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by grzesikl on 25/07/2016.
 */
public class SortCollectionTest {
    List words =
            Arrays.asList("follow your heart but take your brain with you".split(" "));
    @Test
    public void test1() {

        words.stream().distinct().sorted().forEach(System.out::println);
    }

    @Test
    public void test2() {

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();

        words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);
    }

    @Test
    public void test3() {

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        words.stream()
                .distinct()
                .sorted(lengthCompare.thenComparing(String::compareTo))
                .forEach(System.out::println);
    }


    @Test
    public void test4() {

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        words.stream()
                .distinct()
                .sorted(lengthCompare.thenComparing(String::compareTo).reversed())
                .forEach(System.out::println);
    }
}
