package ocpjp6.ch04;

/**
 * Created by grzesikl on 10/06/2016.
 */
class Cat { }
class Dog {
    public static void main(String [] args) {
        Dog d = new Dog();
//        System.out.println(d instanceof Cat);  You can’t use the instanceof operator to test across two different class hierarchies

        int [] nums = new int[3];
        if (nums instanceof Object) { } // result is true

    }
}
