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
public class BarcoPirata implements Pirata{
    
    private static Cuartel PuertoPirata = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        PuertoPirata.setNombre("Barco Pirata");
        PuertoPirata.setVida(1300);
        PuertoPirata.setCapacidad(10);
        PuertoPirata.setCantidad(0);
        PuertoPirata.setCantxTurno(4);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.PuertoPirata;
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
        return 2500;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }
    
}
