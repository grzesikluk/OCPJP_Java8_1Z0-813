package ocpjp8x.ch05;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class UnaryOperatorTest {
    @Test
    public void test1() {
        List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
        System.out.println("Before: " + ell);
        ell.replaceAll(Math::abs);
        System.out.println("After: " + ell);
    }
}
