package com.example.ejercicio5;

public class Main {
    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    public static void main(String[] args) {

        Coche coche1 = new Coche("Renault", 1600, 20000);
        Coche coche2 = new Coche("Ford", 1800, 25000);
        Coche coche3 = new Coche("Audi", 2000, 60000);

        cocheCrud.save(coche1);
        System.out.println(cocheCrud.findAll());
        cocheCrud.save(coche2);
        System.out.println(cocheCrud.findAll());
        cocheCrud.save(coche3);
        System.out.println(cocheCrud.findAll());
        cocheCrud.delete(coche2);
        System.out.println(cocheCrud.findAll());

    }
}
