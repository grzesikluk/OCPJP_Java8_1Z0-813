package ocpjp8.ch02;

@FunctionalInterface
public interface CheckTrait {
    public boolean test(Animal a);
//    public boolean test2(Animal b); will not compile if annotation used
}
