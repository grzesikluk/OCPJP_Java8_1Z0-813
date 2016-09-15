package ocpjp6.ch03;

/**
 * Created by grzesikl on 06/06/2016.
 */
class Collar {
}

class Dog {
    Collar c;         // instance variable
    String name;      // instance variable

    public static void go() {

        Dog d;                         // local variable: d
        d = new Dog();
        d.go(d);
    }

    void go(Dog dog) {               // local variable: dog
        c = new Collar();
        dog.setName("Aiko");
    }

    void setName(String dogName) {   // local var: dogName
        name = dogName;
        // do more stuff
    }
}
