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
public class RecolectorElixir implements Mago{
    
    private static Recolector RecolectorElixir = new Recolector();
    
    @Override
    public void crearEdificacion() {
        RecolectorElixir.setNombre("Recolector de Elixir");
        RecolectorElixir.setVida(800);
        RecolectorElixir.setCapacidad(7500);
        RecolectorElixir.setCantidad(0);
        RecolectorElixir.setCantxTurno(2500);
        RecolectorElixir.setCantTurn(2);
    }

    @Override
    public Recolector getRecolector() {
        return this.RecolectorElixir;
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
        return 1000;
    }

    @Override
    public int getPrecio2() {
        return 2000;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Recolector de elixir";
    }
    
}
