package com.avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Students!");
        System.out.println(sum(12, 12));
        debug(10, "A fatal error occurred!");
    }

    public static int sum (int a, int b) {
        return a + b;
    }

    public static void debug( int debugLevel, String debug ) {
        System.out.println("DEBUG (" + debugLevel + "): " + debug);
    }

}
