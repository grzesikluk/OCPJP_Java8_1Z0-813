package sybex;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Lukasz on 2016-09-20.
 */
public class ResourceBundleTest {

    @Test
    public void test1() {
        Locale us = new Locale("en", "US");
        Locale fr = new Locale("fr", "FR");
        Locale pl = new Locale("pl", "PL");
        Locale it = new Locale("it", "IT");

        ResourceBundle b = ResourceBundle.getBundle("Dolphins", it);

        System.out.println(b.getString("name"));
        System.out.println(b.getString("age"));
        System.out.println(b.getString("greetings"));

    }




}
