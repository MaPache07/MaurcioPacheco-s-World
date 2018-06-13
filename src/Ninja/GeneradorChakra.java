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
    
    private static Recolector RecolectorChakra = new Recolector();
    
    @Override
    public void crearEdificacion() {
        RecolectorChakra.setNombre("Generador de Chakra");
        RecolectorChakra.setVida(1000);
        RecolectorChakra.setCapacidad(1500);
        RecolectorChakra.setCantidad(0);
        RecolectorChakra.setCantxTurno(500);
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

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 2500;
    }

    @Override
    public int getPrecio3() {
        return 5000;
    }
    
}
