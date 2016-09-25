package enthuware.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Lukasz on 2016-09-25.
 */


class Student {
    private String name;

    public Student(String s1, int i) {
        name = s1;
        marks = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private int marks;

    //constructor and getters and setters not shown

    public void addMarks(int m){
        this.marks += m;
    }
    public void debug(){
        System.out.println(name+":"+marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}



public class TestStreams {

    public static void main(String[] args) {
        List<Student> slist = Arrays.asList(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
        Consumer<Student> increaseMarks = s->s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.stream().forEach(Student::debug);

    }


}
