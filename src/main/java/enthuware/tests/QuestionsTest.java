package enthuware.tests;

import org.junit.Test;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Lukasz on 2016-09-24.
 */
public class QuestionsTest {

    /**
     * question no:    2.1140
     */
    @Test
    public void test1() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.merge("b", 1, (i1, i2) -> i1 + i2);
        map1.merge("c", 3, (i1, i2) -> i1 + i2);
        System.out.println(map1);
    }

    /**
     * question no: 2.1883
     */
    @Test
    public void test2() {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()));
        System.out.println(data.values());
    }

    @Test
    public void test3() {
        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);
    }


    @Test
    public void test4() {
        AtomicInteger ai = new AtomicInteger();
        Stream<String> stream = Stream.of("old", "king", "cole", "was", "a", "merry", "old", "soul").parallel();
        stream.filter(e -> {
            ai.incrementAndGet();
            System.out.println(ai);
            System.out.println(e);
            return e.contains("o");
        }).allMatch(x -> x.indexOf("o") > 0);

        System.out.println("AI = " + ai);
    }

    /**
     * question no: 2.1748
     */
    @Test
    public void test5() {
        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }

    /**
     * question no: 2.1583
     */
    @Test
    public void test6() {
        File[] roots = File.listRoots();
        for (File f : roots) {
            System.out.println(f);
        }
        Iterable<Path> roots2 = FileSystems.getDefault().getRootDirectories();
        for (Path p : roots2) {
            System.out.println(p);
        }
    }

    /**
     * question no: 2.1608
     */
    @Test
    public void test7() {
        //relative plus absolute
        Path p1 = Paths.get("photos\\vacation");
        Path p2 = Paths.get("\\yellowstone");
        System.out.println(p1.resolve(p2));
//        System.out.println(p1.relativize(p2));   // will throw IllegalArgException
    }

    /**
     * question no: 2.1608
     */
    @Test
    public void test8() {
        //two absolute paths
        Path p1 = Paths.get("\\photos\\vacation");
        Path p2 = Paths.get("\\yellowstone");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
        System.out.println(p1.relativize(p2));
    }

    /**
     * question no: 2.1608
     */
    @Test
    public void test9() {
        Path p1 = Paths.get("photos\\vacation");
        Path p2 = Paths.get("\\yellowstone");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
//        System.out.println(p1.relativize(p2)); throws Exception
    }

    /**
     * question no: 2.1608
     */
    @Test
    public void test10() {
        Path p1 = Paths.get("photos\\vacation");
        Path p2 = Paths.get("yellowstone");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
        System.out.println(p1.relativize(p2));
    }

    /**
     * question no: 3.1430
     */
    @Test
    public void test11() {
        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;

        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
//        System.out.println(new LocalDate().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
//        System.out.println(new LocalDate().adjust(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));
        System.out.println(TemporalAdjusters.firstDayOfNextMonth().adjustInto(LocalDate.now()));

    }


    /**
     * question no: 2.1888
     */
    @Test
    public void test12() {
        IntStream is = IntStream.rangeClosed(1, 4);
        int sum = is.reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }


    /**
     * question no: 2.1888
     */
    @Test
    public void test13() {
        IntStream is = IntStream.rangeClosed(1, 4);
        int sum = is.reduce(0, (a, b)->a+b);
        System.out.println(sum);
    }
    /**
     * question no: 2.1888
     */
    @Test
    public void test14() {
        IntStream is = IntStream.range(1, 5);
//        int sum = is.reduce((a, b)->a+b);
//        System.out.println(sum);
    }




    /**
     * question no: X.YYYY
     */
    @Test
    public void testN() {

    }
}