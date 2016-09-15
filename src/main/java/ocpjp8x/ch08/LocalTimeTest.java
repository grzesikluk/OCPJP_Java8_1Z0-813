package ocpjp8x.ch08;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class LocalTimeTest {

    @Test
    public void test1() throws Exception{
        LocalTime currTime = LocalTime.now();
        System.out.println("Current time is: " + currTime);
    }

    @Test
    public void test2() throws Exception{
        long hours = 6;
        long minutes = 30;
        LocalTime currTime = LocalTime.now();
        System.out.println("Current time is: " + currTime);
        System.out.println("My meeting is at: " + currTime.plusHours(hours).plusMinutes(minutes));
    }

    @Test
    public void test3() throws Exception{
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("Today's date and current time is: " + currDateTime);
    }

    @Test
    public void test5() throws Exception{

    }


}
