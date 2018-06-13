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
public class ArbolVida implements Mago{
    
    private static CentroMando ArbolVida = new CentroMando();
    
    @Override
    public void crearEdificacion() {
        ArbolVida.setNombre("Arbol de vida");
        ArbolVida.setVida(1100);
        ArbolVida.setCapacidad1(3000);
        ArbolVida.setCapacidad2(5000);
        ArbolVida.setCapacidad3(10000);
        ArbolVida.setCantidad1(0);
        ArbolVida.setCantidad2(0);
        ArbolVida.setCantidad3(0);
        ArbolVida.setNivel(1);
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
        return this.ArbolVida;
    }

    @Override
    public int getPrecio1() {
        switch (ArbolVida.getNivel()){
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
        switch (ArbolVida.getNivel()){
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
        switch (ArbolVida.getNivel()){
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
        return "Arbol de vida";
    }
}
