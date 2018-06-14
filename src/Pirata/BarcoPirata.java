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
public class BarcoPirata implements Pirata{
    
    private static Cuartel BarcoPirata = new Cuartel();
    
    @Override
    public void crearEdificacion() {
        BarcoPirata.setNombre("Barco Pirata");
        BarcoPirata.setVida(1300);
        BarcoPirata.setCapacidad(10);
        BarcoPirata.setCantidad(0);
        BarcoPirata.setCantxTurno(4);
        BarcoPirata.setCantTurn(4);
        BarcoPirata.setCodigo(3);
    }

    @Override
    public Recolector getRecolector() {
        return null;
    }

    @Override
    public Cuartel getCuartel() {
        return this.BarcoPirata;
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
        return "Barco Pirata";
    }
    
}
