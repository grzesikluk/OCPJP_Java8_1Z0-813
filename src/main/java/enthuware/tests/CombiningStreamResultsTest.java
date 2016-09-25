package enthuware.tests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by Lukasz on 2016-09-24.
 */
public class CombiningStreamResultsTest {
    List<Book> books;
    List<String> stringList;

    public static class Book {
        private int id;
        private String title;

        public Book(int id, String title, String genre, String author, double price) {
            this.id = id;
            this.title = title;
            this.genre = genre;
            this.author = author;
            this.price = price;
        }

        private String genre;
        private String author;
        private double price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }

//constructors and accessors not shown

    }

    @Before
    public void init() {
        books = new ArrayList<>();
        books.add(new Book(1, "Dracula", "Horror", "Author", 12.0));
        books.add(new Book(2, "Shining", "Horror", "Author Two", 22.0));
        books.add(new Book(3, "Hobbit", "Fantasy", "Tolkien", 32.0));
        books.add(new Book(4, "Lord of the rings", "Fantasy", "Tolkien", 32.0));

        stringList = new ArrayList<>();
        stringList.add("Adam");
        stringList.add("Doris");
        stringList.add("Daniel");
        stringList.add("Nora");
        stringList.add("Zara");
        stringList.add("Aga");
        stringList.add("Malwina");
        stringList.add("Ania");
    }

    @Test
    public void test1() {
        Map<String, Map<String, List<Book>>> classified = null;

        classified = books.stream().collect(Collectors.groupingBy(
                Book::getGenre, Collectors.groupingBy(Book::getAuthor)

        ));
        System.out.println(classified);

    }


    @Test
    public void test2() {
        Map<String, Map<String, List<Book>>> classified = null;
//
//        classified = books.stream().collect();
//        System.out.println(classified);

    }

    @Test
    public void test3() {
        Supplier<StringBuilder> supplier = () -> {
            System.out.println("Supplier called");
            return new StringBuilder();
        };

        BiConsumer<StringBuilder,String> accumulator = (a,b)->{
            System.out.println("Accumulator called");
            a.append(b);
        };

        BiConsumer<StringBuilder,StringBuilder> combiner = (a,b)->{
            System.out.println("Combiner called");
            a.append(b);
        };

        StringBuilder classified = stringList.stream().parallel().collect(supplier, accumulator, combiner);
        System.out.println(classified);

    }

    @Test
    public void test4() {

        ArrayList<String> classified = stringList.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(classified);

    }

    /**
     * collect by partiitoning
     */
    @Test
    public void test5() {

        String classified1 = stringList.stream().collect(Collectors.joining(","));
        System.out.println(classified1);
        Predicate<String> pred = (a)->a.contains("s");

        Map<Boolean, List<String>> classified2 = stringList.stream().collect(Collectors.partitioningBy(pred));

        System.out.println(classified2);
    }


    @Test
    /**
     * partitioning using set. Note where the collector is placed as a second argument for other collector
     */
    public void test5b() {

        Predicate<String> pred = (a)->a.contains("s");
        Map<Boolean, Set<String>> classified2 = stringList.stream().collect(Collectors.partitioningBy(pred,Collectors.toSet()));
        System.out.println(classified2);
    }

    /**
     * collect by partiitoning
     */
    @Test
    public void test6() {
        Function<String,Character> func = (a)->a.charAt(0);

        Map<Character, List<String>> classified = stringList.stream().collect(Collectors.groupingBy(func));

        System.out.println(classified);
    }

    @Test
    public void test7() {
        Double classified = stringList.stream().collect(Collectors.averagingInt(String::length));
        System.out.println(classified);
    }


    @Test
    public void test8() {
        Map<String,Integer> classified = stringList.stream().collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println(classified);
    }

}
