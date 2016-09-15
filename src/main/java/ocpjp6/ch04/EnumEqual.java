package ocpjp6.ch04;

/**
 * Created by grzesikl on 10/06/2016.
 */
class EnumEqual {
    enum Color {RED, BLUE}                   // ; is optional
    public static void test() {
        Color c1 = Color.RED;  Color c2 = Color.RED;
        if(c1 == c2) { System.out.println("=="); }
        if(c1.equals(c2)) { System.out.println("dot equals"); }
    } }
