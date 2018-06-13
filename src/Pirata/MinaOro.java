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
        MinaOro.setVida(1200);
        MinaOro.setCapacidad(0);
        MinaOro.setCantidad(0);
        MinaOro.setCantxTurno(0);
        MinaOro.setCantTurn(3);
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

    @Override
    public int getPrecio1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrecio2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrecio3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
