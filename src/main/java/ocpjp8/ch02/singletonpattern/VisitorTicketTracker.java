package ocpjp8.ch02.singletonpattern;

/**
 * Created by grzesikl on 13/06/2016.
 */
// Lazy instantiation
public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;

    private VisitorTicketTracker() {
    }

    public static synchronized VisitorTicketTracker getInstance() { //must be synchronized to ensure uniqueness for threads
        if (instance == null) {
            instance = new VisitorTicketTracker();  // NOT THREAD-SAFE!
        }
        return instance;
    }

//    public static VisitorTicketTracker getInstance() {
//        if(instance == null) {
//            synchronized(VisitorTicketTracker.class) {
//                if(instance == null) {
//                    instance = new VisitorTicketTracker();
//                }
//            }
//        }
//        return instance;
//    }


}
