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
public class CuevaBijus implements Ninja{
    
    private static Cuartel CuevaBijus = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        CuevaBijus.setNombre("Cueva de Bijus");
        CuevaBijus.setVida(1100);
        CuevaBijus.setCapacidad(10);
        CuevaBijus.setCantidad(0);
        CuevaBijus.setCantxTurno(2);
        CuevaBijus.setCantTurn(2);
        CuevaBijus.setCodigo(3);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.CuevaBijus;
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

    @Override
    public String getNombre() {
        return "Cueva de Bijuus";
    }
    
}
