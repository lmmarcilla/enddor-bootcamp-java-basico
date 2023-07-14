package com.example.ejercicio4;

public class SmartWatch extends SmartDevice{
    String pulsera;

    SmartWatch(){
        super();
    }

    SmartWatch(String marca, float version, float pantallaPulgadas, String pulsera){
        super(marca, version,  pantallaPulgadas);
        this.pulsera = pulsera;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulsera='" + pulsera + '\'' +
                ", marca='" + marca + '\'' +
                ", version=" + version +
                ", pantallaPulgadas=" + pantallaPulgadas +
                '}';
    }
}
