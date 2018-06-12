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
public class MinaPiedraLunar implements Ninja{
    
    private Recolector MinaPiedraLunar;
    
    @Override
    public void crearEdificacion() {
        MinaPiedraLunar.setNombre("Mina de Piedra Lunar");
        MinaPiedraLunar.setVida(100);
        MinaPiedraLunar.setCapacidad(0);
        MinaPiedraLunar.setCantidad(0);
        MinaPiedraLunar.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return this.MinaPiedraLunar;
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
