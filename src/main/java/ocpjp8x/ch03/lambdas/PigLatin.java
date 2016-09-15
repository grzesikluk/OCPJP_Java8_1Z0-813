package ocpjp8x.ch03.lambdas;

import org.junit.Test;

/**
 * Created by grzesikl on 22/06/2016.
 */
interface SuffixFunction {
    void call();
}

//    Lambda functions can refer to local variables from the enclosing scope. The variable needs to be explicitly declared
//final or that variable will be treated as effectively final.

//    Note that this restriction does not apply to data members and class members. Hence you may be at risk when multiple
// threads concurrently modify variables within a lambda expression. Further, effectively final applies only to the references
// and not to the values pointed by the references. Hence, you can mutate the values inside a local array from a lambda function—it is unsafe but possible

public class PigLatin {
    @Test
    public void test() {
        String word = "hello";
        SuffixFunction suffixFunc = () -> System.out.println(word + "ay");
        suffixFunc.call();
    }
}
