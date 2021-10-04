package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        if (singleton instanceof Singleton) {
            System.out.println("has instance");
        } else {
            System.out.println("has no instance");
        }
    }
}
