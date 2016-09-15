package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 */


class Alpha {
    Alpha doStuff(char c) {
        return new Alpha();
    }
}

//covariant return
//javac -source 1.4 Beta.java will cause problems!!

class Beta extends Alpha {
    Beta doStuff(char c) {      // legal override in Java 1.5
        return new Beta();
    }


//n a method with an object reference return type, you can return any object type that can be implicitly cast to the declared return type.
    public Object getObject() {
        int[] nums = {1, 2, 3};
        return nums;  // Return an int array,
        // which is still an object
    }
}