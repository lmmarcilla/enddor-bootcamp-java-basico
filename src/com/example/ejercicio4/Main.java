package com.example.ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartWatch reloj1 = new SmartWatch("IPhone", 14F, 14F, "cuero");
        System.out.println(reloj1);
        SmartWatch reloj2 = new SmartWatch();
        reloj2.marca = "Samsung";
        reloj2.version = 21F;
        reloj2.pantallaPulgadas = 13F;
        reloj2.pulsera = "deportiva";
        System.out.println(reloj2);

        SmartDevice reloj3 = new SmartWatch("IPhone", 14F, 14F, "cuero");
        System.out.println(reloj3);

        SmartPhone movil1 = new SmartPhone("IPhone", 14F, 14F, "gran angular");
        System.out.println(movil1);
        SmartPhone movil2 = new SmartPhone();
        movil2.marca = "Samsung";
        movil2.version = 21F;
        movil2.pantallaPulgadas = 13F;
        movil2.camara = "estabilizador";
        System.out.println(movil2);

        SmartDevice movil3 = new SmartPhone("IPhone", 14F, 14F, "nocturna");
        System.out.println(movil3);



    }
}
