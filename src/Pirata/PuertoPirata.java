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
public class PuertoPirata implements Pirata{

    private static CentroMando PuertoPirata = new CentroMando();
    
    @Override
    public void crearEdificacion() {
        PuertoPirata.setNombre("Puerto Pirata");
        PuertoPirata.setVida(1500);
        PuertoPirata.setCapacidad1(3000);
        PuertoPirata.setCapacidad2(5000);
        PuertoPirata.setCapacidad3(10000);
        PuertoPirata.setCantidad1(3000);
        PuertoPirata.setCantidad2(5000);
        PuertoPirata.setCantidad3(10000);
        PuertoPirata.setNivel(1);
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
        return this.PuertoPirata;
    }

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Puerto Pirata";
    }
}
