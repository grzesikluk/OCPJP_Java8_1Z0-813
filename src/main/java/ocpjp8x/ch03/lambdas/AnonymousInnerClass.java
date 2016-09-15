package ocpjp8x.ch03.lambdas;

import org.junit.Test;

/**
 * Created by grzesikl on 22/06/2016.
 */
interface Function {
    void call();
}

public class AnonymousInnerClass {
    @Test
    public void test() {
        Function function = new Function() {
            public void call() {
                System.out.println("Hello world");
            }
        };
        function.call();
    }
}
