package ocpjp6.ch02;

import org.junit.Test;

/**
 * Created by grzesikl on 06/06/2016.
 */
public class SomeFrogTest {

    @Test
    public void testDoStuff() throws Exception {
        SomeFrog a = new SomeFrog();
        a.doStuff();
        SomeFrog.doStuff();
    }
}