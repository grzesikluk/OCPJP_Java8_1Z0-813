package ocpjp6.ch02;

/**
 * Created by grzesikl on 06/06/2016.
 *
 *
 *
 *
Provide concrete (nonabstract) implementations for all methods from the declared interface.
Follow all the rules for legal overrides.
Declare no checked exceptions on implementation methods other than those declared by the interface method, or subclasses
 of those declared by the interface method.
Maintain the signature of the interface method, and maintain the same return type (or a subtype). (But it does not have
 to declare the exceptions declared in the interface method declaration.)
 */


public class Ball implements Bounceable {  // Keyword
    // 'implements'
    public void bounce() { }
    public void setBounceFactor(int bf) { }
}

//thats also fine
abstract class AbstractBall implements  Bounceable {};

class BeachBall extends AbstractBall {
    // Even though we don't say it in the class declaration above,
    // BeachBall implements Bounceable, since BeachBall's abstract
    // superclass (Ball) implements Bounceable

    public void bounce() {
        // interesting BeachBall-specific bounce code
    }
    public void setBounceFactor(int bf) {
        // clever BeachBall-specific code for setting
        // a bounce factor
    }
    // if class Ball defined any abstract methods,
    // they'll have to be
    // implemented here as well.
}