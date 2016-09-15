package ocpjp8x.ch08;

import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class LocalDateTest {

    @Test
    public void test1() throws Exception {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

    }

    @Test
    public void test2() throws  Exception {
        LocalDate newYear2016 = LocalDate.of(2016, 1, 1);
        System.out.println("New year 2016: " + newYear2016);
    }

    @Test(expected = DateTimeException.class)
    public void test3() throws  Exception {
        LocalDate valentinesDay = LocalDate.of(2016, 14, 2);
        System.out.println("Valentine's day is on: " + valentinesDay);
    }

    @Test
    public void test4() throws  Exception {
        long visaValidityDays = 180L;
        LocalDate currDate = LocalDate.now();
        System.out.println("My Visa expires on: " + currDate.plusDays(visaValidityDays));
    }

}
