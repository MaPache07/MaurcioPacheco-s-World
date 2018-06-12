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
public class CuevaBijus implements Ninja{
    
    private Cuartel CuevaBijus;
    
    @Override
    public void crearEdificacion() {
        CuevaBijus.setNombre("Cueva de Bijus");
        CuevaBijus.setVida(130);
        CuevaBijus.setCapacidad(10);
        CuevaBijus.setCantidad(0);
        CuevaBijus.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.CuevaBijus;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
