package ocpjp8x.ch03.lambdas;

import org.junit.Test;

/**
 * Created by grzesikl on 22/06/2016.
 */

interface LambdaFunction {
    void call();
}

//    they are functions without a name and are not associated with any class. Specifically, they are NOT static
//or instance members of the class in which they are defined. If you use this keyword inside a lambda function,
//        it refers to the object in the scope in which the lambda is defined.

interface SecondLambdaFunction {
    int call(int x, int y);
}

public class FirstLambda {
    @Test
    public void test() {

        LambdaFunction lambdaFunction = () -> System.out.println("Hello world");
        SecondLambdaFunction lambdaFunction2 =  (x,k)-> { return x+k;};

        lambdaFunction.call();
        System.out.println(lambdaFunction2.call(1,3));
    }
}