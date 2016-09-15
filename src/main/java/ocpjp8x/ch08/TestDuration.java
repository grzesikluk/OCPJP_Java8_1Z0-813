package ocpjp8x.ch08;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class TestDuration {
    @Test
    public void test1() {
        LocalDateTime comingMidnight =
                LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime now = LocalDateTime.now();

        Duration between = Duration.between(now, comingMidnight);
        System.out.println(between);
    }
}
