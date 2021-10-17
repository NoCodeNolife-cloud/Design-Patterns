package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("-----------------------------");

        Dish bouilli = new Bouilli();
        bouilli.dodish();
    }
}
