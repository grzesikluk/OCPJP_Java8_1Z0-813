package ocpjp6.ch04;

/**
 * Created by grzesikl on 10/06/2016.
 */
class InstanceTest {
    public static void test() {
        String a = null;
        boolean b = null instanceof String;
        boolean c = a instanceof String;
        System.out.println(b + " " + c);
    }
}
