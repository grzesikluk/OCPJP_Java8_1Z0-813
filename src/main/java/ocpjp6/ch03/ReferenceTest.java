package ocpjp6.ch03;

/**
 * Created by grzesikl on 09/06/2016.
 */


//When you pass an object variable into a method, you must keep in mind that you’re passing the object reference, and
// not the actual object itself. Remember that a reference variable holds bits that represent (to the underlying VM) a
// way to get to a specific object in memory (on the heap). More importantly, you must remember that you aren’t even
// passing the actual reference variable, but rather a copy of the reference variable. A copy of a variable means you
// get a copy of the bits in that variable, so when you pass a reference variable, you’re passing a copy of the bits
// representing how to get to a specific object. In other words, both the caller and the called method will now have
// identical copies of the reference, and thus both will refer to the same exact (not a copy) object on the heap
import java.awt.*;

class ReferenceTest {
    public static void test() {
        Dimension d = new Dimension(5, 10);
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before modify() d.height = "
                + d.height);
        rt.modify(d);
        System.out.println("After modify() d.height = "
                + d.height);

        System.out.println("Before modifyRef() d.height = "
                + d.height);
        rt.modifyRef(d);
        System.out.println("After modifyRef() d.height = "
                + d.height);



//        primitives
        int k = 1;
        System.out.println("Before modify k = " + k);
        rt.modify(k);
        System.out.println("After modify k = " + k);

    }

    // changing the object with copy of the reference
    void modify(Dimension dim) {
        dim.height = dim.height + 1;
        System.out.println("dim = " + dim.height);
    }

    void modify(int k) {
        k++;
    }

    // this will not change the object passed to this function!
    void modifyRef(Dimension dim) {
        dim = new Dimension(5,12);
        System.out.println("dim = " + dim.height);
    }

}

//Things become more interesting when the shadowed variable is an object reference, rather than a primitive:
class Bar {
    int barNum = 28;
}
class Foo {
    Bar myBar = new Bar();
    void changeIt(Bar myBar) {
        myBar.barNum = 99;
        System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
        myBar = new Bar();
        myBar.barNum = 420;
        System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
    }
    public static void test () {
        Foo f = new Foo();
        System.out.println("f.myBar.barNum is " + f.myBar.barNum);
        f.changeIt(f.myBar);
        System.out.println("f.myBar.barNum after changeIt is "
                + f.myBar.barNum);
    }
}

