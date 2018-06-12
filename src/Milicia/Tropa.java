/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author MaPache
 */
public class Tropa implements TropaPlan{
    
    private String nombre;
    private int vida, ataque, cant, precio;
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void setCantxTurno(int cant) {
        this.cant = cant;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
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
    public int getAtaque() {
        return this.ataque;
    }

    @Override
    public int getCantxTurno() {
        return this.cant;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }
}
