package ocpjp8.ch03;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by grzesikl on 21/06/2016.
 */
public class QueueTest {
    @Test
    public void test1(){
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

    @Test
    public void test2() {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek());     // 4
        System.out.println(stack.poll());     // 4
        System.out.println(stack.poll());     // 10
        System.out.println(stack.peek());     // null
    }
}
