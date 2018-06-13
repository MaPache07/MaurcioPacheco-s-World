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
public class SalaMagos implements Mago{
    
    private static Cuartel SalaMagos = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        SalaMagos.setNombre("Sala de Magos");
        SalaMagos.setVida(90);
        SalaMagos.setCapacidad(10);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.SalaMagos;
    }

    @Override
    public CentroMando getCentroMando() {
        return null;
    }
    
}
