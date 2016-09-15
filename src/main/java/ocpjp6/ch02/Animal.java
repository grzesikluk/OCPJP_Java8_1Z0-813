package ocpjp6.ch02;

import java.io.IOException;

/**
 * Created by grzesikl on 06/06/2016.
 */
public class Animal {
    public void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
    void makeNoise() {System.out.println("generic noise"); }

}

//   The argument list must exactly match that of the overridden method. If they don’t match, you can end up with an overloaded method you didn’t intend.
//   The return type must be the same as, or a subtype of, the return type declared in the original overridden method in the superclass. (More on this in a few pages when we discuss covariant returns.)
//   The access level can’t be more restrictive than the overridden method’s.
//   The access level CAN be less restrictive than that of the overridden method.
//   Instance methods can be overridden only if they are inherited by the subclass. A subclass within the same package as the instance’s superclass can override any superclass method that is not marked private or final. A subclass in a different package can override only those non-final methods marked public or protected (since protected methods are inherited by the subclass).
//   The overriding method CAN throw any unchecked (runtime) exception, regardless of whether the overridden method declares the exception. (More in Chapter 5.)
//   The overriding method must NOT throw checked exceptions that are new or broader than those declared by the overridden method. For example, a method that declares a FileNotFoundException cannot be overridden by a method that declares a SQLException, Exception, or any other non-runtime exception unless it’s a subclass of FileNotFoundException.
//   The overriding method can throw narrower or fewer exceptions. Just because an overridden method “takes risks” doesn’t mean that the overriding subclass’ exception takes the same risks. Bottom line: an overriding method doesn’t have to declare any exceptions that it will never throw, regardless of what the overridden method declares.
//   You cannot override a method marked final.
//   You cannot override a method marked static. We’ll look at an example in a few pages when we discuss static methods in more detail.
//   If a method can’t be inherited, you cannot override it. Remember that overriding implies that you’re reimplementing a method you inherited! For example, the following code is not legal, and even if you added an eat() method to Horse, it wouldn’t be an override of Animal’s eat() method.



//    Overloaded methods MUST change the argument list.
//    Overloaded methods CAN change the return type.
//    Overloaded methods CAN change the access modifier.
//    Overloaded methods CAN declare new or broader checked exceptions.
//    A method can be overloaded in the same class or in a subclass.
//       In other words, if class A defines a doStuff(int i) method, the subclass
//       B could define a doStuff(String s) method without overriding the superclass version that takes an int.
//       So two methods with the same name but in different classes can still be considered overloaded, if the subclass
//       inherits one version of the method and then declares another overloaded version in its class definition.

class Horse extends Animal {
//    override
    public void eat()  {
        System.out.println("Horse eating hay, oats, "
                + "and horse treats");
    }


//    overloaded version
    private void eat(String something) throws IOException {
        System.out.println("this is not overriding");
    }
}

class Dog extends Animal {
    void makeNoise() {System.out.println("bark"); }
    void playDead() { System.out.println("roll over"); }
}

class CastTest2 {
    public void doMakeNoiseForAnimals() {
        Animal [] a = {new Animal(), new Dog(), new Animal() };
        for(Animal animal : a) {
            animal.makeNoise();
            if(animal instanceof Dog) {
//                animal.playDead();       // try to do a Dog behavior ? this won't work
                Dog d = (Dog) animal;
                d.playDead();
            }
            else  {
//                Dog d = (Dog) animal; ClassCastException!!
//                String s = (String) animal; //compiler error: inconvertible types?
            }
        }
    }
}