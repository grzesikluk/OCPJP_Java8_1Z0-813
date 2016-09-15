package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 */
public class Redwood extends Tree {
    public static void doStuff() {
        new Redwood().go();
    }

    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());
    }

    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood) t1;
        Tree t2 = (Tree) r1;
    }

    void go3() {
        Redwood s = (Redwood) new Tree();
//        Redwood k = (Redwood) new AppleTree();
        Tree t = new AppleTree();
    }

}

class Tree {
}

class AppleTree extends Tree {

}