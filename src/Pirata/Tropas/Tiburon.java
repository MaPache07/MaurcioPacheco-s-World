/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pirata.Tropas;

import Milicia.*;

/**
 *
 * @author MaPache
 */
public class Tiburon implements TropaGeneral{
    
    private static Tropa tiburon =  new Tropa();
    
    @Override
    public void crearTropa() {
        tiburon.setNombre("Tiburon");
        tiburon.setVida(675);
        tiburon.setAtaque(350);
    }

    @Override
    public Tropa getTropa() {
        return this.tiburon;
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
