package enthuware.tests;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Lukasz on 2016-09-16.
 */
public class Test1 {

    @Test
    public void tes1() {
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }
}
