package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        PreloadSingleton preloadSingleton = PreloadSingleton.getInstance();
        if (preloadSingleton != null) {
            System.out.println("has instance\n");
        } else {
            System.out.println("has not instance\n");
        }
    }
}
