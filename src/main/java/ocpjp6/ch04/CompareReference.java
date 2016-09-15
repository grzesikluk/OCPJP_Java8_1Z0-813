package ocpjp6.ch04;

/**
 * Created by grzesikl on 10/06/2016.
 */
import javax.swing.JButton;
class CompareReference {
    public static void test() {
        JButton a = new JButton("Exit");
        JButton b = new JButton("Exit");
        JButton c = a;
        System.out.println("Is reference a == b? " + (a == b));
        System.out.println("Is reference a == c? " + (a == c));
    }
}