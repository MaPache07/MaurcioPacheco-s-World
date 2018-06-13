/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;
import Milicia.*;
import Ninja.Tropas.*;

/**
 *
 * @author MaPache
 */
public class Cuartel implements CuartelPlan{
    SwitchNinja Sn = new SwitchNinja();
    SwitchPirata Sp = new SwitchPirata();
    SwitchMago Sm = new SwitchMago();
    
    private String nombre;
    private int vida, capacidad, cantidad, cant, turn, precio1, precio2, precio3;
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void setCantxTurno(int cant) {
        this.cant = cant;
    }
    
    @Override
    public void setCantTurn(int turn) {
        this.turn = turn;
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
    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public int getCantxTurno() {
        return this.cant;
    }
    
    @Override
    public int getCantTurn() {
        return this.turn;
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
    
    //Estos Switch retornan la tropa deseada, hay que ver como se aprovecha eso
    
    @Override
    public void CrearTropaNinja(String nombre) {
        Sn.SwitchNinja(nombre);
    }

    @Override
    public void CrearTropaMago(String nombre) {
        Sm.SwitchMago(nombre);
    }

    @Override
    public void CrearTropaPirata(String nombre) {
        Sp.SwitchPirata(nombre);
    }
}
