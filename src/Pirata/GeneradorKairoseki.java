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
public class GeneradorKairoseki implements Pirata{
    
    private static Recolector GeneradorKairoseki = new Recolector();
    
    @Override
    public void crearEdificacion() {
        GeneradorKairoseki.setNombre("Generador de Kairoseki");
        GeneradorKairoseki.setVida(1200);
        GeneradorKairoseki.setCapacidad(1500);
        GeneradorKairoseki.setCantidad(0);
        GeneradorKairoseki.setCantxTurno(500);
        GeneradorKairoseki.setCantTurn(3);
    }

    @Override
    public Recolector getRecolector() {
        return this.GeneradorKairoseki;
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
