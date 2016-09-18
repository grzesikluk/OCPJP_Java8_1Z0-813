package sybex;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Lukasz on 2016-09-18.
 */
public class SaladBarTracker {

    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(4, () -> System.out.println("Salad bar empty"));
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 120; i++) {
            es.submit(() -> await(cb));
        }

        es.shutdown();

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
