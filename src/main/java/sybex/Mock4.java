package sybex;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Lukasz on 2016-09-21.
 */
public class Mock4 {

    @Test
    public void test1() {
        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Map<Boolean, List<String>> p = s.collect(
                Collectors.partitioningBy(b -> b.startsWith("c")));
        Map<Boolean, List<String>> g = s2.collect(
                Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(p + " " + g);
    }


}
