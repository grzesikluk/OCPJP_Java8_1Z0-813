package ocpjp8x.ch06;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 25/07/2016.
 */
public class SaveResultsTest {


    @Test
    public void test1() {
        String frenchCounting = "un:deux:trois:quatre";
        List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }

    @Test
    public void test2() {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);
    }


    @Test
    public void test3() {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }

    @Test
    public void test4() {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set words = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
        words.forEach(System.out::println);
    }

    @Test
    public void test5() {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();
        Map<Integer, List<String>> wordGroups =
                distinctWords.collect(Collectors.groupingBy(String::length));
        wordGroups.forEach(
                (count, words) -> {
                    System.out.printf("word(s) of length %d %n", count);
                    words.forEach(System.out::println);
                });
    }

    @Test
    public void test6() {
        String[] string = "you never know what you have until you clean your room aby daby baby".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();
        Function<String,Character> getFirstChar = (String s) -> s.charAt(0);


        Map<Character, List<String>> wordGroups =
                distinctWords.collect(Collectors.groupingBy(getFirstChar));


//
//
//        wordGroups.forEach(
//                (count, words) -> {
//                    System.out.printf("word(s) of length %c %n", count);
//                    words.forEach(System.out::println);
//                });


        wordGroups.keySet().stream().sorted().forEach(
                (ch) -> {
                    System.out.printf("words of %c \n", ch);
                    wordGroups.get(ch).forEach(System.out::println);
                }
        );
    }

}
