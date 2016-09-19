package sybex;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lukasz on 2016-09-18.
 */
public class MapMergeTests {

    @Test
    public void test1() {

        Map<String,String> map = new HashMap<>();

        map.put("first","1");
        map.put("second","2");
        map.put("third",null);


        map.merge("second","dwa",(a,b)-> a.concat(" "+b));
        System.out.println(map);

    }


    @Test
    public void test2() {

        Map<String,String> map = new HashMap<>();

        map.put("first","1");
        map.put("second","2");
        map.put("third",null);


        map.computeIfAbsent("third",a->a+" value");
        System.out.println(map);
    }

}
