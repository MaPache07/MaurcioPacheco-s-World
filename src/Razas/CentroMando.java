/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author MaPache
 */
public class CentroMando implements CentroMandoPlan{
    
    private String nombre;
    private int vida, capacidad1, capacidad2, capacidad3, cantidad1, cantidad2, cantidad3, nivel;
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setCapacidad1(int capacidad) {
        this.capacidad1 = capacidad;
    }

    @Override
    public void setCapacidad2(int capacidad) {
        this.capacidad2 = capacidad;
    }

    @Override
    public void setCapacidad3(int capacidad) {
        this.capacidad3 = capacidad;
    }

    @Override
    public void setCantidad1(int cantidad) {
        this.cantidad1 = cantidad;
    }

    @Override
    public void setCantidad2(int cantidad) {
        this.cantidad2 = cantidad;
    }

    @Override
    public void setCantidad3(int cantidad) {
        this.cantidad3 = cantidad;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getCapacidad1() {
        return this.capacidad1;
    }

    @Override
    public int getCapacidad2() {
        return this.capacidad2;
    }

    @Override
    public int getCapacidad3() {
        return this.capacidad3;
    }

    @Override
    public int getCantidad1() {
        return this.cantidad1;
    }

    @Override
    public int getCantidad2() {
        return this.cantidad2;
    }

    @Override
    public int getCantidad3() {
        return this.cantidad3;
    }

    @Override
    public int getNivel() {
        return this.nivel;
    }
    
}
