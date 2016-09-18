package ocpjp8x.ch11;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.*;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class StreamParrallelism {
    List<Widget> widgets = new ArrayList<>() ;

    @Before
    public void init() {
    widgets.add(new Widget(RED, 1));
        widgets.add(new Widget(BLUE, 4));
        widgets.add(new Widget(BLACK, 2));
        widgets.add(new Widget(WHITE, 3));
        widgets.add(new Widget(RED, 5));
    }

    @Test
    public void test1() {
        int sumOfWeights = widgets.parallelStream()
                .filter(b -> b.getColor() == RED)
                .mapToInt(b -> b.getWeight())
                .sum();
        System.out.println(sumOfWeights);
    }


    @Test
    public void test2() {
        widgets.parallelStream().distinct().forEach(System.out::println);

    }

}

class Widget {
    Color color;
    int weight;

    Widget(Color c, int w) {
        color = c;
        weight = w;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return color.toString()+weight;
    }
}