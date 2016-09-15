package ocpjp8x.ch08;

import org.junit.Test;

import java.time.*;
import java.util.Set;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class TestZoneIds {
    @Test
    public void test1() {
        System.out.println("My zone id is: " + ZoneId.systemDefault());
    }

    @Test
    public void test2() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println("Number of available time zones is: " + zones.size());
        zones.forEach(System.out::println);
    }

    @Test
    public void test3() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        ZoneId myZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime, myZone);
        System.out.println(zonedDateTime);
    }

    @Test
    public void test4() {
        ZoneId myZone = ZoneId.of("Asia/Kolkata");
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = dateTime.atZone(myZone);
        ZoneOffset zoneOffset = zonedDateTime.getOffset();
        System.out.println(zoneOffset);
    }

    @Test
    public void testDaylightSavings() {
        ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
        Duration kolkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Kolkata zone DST is: %d hours %n", kolkataDST.toHours());

        ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
        Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());    }
}
