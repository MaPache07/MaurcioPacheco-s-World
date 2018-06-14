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
        GeneradorMagia.setVida(800);
        GeneradorMagia.setCantidad(0);
        GeneradorMagia.setCantxTurno(500);
        GeneradorMagia.setCantTurn(2);
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

    @Override
    public String getNombre() {
        return "Generador de magia";
    }
    
}
