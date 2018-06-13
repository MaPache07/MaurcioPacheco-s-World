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
public class MinaEbano implements Pirata{
    
    private static Recolector MinaEbano = new Recolector();
    
    @Override
    public void crearEdificacion() {
        MinaEbano.setNombre("Mina de Ebano");
        MinaEbano.setVida(1200);
        MinaEbano.setCapacidad(7500);
        MinaEbano.setCantidad(0);
        MinaEbano.setCantxTurno(2500);
        MinaEbano.setCantTurn(3);
    }

    @Override
    public Recolector getRecolector() {
        return this.MinaEbano;
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
