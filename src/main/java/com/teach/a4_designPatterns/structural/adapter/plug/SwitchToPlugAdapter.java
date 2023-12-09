package com.teach.a4_designPatterns.structural.adapter.plug;

public class SwitchToPlugAdapter implements Plug {//Adapter implements the Target interface
    Switch indianSwitch;//Adapter is composed with the Adaptee

    public SwitchToPlugAdapter(Switch indianSwitch) {
        System.out.println("\nPlugging Adapter");
        this.indianSwitch = indianSwitch;
    }

    @Override
    public void pin3() {
        indianSwitch.pin2();
    }
}
