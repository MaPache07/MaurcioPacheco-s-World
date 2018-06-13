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
        GeneradorKairoseki.setVida(150);
        GeneradorKairoseki.setCapacidad(0);
        GeneradorKairoseki.setCantidad(0);
        GeneradorKairoseki.setCantxTurno(0);
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
    
}
