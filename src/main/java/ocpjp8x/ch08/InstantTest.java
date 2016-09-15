package ocpjp8x.ch08;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class InstantTest {

    @Test
    public void test1() throws Exception{
        // prints the current timestamp with UTC as time zone
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timestamp is: "+ currTimeStamp);

        // prints the number of seconds as Unix timestamp from epoch time
        System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());

        // prints the Unix timestamp in milliseconds
        System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());
    }

    @Test
    public void test2() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println("LocalDateTime is: " + localDateTime + " \nInstant is: " + instant);
    }

}
