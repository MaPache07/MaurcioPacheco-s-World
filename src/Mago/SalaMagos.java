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
        SalaMagos.setVida(850);
        SalaMagos.setCapacidad(10);
        SalaMagos.setCantidad(0);
        SalaMagos.setCantxTurno(2);
        SalaMagos.setCantTurn(2);
        SalaMagos.setCodigo(1);
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

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 3000;
    }

    @Override
    public int getPrecio3() {
        return 5000;
    }

    @Override
    public String getNombre() {
        return "Sala de magos";
    }
    
}
