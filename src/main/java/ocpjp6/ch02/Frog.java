package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 */
class Frog {
    static int frogCount = 0;  // Declare and initialize
    // static variable
    String frogColor;


    public Frog() {
        frogCount += 1;  // Modify the value in the constructor
    }

    public static void doStuff() {
        new Frog();
        new Frog();
        new Frog();
        System.out.println("Frog count is now " + frogCount);

//        frogColor = "bronze"; cannot be referenced from static context
    }

    public void increaseStatic() {
        frogCount++;
    }


}

class SomeFrog extends Frog {

//    public void doStuff() { //static method cannot be overrided
//    }
}
