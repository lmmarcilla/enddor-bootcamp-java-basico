package com.example;

public class ejercicio2 {

    public static void main(String[]args){

        double precio = 100;
        double result = calcular_iva(precio);
        System.out.println("El iva precio con iva es: "+result);

    }

    static double calcular_iva(double neto){
        return neto*1.21;
    }
}
