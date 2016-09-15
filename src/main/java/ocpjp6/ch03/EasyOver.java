package ocpjp6.ch03;

import org.junit.Test;

/**
 * Created by grzesikl on 09/06/2016.
 */
class EasyOver {
    static void go(int x) { System.out.print("int "); }
    static void go(long x) { System.out.print("long "); }
    static void go(double x) { System.out.print("double "); }

    public static void test() {
        byte b = 5;
        short s = 5;
        long l = 5;
        float f = 5.0f;

        go(b);
        go(s);
        go(l);
        go(f);
    }
}

class AddBoxing {
    static void go(Integer x) { System.out.println("Integer"); }
    static void go(long x) { System.out.println("long"); }


//    compiler will choose widening over boxing
    public static void test() {
        int i = 5;
        go(i);           // which go() will be invoked?
    }
}

class AddVarargs {
    static void go(int x, int y) { System.out.println("int,int");}
    static void go(byte... x) { System.out.println("byte... "); }

    @Test
    public static void test() {
        byte b = 5;
        go(b,b);         // which go() will be invoked?
    }
}