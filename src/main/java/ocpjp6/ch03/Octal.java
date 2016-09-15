package ocpjp6.ch03;

/**
 * Created by grzesikl on 06/06/2016.
 */
class Octal {

    public static void go() {
        int six = 06;     // Equal to decimal 6
        int seven = 07;   // Equal to decimal 7
        int eight = 010;  // Equal to decimal 8
        int nine = 011;   // Equal to decimal 9
        System.out.println("Octal 010 = " + eight);
    }
}

class HexLiterals {
    public static void goHex() {
        int x = 0X0001;
        int y = 0x7fffffff;
        int z = 0xDeadCafe;
        System.out.println("x = " + x + " y = " + y + " z = " + z);

//        Long
        long jo = 110599L;
        long so = 0xFFFFl;  // Note the lowercase 'l'

//        int x = 25,343; // Won't compile because of the comma
    }
}

class DoubleLiterals {

    double d1 = 11301874.9881024;

    //    float f = 23.467890;         // Compiler error, possible loss of precision
    float f1 = 49837849.029847F;  // OK; has the suffix "F"


    double d2 = 110599.995011D; // Optional, not required
    double d3 = 987.897;       // No 'D' suffix, but OK because the literal is a double by default

}

class BooleanLiterals {
    boolean t = true;    // Legal
//    boolean  f = 0;      // Compiler error!

    void test1() {
//        int x = 1;   if (x) { } // Compiler error!
    }
}

class CharacterLiterals {
    char a = 'a';
    char b = '@';

    char letterN = '\u004E'; // The letter 'N'

    char a1 = 0x892;        // hexadecimal literal
    char b1 = 982;          // int literal
    char c1 = (char) 70000;  // The cast is required; 70000 is out of char range
    char d1 = (char) -98;   // Ridiculous, but legal

    //    char e = -29;   // Possible loss of precision; needs a cast
//    char f = 70000; // Possible loss of precision; needs a cast
    char c = '\"';     // A double quote
    char d = '\n';     // A newline

}

class PrimitiveAssignments {
    int x = 7;     // literal assignment
    int y = x + 2; // assignment with an expression (including a literal)
    int z = x * y; // assignment with an expression

    byte b2 = 27;

    byte b1 = (byte) 27; // Explicitly cast the int literal to a byte



    byte a = 3;     // No problem, 3 fits in a byte
    byte b = 8;     // No problem, 8 fits in a byte
//    byte c =  a + b; // Should be no problem, sum of the two bytes fits in a byte
}