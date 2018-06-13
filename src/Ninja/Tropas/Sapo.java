/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja.Tropas;

import Milicia.*;

/**
 *
 * @author MaPache
 */
public class Sapo implements TropaGeneral{
    
    private static Tropa Sapo = new Tropa();
    
    @Override
    public void crearTropa() {
        Sapo.setNombre("Sapo Gigante");
        Sapo.setVida(575);
        Sapo.setAtaque(250);
    }

    @Override
    public Tropa getTropa() {
        return this.Sapo;
    }

    @Override
    public int getPrecio1() {
        return 500;
    }

    @Override
    public int getPrecio2() {
        return 1000;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }
}
