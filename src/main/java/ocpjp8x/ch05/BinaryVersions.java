package ocpjp8x.ch05;

import org.junit.Test;

import java.util.function.BiFunction;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class BinaryVersions {

    @Test
    public void test1() {
        BiFunction<Integer,Integer,String> addAndToString = (Integer i, Integer k) -> { return new Integer(i+k).toString();};

        System.out.printf(addAndToString.apply(3,4));
    }

}
