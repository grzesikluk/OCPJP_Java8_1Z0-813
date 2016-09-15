package ocpjp8x.ch06;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Created by grzesikl on 25/07/2016.
 */
public class StreamDataMethodsTest {
    private static String[] string = "you never know what you have until you clean your room".split(" ");

    @Test
    public void test1() {

        System.out.println(Arrays.stream(string).min(String::compareTo).get());
    }

    @Test
    public void test2() {
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();


        System.out.println(Arrays.stream(string).min(lengthCompare).get());
    }


//    ImportantData and Calculation Methods in IntStream Interface
//    int sum()
//    Returns the sum of elements in the stream; 0 in case the stream is empty.
//    long count()
//    Returns the number of elements in the stream; 0 if the stream is empty.
//    OptionalDouble average()
//    Returns the average value of the elements in the stream; an empty OptionalDouble value in case the stream is empty.
//    OptionalInt min()
//    Returns the minimum integer value in the stream; an empty OptionalInt value in case the stream is empty.
//    OptionalInt max()
//    Returns the maximum integer value in the stream; an empty OptionalInt value in case the stream is empty.
//    IntSummaryStatistics summaryStatistics()
//    Returns an IntSummaryStatistics object that has sum, count, average, min, and max values.


    @Test
    public void test3() {
        String limerick = "There was a young lady named Bright " +
                "who traveled much faster than light " +
                "She set out one day " +
                "in a relative way " +
                "and came back the previous night ";

        IntSummaryStatistics wordStatistics =
                Pattern.compile(" ")
                        .splitAsStream(limerick)
                        .mapToInt(word -> word.length())
                        .summaryStatistics();

        System.out.printf(" Number of words = %d \n Sum of the length of the words = %d \n" +
                        " Minimum word size = %d \n Maximum word size %d \n " +
                        " Average word size = %f \n", wordStatistics.getCount(),
                wordStatistics.getSum(), wordStatistics.getMin(),
                wordStatistics.getMax(), wordStatistics.getAverage());
    }

    @Test
    public void test4() {
        System.out.println(IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val)));

        System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
    }

}
