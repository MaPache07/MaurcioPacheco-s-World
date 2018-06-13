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
    
    private static Recolector GeneradorChakra = new Recolector();
    
    @Override
    public void crearEdificacion() {
        GeneradorChakra.setNombre("Generador de Chakra");
        GeneradorChakra.setVida(1000);
        GeneradorChakra.setCapacidad(1500);
        GeneradorChakra.setCantidad(0);
        GeneradorChakra.setCantxTurno(500);
        GeneradorChakra.setCantTurn(1);
    }

    @Override
    public Recolector getRecolector() {
        return this.GeneradorChakra;
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
