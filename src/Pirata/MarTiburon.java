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
    
    private Cuartel MarTiburon;
    
    @Override
    public void crearEdificacion() {
        MarTiburon.setNombre("Mar de Tiburones");
        MarTiburon.setVida(155);
        MarTiburon.setCapacidad(10);
        MarTiburon.setCantidad(0);
        MarTiburon.setCantxTurno(0);
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
    
}
