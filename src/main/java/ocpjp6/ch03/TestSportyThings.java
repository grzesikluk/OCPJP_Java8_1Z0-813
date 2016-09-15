package ocpjp6.ch03;

/**
 * Created by grzesikl on 09/06/2016.
 */
interface Sporty {
    void beSporty();
}


class Porsche extends Car implements Sporty {
    public void beSporty() {
        // implement cool sporty method in a Ferrari-specific way
    }
}
class RacingFlats extends AthleticShoe implements Sporty {
    public void beSporty() {
        // implement cool sporty method in a RacingShoe-specific way
    }
}
class GolfClub { }

class TestSportyThings {
    public static void test () {
        Sporty[] sportyThings = new Sporty [3];
        sportyThings[0] = new Porsche();      // OK, Ferrari
        // implements Sporty
        sportyThings[1] = new RacingFlats();  // OK, RacingFlats
        // implements Sporty
//        sportyThings[2] = new GolfClub();     // Not OK; GolfClub does not implement Sporty
    }
}
