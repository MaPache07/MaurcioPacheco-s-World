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
public class MinaOro implements Pirata{
    
    private static Recolector MinaOro = new Recolector();
    
    @Override
    public void crearEdificacion() {
        MinaOro.setNombre("Mina de Oro");
        MinaOro.setVida(140);
        MinaOro.setCapacidad(0);
        MinaOro.setCantidad(0);
        MinaOro.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return this.MinaOro;
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
