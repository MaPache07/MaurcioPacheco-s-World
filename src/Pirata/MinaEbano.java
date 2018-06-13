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
    
    public static Recolector Chopper(){
        return MinaEbano;
    }
    
    @Override
    public void crearEdificacion() {
        MinaEbano.setNombre("Mina de Ebano");
        MinaEbano.setVida(140);
        MinaEbano.setCapacidad(0);
        MinaEbano.setCantidad(0);
        MinaEbano.setCantxTurno(0);
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
    
}
