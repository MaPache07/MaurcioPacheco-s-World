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
        PuertoPirata.setCantidad1(0);
        PuertoPirata.setCantidad2(0);
        PuertoPirata.setCantidad3(0);
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
        switch (PuertoPirata.getNivel()){
            case 1:
                return 825;
            case 2:
                return 1072;
            case 3:
                return 1610;
        }
        return 0;
    }

    @Override
    public int getPrecio2() {
        switch (PuertoPirata.getNivel()){
            case 1:
                return 1375;
            case 2:
                return 1787;
            case 3:
                return 2685;
        }
        return 0;
    }

    @Override
    public int getPrecio3() {
        switch (PuertoPirata.getNivel()){
            case 1:
                return 2750;
            case 2:
                return 3575;
            case 3:
                return 5365;
        }
        return 0;
    }

    @Override
    public String getNombre() {
        return "Puerto Pirata";
    }
}
