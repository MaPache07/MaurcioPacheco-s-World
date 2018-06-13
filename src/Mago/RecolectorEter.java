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
        RecolectorEter.setVida(80);
        RecolectorEter.setCapacidad(0);
        RecolectorEter.setCantidad(0);
        RecolectorEter.setCantxTurno(0);
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
    
}
