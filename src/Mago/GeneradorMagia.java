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
public class GeneradorMagia implements Mago{
    
    private static Recolector GeneradorMagia = new Recolector();
    
    @Override
    public void crearEdificacion() {
        GeneradorMagia.setNombre("Generador de Magia");
        GeneradorMagia.setVida(80);
        GeneradorMagia.setCapacidad(0);
        GeneradorMagia.setCantidad(0);
        GeneradorMagia.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return this.GeneradorMagia;
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
