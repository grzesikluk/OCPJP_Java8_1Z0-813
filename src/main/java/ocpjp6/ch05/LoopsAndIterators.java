package ocpjp6.ch05;

/**
 * Created by grzesikl on 10/06/2016.
 */
public class LoopsAndIterators {

    public static void test1() {
        int y = 2;

        for (int x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) { } //legal
//        for (int x = 0; (x > 5), (y < 2); x++) { } // too many expressions

//        for( ; ; ) {  System.out.println("Inside an endless loop");   }


        for (int i = 0,j = 0; (i<10) && (j<10); i++, j++) {
            System.out.println("i is " + i + " j is " +j);
        }

    }

    public static void test2() {
        int [] a = {1,2,3,4};
        for(int x = 0; x < a.length; x++)    // basic for loop
            System.out.print(a[x]);
        for(int n : a)                       // enhanced for loop
            System.out.print(n);
    }

    public static void test3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside first loop");
            continue;
        }
    }
    public static void test4(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside second loop" + i);
            if ( i%3 == 0) {
                continue;
            }
            // more loop code, that won't be reached when the above if
            // test is true
        }

    }
    public static void test5(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside second loop" + i);
            if ( i%3 == 0) {
                break;
            }
            // more loop code, that won't be reached when the above if
            // test is true
        }

    }
}
