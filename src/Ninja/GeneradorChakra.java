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
public class GeneradorChakra implements Ninja{
    
    private Recolector RecolectorChakra;
    
    @Override
    public void crearEdificacion() {
        RecolectorChakra.setNombre("Generador de Chakra");
        RecolectorChakra.setVida(100);
        RecolectorChakra.setCapacidad(0);
        RecolectorChakra.setCantidad(0);
        RecolectorChakra.setCantxTurno(0);
    }

    @Override
    public Recolector getRecolector() {
        return this.RecolectorChakra;
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
