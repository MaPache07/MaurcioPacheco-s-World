/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class AldeaNinja implements Ninja{

    private static CentroMando AldeaNinja = new CentroMando();
    
    @Override
    public void crearEdificacion() {
        AldeaNinja.setNombre("Aldea Ninja");
        AldeaNinja.setVida(1300);
        AldeaNinja.setCapacidad1(3000);
        AldeaNinja.setCapacidad2(5000);
        AldeaNinja.setCapacidad3(10000);
        AldeaNinja.setCantidad1(0);
        AldeaNinja.setCantidad2(0);
        AldeaNinja.setCantidad3(0);
        AldeaNinja.setNivel(1);
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
        return this.AldeaNinja;
    }

    @Override
    public int getPrecio1() {
        switch (AldeaNinja.getNivel()){
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
        switch (AldeaNinja.getNivel()){
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
        switch (AldeaNinja.getNivel()){
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
        return "Aldea ninja";
    }
}
