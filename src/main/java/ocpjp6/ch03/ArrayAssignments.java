package ocpjp6.ch03;

/**
 * Created by grzesikl on 09/06/2016.
 */
public class ArrayAssignments {

    public static void test() {
        int[] weightList = new int[5];
        byte b = 4;
        char c = 'c';
        short s = 7;
        weightList[0] = b;  // OK, byte is smaller than int
        weightList[1] = c;  // OK, char is smaller than int
        weightList[2] = s;  // OK, short is smaller than int
    }

    public static void test2() {
        Car [] myCars = {new Subaru(), new Car(), new Ferrari()};
    }

}

class Car {}
class Subaru extends Car {}
class Ferrari extends Car {}
