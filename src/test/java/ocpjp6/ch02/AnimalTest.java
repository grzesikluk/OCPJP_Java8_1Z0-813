package ocpjp6.ch02;

import org.junit.Test;

/**
 * Created by grzesikl on 06/06/2016.
 */
public class AnimalTest {

    @Test
    public void testEat() throws Exception {
        Animal a = new Animal();
        a.eat();

        Horse h  = new Horse();
        h.eat();

//        polymorphysm
        Animal b = new Horse();
        b.eat();

//        overriding
        Animal c = new Horse();
//        c.eat("something"); // compiler sees Animal reference, hence no overloaded

    }
}