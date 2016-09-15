package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 */

class A {
}

class B extends A {
}

public class Test15 {
    static String s = "-";

    public void testIt() {
        A[] aa = new A[2];
        B[] ba = new B[2];
        sifter(aa);
        sifter(ba);
        sifter(7);
        System.out.println(s);
    }

//    In general, overloaded var-args methods are chosen last. Remember that arrays are objects.
//            Finally, an int can be boxed to an Integer and then “widened” to an Object

    static void sifter(A[]... a2) {
        s += "1";
    }

    static void sifter(B[]... b1) {
        s += "2";
    }

    static void sifter(B[] b1) {
        s += "3";
    }

    static void sifter(Object o) {
        s += "4";
    }
}