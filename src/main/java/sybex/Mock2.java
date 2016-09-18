package sybex;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Lukasz on 2016-09-18.
 */
public class Mock2 {

    private static void magic(Stream<Integer> s) {
        Optional o = s.filter( x-> x<5).max((x,y)->x-y);
        System.out.println(o.get());

    }

    @Test
    public void test1() {
        magic(Stream.empty());

    }
    @Test
    public void test2() {
        magic(Stream.iterate(1,x->x+1));
    }
    @Test
    public void test3() {
        magic(Stream.of(5,10));
    }

    @Test
    public void test4() {
        class A implements Comparable<A> {

            public int compareTo(A o) {
                return 0;
            }
        }
    }

    @Test
    public void test5() throws IOException {


        Path path = Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\zoo\\log\\filek").getParent();

        Files.walk(path,5, FileVisitOption.FOLLOW_LINKS).
                filter(p -> p.resolve(p).getFileName().toString().endsWith(".txt")).
//                filter(p -> p.getNameCount(0)>4).       doesn't compile
                forEach(System.out::println);
    }


}
