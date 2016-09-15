package ocpjp8.ch02.factorypattern;

public class ZooKeeper {
    public static void test() {
        final Food food = FoodFactory.getFood("polar bear");
        food.consumed();
    }
}
