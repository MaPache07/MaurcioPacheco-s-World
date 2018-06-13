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
public class Hokage implements TropaGeneral{
    
    private static Tropa Hokage = new Tropa();
    
    @Override
    public void crearTropa() {
        Hokage.setNombre("Hokage");
        Hokage.setVida(550);
        Hokage.setAtaque(225);
    }

    @Override
    public Tropa getTropa() {
        return this.Hokage;
    }

    @Override
    public int getPrecio1() {
        return 500;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 1500;
    }
}
