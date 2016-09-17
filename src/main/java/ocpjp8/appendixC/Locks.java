package ocpjp8.appendixC;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class Locks {
    @Test
    public void test1() {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);

            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            if (service != null) service.shutdown();
        }
    }

    @Test
    public void test2() {
        int birdCount=0;
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            lock.lock();
            ++birdCount;
        } finally {
            lock.unlock();
        }

        new Thread(() -> {
            if(lock.tryLock()) {
                try {
                    System.out.println("Acquired");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Unavailable");
            }
        }).start();
    }
}



class SheepManager {

    private int sheepCount = 0;
    private Lock lock = new ReentrantLock();

    public void incrementAndReport() {
        try {
            lock.lock();
            System.out.print(" " + (++sheepCount));
        } finally {
            lock.unlock();
        }
    }

    }