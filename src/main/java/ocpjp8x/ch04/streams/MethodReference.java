package ocpjp8x.ch04.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void printUpperCaseString(String string) {
        System.out.println(string.toUpperCase());
    }

    public void otherUpperCaseString(String s) {
        System.out.println(s.toUpperCase());
    }

    @Test
    public  void test() {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");

        strings.forEach(MethodReference::printUpperCaseString);
    }
}
