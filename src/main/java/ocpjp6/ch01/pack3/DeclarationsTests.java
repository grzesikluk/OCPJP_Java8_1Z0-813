package ocpjp6.ch01.pack3;

import org.junit.Test;

/**
 * Created by grzesikl on 02/06/2016.
 */
public class DeclarationsTests {

    @Test
    public void primitivesTests() {

//        Type	    Bits	Bytes	Minimum Range	Maximum Range
//        byte	    8	     1	      -27	             27- 1
//        short	    16	     2	      -215	             215- 1
//        int	    32	     4	      -231	             231- 1
//        long	    64	     8	      -263	             263- 1
//        float	    32	     4	      n/a	             n/a
//        double    64	     8	      n/a	             n/a

        int k;
        char c;
        boolean d;


    }

    @Test
    public void arraysTest () {
        int[] k;
        int ka[]; //also legal

        int[][] doubleSize;
        int[] outerDoubleSize [];

//        int[5] illegalInit; this is not legal, no size in definition
        int[] legalInit = {1,2,3,4,5};


    }

}
