package ocpjp8.ch03;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by grzesikl on 21/06/2016.
 */
public class MapTest {
    @Test
    public void test1(){
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");  // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,

        map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        food = map.get("koala");
        for (String key: map.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,

//        System.out.println(map.contains("lion"));      // DOES NOT COMPILE
        System.out.println(map.containsKey("lion"));   // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size());                // 3
    }
}
