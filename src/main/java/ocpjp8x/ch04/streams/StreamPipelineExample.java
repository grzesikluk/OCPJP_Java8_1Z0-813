package ocpjp8x.ch04.streams;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPipelineExample {
    @Test
    public  void streamPipelineTest() {
        Arrays.stream(Object.class.getMethods())       // source - public java.lang.reflect.Method[]
                .map(method -> method.getName())       // intermediate op
                .distinct()                            // intermediate op
                .forEach(System.out::println);         // terminal operation
    }

    @Test
    public void streamPipelineComponentsTest() {
        Method[] objectMethods = Object.class.getMethods();
        Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
        Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
        Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
        uniqueObjectMethodNames.forEach(System.out::println);
    }
}
