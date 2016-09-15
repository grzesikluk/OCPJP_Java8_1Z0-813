package ocpjp8x.ch08;

import org.junit.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Created by Lukasz on 2016-09-15.
 */
public class TestTemporalUnit {

    @Test
    public void test1() {
        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        for(ChronoUnit unit : ChronoUnit.values()) {
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
                    unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
        }
    }
    @Test
    public void test2() {
        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
// prints: 60
        System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());
// prints:3600
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
    }

}
