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
public class RecolectorElixir implements Mago{
    
    private Recolector RecolectorElixir;
    
    @Override
    public void crearEdificacion() {
        RecolectorElixir.setNombre("Recolector de Elixir");
        RecolectorElixir.setVida(80);
        RecolectorElixir.setCapacidad(0);
        RecolectorElixir.setCantidad(0);
        RecolectorElixir.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return this.RecolectorElixir;
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
