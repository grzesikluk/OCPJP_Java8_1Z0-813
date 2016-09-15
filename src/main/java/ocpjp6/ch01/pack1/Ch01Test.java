package ocpjp6.ch01.pack1;

import org.junit.Test;

/**
 * Created by grzesikl on 02/06/2016.
 */
public class Ch01Test {

    @Test
    public void example1() {
        String a = "my string";
        changeIt(a);
        System.out.println(a);
    }

    private static void changeIt( String k) {
        k = "some other string";
    }


}
