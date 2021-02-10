package com.avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Students!");
        debug("An error occurred!");
    }

    public static void debug( String debug ) {
        System.out.println("DEBUG: " + debug);
    }
}
