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
public class LagoSapos implements Ninja{
    
    private static Cuartel LagoSapos = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        LagoSapos.setNombre("Lago de Sapos");
        LagoSapos.setVida(120);
        LagoSapos.setCapacidad(10);
        LagoSapos.setCantidad(0);
        LagoSapos.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.LagoSapos;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
