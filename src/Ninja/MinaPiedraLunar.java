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
    
    private static Recolector MinaPiedraLunar = new Recolector();
    
    @Override
    public void crearEdificacion() {
        MinaPiedraLunar.setNombre("Mina de Piedra Lunar");
        MinaPiedraLunar.setVida(1000);
        MinaPiedraLunar.setCapacidad(3000);
        MinaPiedraLunar.setCantidad(0);
        MinaPiedraLunar.setCantxTurno(1000);
        MinaPiedraLunar.setCantTurn(1);
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

    @Override
    public int getPrecio1() {
        return 1250;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 4000;
    }
    
}
