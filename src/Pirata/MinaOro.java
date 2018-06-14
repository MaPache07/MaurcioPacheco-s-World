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
public class MinaOro implements Pirata{
    
    private static Recolector MinaOro = new Recolector();
    
    @Override
    public void crearEdificacion() {
        MinaOro.setNombre("Mina de Oro");
        MinaOro.setVida(1200);
        MinaOro.setCapacidad(3000);
        MinaOro.setCantidad(0);
        MinaOro.setCantxTurno(0);
        MinaOro.setCantTurn(3);
    }

    @Override
    public Recolector getRecolector() {
        return this.MinaOro;
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
        return 1250;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 4000;
    }

    @Override
    public String getNombre() {
        return "Mina de oro";
    }
    
}
