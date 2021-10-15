package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        Phone vivo = new Vivo();
        Software appstore = new AppStore();
        vivo.setSoftware(appstore);
        vivo.run();
    }
}
