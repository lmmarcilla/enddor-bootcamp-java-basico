package com.example.ejercicio4;

public class SmartPhone extends SmartDevice{
    String camara;

    SmartPhone(){
        super();
    }

    SmartPhone(String marca, float version, float pantallaPulgadas, String camara){
        super(marca, version,  pantallaPulgadas);
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara='" + camara + '\'' +
                ", marca='" + marca + '\'' +
                ", version=" + version +
                ", pantallaPulgadas=" + pantallaPulgadas +
                '}';
    }
}
