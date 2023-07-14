package com.example.ejercicio4;

public class SmartDevice {
    String marca;
    float version;
    float pantallaPulgadas;

    public SmartDevice(){

    }

    public SmartDevice(String marca, float version, float pantallaPulgadas){
        this.marca = marca;
        this.version = version;
        this.pantallaPulgadas = pantallaPulgadas;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", version=" + version +
                ", pantallaPulgadas=" + pantallaPulgadas +
                '}';
    }
}
