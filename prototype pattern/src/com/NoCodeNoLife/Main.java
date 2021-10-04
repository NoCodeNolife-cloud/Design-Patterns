package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Prototype prototype = new Prototype();
        try {
            Prototype prototype1 = (Prototype) prototype.clone();
            if(prototype1!=null){
                System.out.println("has instance");
            }else{
                System.out.println("has no instance");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
