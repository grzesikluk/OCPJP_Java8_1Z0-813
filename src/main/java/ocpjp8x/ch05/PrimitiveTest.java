package ocpjp8x.ch05;

import org.junit.Test;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.ObjLongConsumer;
import java.util.stream.IntStream;

/**
 * Created by grzesikl on 19/07/2016.
 */
public class PrimitiveTest {

    @Test
    public void testIntPredicate() {
        IntStream.range(1, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);
    }

    @Test
    public void testIntPredicate2() {
        IntPredicate myPred = i -> (i%3) ==0;
        IntStream.range(1,10).filter(myPred).forEach(System.out::println);
    }

    @Test
    public void testIntToDoubleFunction() {
        IntToDoubleFunction intToDouble = i -> (double)i;

        BooleanSupplier bSup = () -> true;

        ObjLongConsumer<String> objLongCons = (String k, long i) -> { System.out.printf(k + new Long(i).toString());};

    }

}
