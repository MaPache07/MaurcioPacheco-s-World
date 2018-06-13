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
        MinaMetal.setVida(110);
        MinaMetal.setCapacidad(0);
        MinaMetal.setCantidad(0);
        MinaMetal.setCantxTurno(0);
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
    
}
