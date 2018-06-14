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
public class Comedor implements Pirata{
    
    private static Cuartel Comedor = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        Comedor.setNombre("Comedor");
        Comedor.setVida(1250);
        Comedor.setCapacidad(10);
        Comedor.setCantidad(0);
        Comedor.setCantxTurno(3);
        Comedor.setCantTurn(3);
        Comedor.setCodigo(1);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.Comedor;
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
        return "Comedor";
    }
    
}
