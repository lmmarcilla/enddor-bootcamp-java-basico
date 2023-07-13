package com.example;

public class ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Pedro", "Manuel", "Óscar", "Francisco"};
        String concat = "Resultado: ";
        for(String nombre : nombres){
            concat += " "+nombre;
        }
        System.out.println(concat);
    }
}
