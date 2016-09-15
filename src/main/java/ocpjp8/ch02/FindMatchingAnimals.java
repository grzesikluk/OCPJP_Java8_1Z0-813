package ocpjp8.ch02;

/**
 * Created by grzesikl on 13/06/2016.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }

    private static void print2(Animal animal, CheckThings trait) {
       System.out.println(trait.test(animal));
    }

    private static void print3(Animal animal1, Animal animal2, CheckThingsDouble trait) {
        System.out.println(trait.test(animal1,animal2));
    }


    public static void test() {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        print2(new Animal("something else",false,true), a ->a.toString());
        print3(new Animal("Racoon",false,false),new Animal("Cat",true,true), (a,b)-> { return a.toString()+b.toString();});
    }
}
