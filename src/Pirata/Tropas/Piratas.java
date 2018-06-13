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
public class Piratas implements TropaGeneral{
    
    private static Tropa piratas = new Tropa();
    
    @Override
    public void crearTropa() {
        piratas.setNombre("Piratas");
        piratas.setVida(600);
        piratas.setAtaque(300);
    }

    @Override
    public Tropa getTropa() {
        return this.piratas;
    }

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 750;
    }

    @Override
    public int getPrecio3() {
        return 1000;
    }   
}
