package ocpjp6.ch01.pack1;

/**
 * Created by grzesikl on 02/06/2016.
 */
public class ch01_ex5 {

    public static void main(String[] args) {

        String a = "my string";
        changeIt(a);
        System.out.println(a);

    }

    private static void changeIt(String k) {
        k = "some other string";
    }

}
