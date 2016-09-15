package ocpjp8x.ch08;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class TestFormattingTime {

    @Test
    public void test1() {
        LocalTime wakeupTime = LocalTime.of(6, 0, 0);
        System.out.println("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));
    }

    @Test
    public void test2() {
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));
    }

    @Test
    public void test3() {
        // patterns from simple to complex ones
        String[] dateTimeFormats = {
                "dd-MM-yyyy", /* d is day (in month), M is month, y is year */
                "d '('E')' MMM, YYYY", /*E is name of the day (in week), Y is year*/
                "w'th week of' YYYY", /* w is the week of the year */
                "EEEE, dd'th' MMMM, YYYY" /*E is day name in the week */
        };
        LocalDateTime now = LocalDateTime.now();
        for (String dateTimeFormat : dateTimeFormats) {
            System.out.printf("Pattern \"%s\" is %s %n", dateTimeFormat,
                    DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
        }
    }

    @Test
    public void test4() {
        // patterns from simple to complex ones
        String [] timeFormats = {
                "h:mm",          /* h is hour in am/pm (1-12), m is minute */
                "hh 'o''clock'", /* '' is the escape sequence to print a single quote */
                "H:mm a",        /* H is hour in day (0-23), a is am/pm*/
                "hh:mm:ss:SS",   /* s is seconds, S is milliseconds */
                "K:mm:ss a"      /* K is hour in am/pm(0-11) */
        };
        LocalTime now = LocalTime.now();
        for(String timeFormat : timeFormats) {
            System.out.printf("Time in pattern \"%s\" is %s %n", timeFormat,
                    DateTimeFormatter.ofPattern(timeFormat).format(now));
        }
    }

    @Test
    public void test5() {

    }

    @Test
    public void test6() {

    }
}
