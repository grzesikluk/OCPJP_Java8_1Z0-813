package ocpjp8.ch02.factorypattern;

/**
 * Created by grzesikl on 13/06/2016.
 */
public abstract class Food {
    private int quantity;
    public Food(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public abstract void consumed();
}

