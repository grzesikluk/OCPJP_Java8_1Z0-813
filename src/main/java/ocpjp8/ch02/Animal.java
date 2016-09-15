package ocpjp8.ch02;

import java.util.List;

/**
 * Created by grzesikl on 13/06/2016.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    List<String> favFood;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public Animal (String speciesNam, int age, List<String> favoriteFoods) {

        species = speciesNam;
        this.age = age;
        favFood = favoriteFoods;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

