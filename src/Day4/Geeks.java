package Day4;

// Java program to demonstrate Widening TypeCasting
import java.io.*;

class Geeks {
    public static void main(String[] args)
    {
        int i = 10;

        // Wideing TypeCasting (Automatic Casting)
        // from int to long
        long l = i;

        // Wideing TypeCasting (Automatic Casting)
        // from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }
}
