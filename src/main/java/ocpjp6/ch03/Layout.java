package ocpjp6.ch03;

/**
 * Created by grzesikl on 09/06/2016.
 */
class Layout {                      // class

    static int s = 343;               // static variable

    int x;                            // instance variable

    { x = 7; int x2 = 5; }            // initialization block

    Layout() { x += 8; int x3 = 6;}   // constructor

    void doStuff() {                  // method

        int y = 0;                      // local variable

        for(int z = 0; z < 4; z++) {    // 'for' code block
            y += z + x;
        }
    }
}

//    As with variables in all Java programs, the variables in this program (s, x, x2, x3, y, and z) all have a scope:
//        s is a static variable.
//        x is an instance variable.
//        y is a local variable (sometimes called a “method local” variable).
//        z is a block variable.
//        x2 is an init block variable, a flavor of local variable.
//        x3 is a constructor variable, a flavor of local variable.

class ScopeErrors1 {
    int x = 5;
    public static void main(String[] args) {
//        x++;   // won't compile, x is an 'instance' variable
    }
}

class ScopeErrors2 {
    public static void main(String [] args) {
//        ScopeErrors s = new ScopeErrors();
//        s.go();
    }
    void go() {
        int y = 5;
        go2();
        y++;        // once go2() completes, y is back in scope
    }
    void go2() {
//        y++;        // won't compile, y is local to go()
    }
}

class BirthDate {
    int year;                                 // Instance variable
    public static void main(String [] args) {
        BirthDate bd = new BirthDate();
        bd.showYear();
    }
    public void showYear() {
        System.out.println("The year is " + year);
    }
}

class Book {
    private String title;          // instance reference variable
    public String getTitle() {
        return title;
    }
    public static void main(String [] args) {
        Book b = new Book();
        String s = b.getTitle();     // Compiles and runs
        String t = s.toLowerCase();  // Runtime Exception!
    }
}


class TimeTravel {
    public static void main(String [] args) {
        int year; // Local variable (declared but not initialized)
//        System.out.println("The year is " + year); // Compiler error
    }
}

class TestLocal {
    public static void main(String [] args) {
        int x;
        if (args[0] != null) { // assume you know this will
            // always be true
            x = 7;               // compiler can't tell that this
            // statement will run
        }
//        int y = x;             // the compiler will choke here
    }
}

class StringTest {
    public static void test() {
        String x = "Java";  // Assign a value to x
        String y = x;       // Now y and x refer to the same
        // String object

        System.out.println("y string = " + y);
        x = x + " Bean";    // Now modify the object using
        // the x reference
        System.out.println("x string = " + x);
        System.out.println("y string = " + y);

        x.toUpperCase();  //watch this!!! result is abandoned
        System.out.println("x string = " + x);

    }
}