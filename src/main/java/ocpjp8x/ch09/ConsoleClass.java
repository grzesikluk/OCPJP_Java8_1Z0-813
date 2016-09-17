package ocpjp8x.ch09;

import org.junit.Test;

import java.io.Console;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class ConsoleClass {

    @Test
    public void test1() {
        // get the System console object
        Console console = System.console();
        if(console == null) {
            System.err.println("Cannot retrieve console object - are you running your application from an IDE? Exiting the application ... ");
            System.exit(-1); // terminate the application
        }
        // read a line and print it through printf
        console.printf(console.readLine());
    }

}
