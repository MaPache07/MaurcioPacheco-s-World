/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class CuartelNinja implements Ninja{
    
    private Cuartel CuartelNinja;
    
    @Override
    public void crearEdificacion() {
        CuartelNinja.setNombre("Cuartel ninja");
        CuartelNinja.setVida(120);
        CuartelNinja.setCapacidad(10);
        CuartelNinja.setCantidad(0);
    }
    
    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.CuartelNinja;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
