package ocpjp6.ch04;

/**
 * Created by grzesikl on 10/06/2016.
 */
class A { }
class B extends A {
    public static void test () {
        A myA = new B();
        m2(myA);
    }
    public static void m2(A a) {
        if (a instanceof B)
            ((B)a).doBstuff();     // downcasting an A reference
        // to a B reference
    }
    public static void doBstuff() {
        System.out.println("'a' refers to a B");
    }
}
