package ocpjp6.ch01.pack1;
/**
 * Created by grzesikl on 02/06/2016.
 */
class ch03_ex4 {


    public void testSamePackage() {
        ch03_ex4_other a = new ch03_ex4_other();
        a.methodDefaultAccess();
        a.methodProtectedAccess();

    }

    public void testDifferentPackage() {
        ocpjp6.ch01.pack2.ch03_ex4 a = new ocpjp6.ch01.pack2.ch03_ex4();
//        a.methodDefaultAccess();
//        a.methodProtectedAccess();

    }

}

class ch03_ex4_exten extends ocpjp6.ch01.pack2.ch03_ex4 {


    public void testDifferentPackage() {
        ocpjp6.ch01.pack2.ch03_ex4 a = new ocpjp6.ch01.pack2.ch03_ex4();
//        a.methodDefaultAccess();
//        a.methodProtectedAccess();

    }


    public void testInheritance() {

//        methodDefaultAccess();
        methodProtectedAccess();

    }

}
