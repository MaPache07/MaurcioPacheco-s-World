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
public class Bijuu implements TropaGeneral{
    
    private static Tropa bijuu = new Tropa();
    
    @Override
    public void crearTropa() {
        bijuu.setNombre("Bijuu");
        bijuu.setVida(575);
        bijuu.setAtaque(275);
    }

    @Override
    public Tropa getTropa() {
        return this.bijuu;
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
