package sybex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Lukasz on 2016-09-18.
 *
 * This shows that when multi thread service used it can be deadlocked. For single threaded one it is not possible.
 */
public class Mock3 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        List<Future<?>> futureResults = new ArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(5);//change to single thread to have safe impl


        for (int i = 0; i < 1000; i++) {
            futureResults.add(es.submit(() -> {
                synchronized (o1) {
                    synchronized (o2) {
                        System.out.println("Hound");
                    }
                }
            }));
            futureResults.add(es.submit(() -> {
                synchronized (o2) {
                    synchronized (o1) {
                        System.out.println("Pound");
                    }
                }
            }));
        }

//        futureResults.stream().forEach(s -> {
//            try {
//                System.out.println(s.get().toString());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        });


        es.shutdown();
    }



}
