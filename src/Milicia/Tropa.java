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
    private int vida, ataque, cant, llegada, precio1, precio2, precio3;
    
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
    public void setCantTurno(int cant) {
        this.cant = cant;
    }
    
    @Override
    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }
    
    @Override
    public void setPrecio1(int precio) {
        this.precio1 = precio;
    }

    @Override
    public void setPrecio2(int precio) {
        this.precio2 = precio;
    }

    @Override
    public void setPrecio3(int precio) {
        this.precio3 = precio;
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
    public int getCantTurno() {
        return this.cant;
    }
    
    @Override
    public int getLlegada() {
        return this.llegada;
    }
    
    @Override
    public int getPrecio1() {
        return this.precio1;
    }

    @Override
    public int getPrecio2() {
        return this.precio2;
    }

    @Override
    public int getPrecio3() {
        return this.precio3;
    }
}
