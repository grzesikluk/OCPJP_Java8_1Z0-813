package ocpjp6.ch01.pack3;

import org.junit.Test;

/**
 * Created by grzesikl on 02/06/2016.
 */
public class EnumsTest {

    enum Something {SMALL,MEDIUM,BIG}

    enum CoffeeSize{
        BIG(20),MEDIUM(10),SMALL(5),SMALLEST("almost nothing");

        private int ounces;
        private String sizeDesc;


        private CoffeeSize(int ounces) { //yes it can be private
            this.ounces = ounces;
        }

        private CoffeeSize(String sDesc) { //yes it can be overloaded
            this.sizeDesc = sDesc;
        }

        public int getOunces() {
            return ounces;
        }
    }

    @Test
    public void testEnumWithConstructor() {
        CoffeeSize mySize = CoffeeSize.BIG;

        System.out.println(mySize.getOunces());
        mySize = CoffeeSize.SMALLEST;
        System.out.println(mySize.sizeDesc);


    }

}
