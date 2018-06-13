/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mago;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class RecolectorEter implements Mago{
    
    private static Recolector RecolectorEter = new Recolector();
    
    @Override
    public void crearEdificacion() {
        RecolectorEter.setNombre("Recolector de Eter");
        RecolectorEter.setVida(800);
        RecolectorEter.setCapacidad(3000);
        RecolectorEter.setCantidad(0);
        RecolectorEter.setCantxTurno(1000);
    }

    @Override
    public Recolector getRecolector() {
        return this.RecolectorEter;
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
