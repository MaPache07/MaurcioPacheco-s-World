/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mago.Tropas;

import Milicia.*;

/**
 *
 * @author MaPache
 */
public class Fenix implements TropaGeneral{
    
    private static Tropa fenix = new Tropa();
    
    @Override
    public void crearTropa() {
        fenix.setNombre("Fenix");
        fenix.setVida(475);
        fenix.setAtaque(475);
    }

    @Override
    public Tropa getTropa() {
        return this.fenix;
    }

    @Override
    public int getPrecio1() {
        return 750;
    }

    @Override
    public int getPrecio2() {
        return 1000;
    }

    @Override
    public int getPrecio3() {
        return 1250;
    }
}
