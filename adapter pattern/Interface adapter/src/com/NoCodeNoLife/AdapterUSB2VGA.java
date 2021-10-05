package com.NoCodeNoLife;

public abstract class AdapterUSB2VGA implements VGA {

    USB u = new USBImpl();

    @Override
    public void projection() {
        u.showPPT();
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }
}
