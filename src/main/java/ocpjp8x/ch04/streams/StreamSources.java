package ocpjp8x.ch04.streams;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 22/06/2016.
 */
public class StreamSources {


    @Test
    public void buildStream() {

        IntStream strInt = IntStream.range(1, 5);
        strInt.forEach(i -> System.out.println(i));

        strInt = IntStream.iterate(1, i -> i + 2).limit(10);
        strInt.forEach(i -> System.out.println(i));

        strInt = Arrays.stream(new int[]{1, 3, 6, 9});
        strInt.forEach(i -> System.out.println(i));

        strInt = IntStream.of(4, 5, 6, 7);
        strInt.forEach(i -> System.out.println(i));

        Stream<Object> strInt2 = Stream.builder().add(1).add(2).build(); //note the returned type


    }

    @Test
    public void buildStreamFromFilesOr() throws IOException {

        Files.lines(Paths.get("C:\\UBS\\Dev\\IDEs\\repos\\Workspace\\OCP8_Exam\\src\\main\\resources\\input.txt")).forEach(i-> System.out.println(i));

        Pattern.compile(" ").splitAsStream("java 8 streams").forEach(System.out::println);

        new Random().ints().limit(5).forEach(System.out::println);

        "hello".chars().sequential().forEach(ch-> System.out.printf("%c",ch));

    }


}
