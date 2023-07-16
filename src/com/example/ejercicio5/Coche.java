package com.example.ejercicio5;

public class Coche {
    String marca;
    int cilindrada;
    float precio;

    public Coche(){

    }
    public Coche(String marca, int cilindrada, float precio){
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", cilindrada=" + cilindrada +
                ", precio=" + precio +
                '}';
    }
}
