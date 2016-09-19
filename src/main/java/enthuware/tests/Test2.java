package enthuware.tests;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class Test2 {
    @Test
    public void test1() {

        Runnable r = () -> System.out.println("In Runnable");
        Callable<Integer> c = () -> {
            System.out.println("In Callable");
            return 0;
        };
        ExecutorService es = Executors.newCachedThreadPool();

        //INSERT CODE HERE

        es.shutdown();

    }

    @Test
    public void test2() {
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s->s.append("helloworld"));
        messages.forEach(s->{
            s.insert(5,",");
            System.out.println(s);
        });


    }

}
