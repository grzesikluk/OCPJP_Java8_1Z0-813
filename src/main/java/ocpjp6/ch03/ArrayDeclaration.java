package ocpjp6.ch03;

/**
 * Created by grzesikl on 09/06/2016.
 */
public class ArrayDeclaration {

    public static void test(){
        //primitive arrays
        int[] key1;
        int key2[];

        // ref arrays
        String [][][] threeDimString;
        String [][] otherThreeDimString[];

//        int[5] key3; not legal

        int[] testScores;        // Declares the array of ints
        testScores = new int[4]; // constructs an array and assigns it
        // to the testScores variable

        Thread[] threads = new Thread[5]; //one object on heap, one local reference to this object. No Threads objects yet.
//        Remember, arrays must always be given a size at the time they are constructed.
//        int[] carList = new int[]; // Will not compile; needs a size

//        You may see the words “construct”, “create”, and “instantiate” used interchangeably. They all mean, “An object is built on the heap.”

        //multi dim array
        int[][] myArray = new int[3][];

        int x = 9;
        int[] dots = {6,x,8};
        int[][] scores = {{5,2,4,7}, {9,2}, {3,4}};


//        Remember that you do not specify a size when using anonymous array creation syntax. The size is derived from
//   the number of items (comma-separated) between the curly braces. Pay very close attention to the array syntax used
//   in exam questions (and there will be a lot of them). You might see syntax such as

//        new Object[3] {null, new Object(), new Object()};         // not legal;size must not be specified

        takesAnArray(new int[] {7,7,8,2,5}); // we need an array
    }

    static void takesAnArray(int []  someArray) {
        // use the array parameter
    }

    interface Speedy {

    }

    class Honda extends Car implements Speedy {

    }

    class Beer {

    }

//    assigning array references/types
    static  void test2() {
        int[] splats;
        int[] dats = new int[4];
        char[] letters = new char[5];
        splats = dats; // OK, dats refers to an int array
//        splats = letters; // NOT OK, letters refers to a char array

        Car[] cars;
        Honda[] cuteCars = new Honda[5];
        cars = cuteCars; // OK because Honda is a type of Car
        Beer[] beers = new Beer [99];
//        cars = beers; // NOT OK, Beer is not a type of Car

        Speedy[] speedies;
        speedies = cuteCars; //that is fine also


    }




}
