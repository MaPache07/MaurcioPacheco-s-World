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
public class Comedor implements Pirata{
    
    private static Cuartel Comedor = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        Comedor.setNombre("Comedor");
        Comedor.setVida(145);
        Comedor.setCapacidad(10);
        Comedor.setCantidad(0);
        Comedor.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.Comedor;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
