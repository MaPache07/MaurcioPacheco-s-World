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
        AldeaNinja.setCantidad1(3000);
        AldeaNinja.setCantidad2(5000);
        AldeaNinja.setCantidad3(10000);
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
        return "Aldea ninja";
    }
}
