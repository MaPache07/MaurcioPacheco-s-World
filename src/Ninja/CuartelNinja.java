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
public class CuartelNinja implements Ninja{
    
    private static Cuartel CuartelNinja = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        CuartelNinja.setNombre("Cuartel ninja");
        CuartelNinja.setVida(1050);
        CuartelNinja.setCapacidad(10);
        CuartelNinja.setCantidad(0);
        CuartelNinja.setCantxTurno(1);
        CuartelNinja.setCantTurn(1);
    }
    
    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.CuartelNinja;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 3000;
    }

    @Override
    public int getPrecio3() {
        return 5000;
    }
    
}
