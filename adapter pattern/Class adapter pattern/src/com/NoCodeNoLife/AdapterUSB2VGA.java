package com.NoCodeNoLife;

public class AdapterUSB2VGA extends USBImpl implements VGA {

    @Override
    public void projection() {
        super.showPPT();
    }
}
