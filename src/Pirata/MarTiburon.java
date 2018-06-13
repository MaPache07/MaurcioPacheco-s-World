/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pirata;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class MarTiburon implements Pirata{
    
    private static Cuartel MarTiburon = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        MarTiburon.setNombre("Mar de Tiburones");
        MarTiburon.setVida(1300);
        MarTiburon.setCapacidad(10);
        MarTiburon.setCantidad(0);
        MarTiburon.setCantxTurno(3);
        MarTiburon.setCantTurn(3);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.MarTiburon;
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
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 4500;
    }
    
}
