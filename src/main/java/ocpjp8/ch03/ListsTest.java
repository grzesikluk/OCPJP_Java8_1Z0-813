package ocpjp8.ch03;

import org.junit.Test;

import java.util.*;

/**
 * Created by grzesikl on 20/06/2016.
 */
public class ListsTest {

    @Test
    /*
    Common collection method
     */
    public void test1() {
       List<String> list = new ArrayList<>();
       System.out.println(list.add("Sparrow"));   // true
       System.out.println(list.add("Sparrow"));   // true
              Set<String> set = new HashSet<>();
       System.out.println(set.add("Sparrow"));    // true
       System.out.println(set.add("Sparrow"));    // false
    }

    @Test
    /*
    Common collection method
     */
    public void test2() {
        List<String> birds = new ArrayList<>();

        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0
        birds.add("hawk");                   // [hawk]
        birds.add("hawk");                   // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size());    // 2
    }
    @Test
    /*
    Common collection method
     */
    public void test3() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                     // [hawk]
        birds.add("hawk");                     // [hawk, hawk]
        System.out.println(birds.isEmpty());   // false
        System.out.println(birds.size());      // 2
        birds.clear();                         // []
        System.out.println(birds.isEmpty());   // true
        System.out.println(birds.size());      // 0
    }

    @Test
    /*
    Common collection method
     */
    public void test4() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                           // [hawk]
        System.out.println(birds.contains("hawk"));  // true
        System.out.println(birds.contains("robin")); // false
    }

    @Test
    //Lists
    public void test5() {

        List<String> raptiles = new ArrayList<>();
        List<String> birds = new Stack<>();
        List<String> goats = new LinkedList<>();


        raptiles.add("Mouse");
        System.out.println(raptiles);
        raptiles.add(0,"Rat");  //IndexOutOfBoundsException
        System.out.println(raptiles);
        raptiles.set(1,"Small mouse");
        System.out.println(raptiles);


    }

    @Test
    public void test6() {
        List<String> animals = new LinkedList<>();
        animals.add("a");
        animals.add("b");
        animals.add("c");


        for (String s: animals) {
            System.out.println(s);
        }

        Iterator<String> i = animals.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
