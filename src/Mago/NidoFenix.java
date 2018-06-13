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
public class NidoFenix implements Mago{
    
    private static Cuartel NidoFenix = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        NidoFenix.setNombre("Nido de Fenix");
        NidoFenix.setVida(85);
        NidoFenix.setCapacidad(10);
        NidoFenix.setCantidad(0);
        NidoFenix.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.NidoFenix;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
