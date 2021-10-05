package com.NoCodeNoLife;

public class AdapterUSB2VGA implements VGA {
    USB u = new USBImpl();
    @Override
    public void projection() {
        u.showPPT();
    }
}