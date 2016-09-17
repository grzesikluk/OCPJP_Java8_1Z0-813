package ocpjp8x.ch09;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class StandardStreams {

    @Test
    public void getFromConsole() {
        System.out.print("Type a character: ");
        int val = 0;
        try {
            // the return type of read is int, but it returns a byte value!
            val = System.in.read();
        } catch(IOException ioe) {
            System.err.println("Cannot read input " + ioe);
            System.exit(-1);
        }
        System.out.println("You typed: " + val);
    }
    @Test
    public void assignOtherStream() {
        try{
            PrintStream ps = new PrintStream("log.txt");
            System.setOut(ps);
            System.out.println("Test output to System.out");
        } catch(Exception ee){
            ee.printStackTrace();
        }
    }
    @Test
    public void test3() {

    }
    @Test
    public void test4() {

    }
    @Test
    public void test5() {

    }


}
