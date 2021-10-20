package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Light light=new Light("cnn");
        Command command=new TurnOffLight(light);
        Contral contral=new Contral();
        contral.CommandExcute(command);
        contral.CommandUndo(command);
    }
}
