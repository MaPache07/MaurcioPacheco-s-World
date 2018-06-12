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
public class PuertoPirata implements Pirata{
    
    private Cuartel PuertoPirata;
    
    @Override
    public void crearEdificacion() {
        PuertoPirata.setNombre("Puerto Pirata");
        PuertoPirata.setVida(160);
        PuertoPirata.setCapacidad(10);
        PuertoPirata.setCantidad(0);
        PuertoPirata.setCantxTurno(0);
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
    
}
