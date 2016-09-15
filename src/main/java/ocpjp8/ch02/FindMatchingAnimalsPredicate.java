package ocpjp8.ch02;

import java.util.function.Predicate;

/**
 * Created by grzesikl on 13/06/2016.
 */
public class FindMatchingAnimalsPredicate {
    private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }

    public static void test() {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
}
