package com.company;

public class EjemploGC {

    public void ejemplo() {

        // los valores primitivos son guardados en el stack
        int x = 17;

        // La referencia p es guardata en el stack
        // Los objetos de la clase Persona son guardados en el heap

        Persona p;

        p = new Persona("Sebastian");

        // reasigno "p"

        p = new Persona("Gonzalo");

        //La instancia "Sebastian" puede ser destruida por el GC

    }

}
