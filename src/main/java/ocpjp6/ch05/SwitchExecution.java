package ocpjp6.ch05;

/**
 * Created by grzesikl on 10/06/2016.
 */
public class SwitchExecution {
    public static void test() {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }
    }

    //    A case constant must evaluate to the same type as the switch expression can use, with one additional—and big—constraint:
//    the case constant must be a compile time constant! Since the case argument has to be resolved at compile time, that means
//    you can use only a constant or final variable that is assigned a literal value. It is not enough to be final, it must be
//    a compile time constant. For example:
    public static void test2() {
        final int a = 1;
        final int b;
        b = 2;
        int x = 0;
        switch (x) {
            case a:     // ok
//            case b:     // compiler error

        }
    }

    public static void test3() {
        String s = "xyz";
        switch (s.length()) {
            case 1:
                System.out.println("length is one");
                break;
            case 2:
                System.out.println("length is two");
                break;
            case 3:
                System.out.println("length is three");
                break;
            default:
                System.out.println("no match");
        }
    }

    public static void test4(){
        byte g = 2;
        switch(g) {
            case 23:
//            case 128:
        }

    }

    //o illegal to have more than one case label using the same value
    public static void test5(){
        int temp = 90;
        switch(temp) {
            case 80 :  System.out.println("80");
//            case 80 :  System.out.println("80");   // won't compile!
            case 90 :  System.out.println("90");
            default :  System.out.println("default");
        }
    }
}
