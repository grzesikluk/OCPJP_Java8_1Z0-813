package sybex;

import org.junit.Test;

import java.time.Duration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Lukasz on 2016-09-20.
 */
public class ResourceBundleTest {

    @Test
    public void test1() {

        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
        b.getString("name");
        b.getString("age");

    }
    @Test
    public void test2(){
        Duration d = Duration.ofMillis(1100);
        System.out.println(d);
        d = Duration.ofSeconds(61);
        System.out.println(d);
    }
}
