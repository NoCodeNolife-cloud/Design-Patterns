package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Environment environment = new Environment(new AddStrategy());
        int result = environment.calculate(20, 5);
        System.out.println(result);

        Environment environment1 = new Environment(new SubstractStrategy());
        int result1 = environment1.calculate(20, 5);
        System.out.println(result1);
    }
}
