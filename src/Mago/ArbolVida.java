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
public class ArbolVida implements Mago{
    
    private static CentroMando ArbolVida = new CentroMando();
    
    @Override
    public void crearEdificacion() {
        ArbolVida.setNombre("Arbol de vida");
        ArbolVida.setVida(0);
        ArbolVida.setCapacidad1(3000);
        ArbolVida.setCapacidad2(5000);
        ArbolVida.setCapacidad3(10000);
        ArbolVida.setCantidad1(0);
        ArbolVida.setCantidad2(0);
        ArbolVida.setCantidad3(0);
        ArbolVida.setNivel(1);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return null;
    }

    @Override
    public CentroMando getCentroMando() {
        return this.ArbolVida;
    }
    
}
