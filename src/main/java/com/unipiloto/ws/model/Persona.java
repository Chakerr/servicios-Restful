package com.unipiloto.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Salario calculado automáticamente
    public double getSalario() {
        final double SALARIO_MINIMO = 1300000.0; // puedes ajustar este valor
        return (edad * SALARIO_MINIMO) / 3;
    }
}