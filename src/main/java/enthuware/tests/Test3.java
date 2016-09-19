package enthuware.tests;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Created by Lukasz on 2016-09-19.
 */
public class Test3 {

    @Test
    public void test1() {
        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter( e->{
            ai.incrementAndGet();
            System.out.println(ai);
            System.out.println(e);
            return e.contains("o");
        }).allMatch(x->x.indexOf("o")>0);

        System.out.println("AI = "+ai);
    }
}
