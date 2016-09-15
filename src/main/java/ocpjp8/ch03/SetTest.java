package ocpjp8.ch03;

import org.junit.Test;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by grzesikl on 21/06/2016.
 */
public class SetTest {

    @Test
    public void test1() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);                                   // true
        boolean b2 = set.add(10);                                   // true
        boolean b3 = set.add(66);                                   // false
        boolean b4 = set.add(8);                                    // true
        for (Integer integer : set) System.out.print(integer + ","); // 66,8,10,

        //Tree set sorts.
        set = new TreeSet<>();
        b1 = set.add(66);                                    // true
        b2 = set.add(10);                                    // true
        b3 = set.add(66);                                    // false
        b4 = set.add(8);                                     // true
        for (Integer integer : set) System.out.print(integer + ",");  // 8,10,66
    }

    @Test
    public void test2() {
        NavigableSet<String> set2 = new TreeSet<>();
        set2.add("e");
        set2.add("ab");
        set2.add("ba");
        set2.add("c");
        set2.add("a");

        for (String s : set2) System.out.print(s + ",");
        System.out.println("\n");
        System.out.println(set2.lower("c"));     // 9
        System.out.println(set2.floor("c"));     // 10
        System.out.println(set2.ceiling("d"));   // 20
        System.out.println(set2.higher("d"));    // null

    }

}
