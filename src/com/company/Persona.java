package com.company;

public class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void checkNombre () {
        String nombre = this.getNombre();

        if (nombre.length() > 0) {
            System.out.println(nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
