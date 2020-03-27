/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listase.modelo;

import java.io.Serializable;


public class Infante implements Serializable//permite marcar objeto, solo para el que lo solicita
{
    private String nombre;
    private short codigo;
    private byte edad;

    
    //constructor
    public Infante(String nombre, short codigo, byte edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }
    //setyget
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
//sobre escribir el metodo
    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
}
