package ocpjp8x.ch05;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class SupplierTest {

    @Test
    public void test1() {
        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test2() {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
    }

    @Test
    public void test3(){
        //constructor references
        Supplier<String> newString = String::new;
        System.out.println(newString.get());

        //cannot use Supplier to do this, it doesn't take argumetn
        Function<String, Integer> anotherInteger = Integer::new;
        System.out.println(anotherInteger.apply("100"));
    }

}
