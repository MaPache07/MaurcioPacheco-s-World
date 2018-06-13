/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class MinaMetal implements Ninja{
    
    private static Recolector MinaMetal = new Recolector();
    
    @Override
    public void crearEdificacion() {
        MinaMetal.setNombre("Mina de metal");
        MinaMetal.setVida(1000);
        MinaMetal.setCapacidad(7500);
        MinaMetal.setCantidad(0);
        MinaMetal.setCantxTurno(2500);
    }

    @Override
    public Recolector getRecolector() {
        return this.MinaMetal;
    }

    @Override
    public Cuartel getCuartel() {
        return null;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }

    @Override
    public int getPrecio1() {
        return 1000;
    }

    @Override
    public int getPrecio2() {
        return 2000;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }
    
}
