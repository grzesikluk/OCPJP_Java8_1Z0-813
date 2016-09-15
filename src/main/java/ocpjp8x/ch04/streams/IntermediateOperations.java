package ocpjp8x.ch04.streams;

import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 22/06/2016.
 */
public class IntermediateOperations {

    @Test
    public void intermediateOperations() {
        Stream.of(1, 2, 3, 4, 5).count(); //5
        Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();//5
//        Stream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.printf("[%d] ", i)).count();//

        //intermediate operations return streams.
        Stream.of(1, 2, 3, 4, 5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
    }

    @Test
    public void fiterTest() {
        IntStream.rangeClosed(0, 20).filter(x -> x % 3 == 0).forEach(System.out::println);


    }

    @Test
    public void evenSquaresTest() {
        IntStream.rangeClosed(0, 10)
                .map(i -> i * i)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }

    static class Consonants {
        private static boolean removeVowels(int c) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    return true;
            }
            return false;
        }
    }

    @Test
    public void filterCharsTest() {
        "avada kedavra".chars()
                .filter(Consonants::removeVowels)
                .forEach(ch -> System.out.printf("%c", ch));
    }


}
