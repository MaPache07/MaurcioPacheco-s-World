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
        NidoFenix.setVida(900);
        NidoFenix.setCapacidad(10);
        NidoFenix.setCantidad(0);
        NidoFenix.setCantxTurno(3);
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
