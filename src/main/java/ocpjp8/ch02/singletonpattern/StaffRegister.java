package ocpjp8.ch02.singletonpattern;

/**
 * Created by grzesikl on 13/06/2016.
 */
// Instantiation using a static block
public class StaffRegister {
    private static final StaffRegister instance;

    static {
        instance = new StaffRegister();
        // Perform additional steps
    }

    private StaffRegister() {
    }

    public static StaffRegister getInstance() {
        return instance;
    }


}
