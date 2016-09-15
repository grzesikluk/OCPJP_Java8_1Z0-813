package ocpjp8x.ch04.collections;

import org.junit.Test;

import java.util.*;

/**
 * Created by grzesikl on 22/06/2016.
 */
public class CollectionGen {

    @Test
    public void test(){
        List<Integer> intList = new LinkedList<>();
        List<Double> dblList = new LinkedList<>();
        System.out.println("First type: " + intList.getClass());
        System.out.println("Second type:" + dblList.getClass());
    }

    @Test
    public void dequeTest() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The removed element is: " + deque.remove()); // ERROR?
    }

}
