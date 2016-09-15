package ocpjp8x.ch03.lambdas;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by grzesikl on 22/06/2016.
 */
interface SuffixFunction2 {
    void call()  throws IOException;
}

//    Lambda functions can refer to local variables from the enclosing scope. The variable needs to be explicitly declared
//final or that variable will be treated as effectively final.

//    Note that this restriction does not apply to data members and class members. Hence you may be at risk when multiple
// threads concurrently modify variables within a lambda expression. Further, effectively final applies only to the references
// and not to the values pointed by the references. Hence, you can mutate the values inside a local array from a lambda function—it is unsafe but possible

public class PigLatinException {
    @Test
    public void test() throws IOException {
        String word = "hello";
        SuffixFunction2 suffixFunc = () -> { System.out.println(word + "ay");
            throw new IOException("something bad");
                };

        suffixFunc.call();
    }
}