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
public class Barco implements TropaGeneral{
    
    private static Tropa barco =  new Tropa();
    
    @Override
    public void crearTropa() {
        barco.setNombre("Barco");
        barco.setVida(675);
        barco.setAtaque(375);
    }

    @Override
    public Tropa getTropa() {
        return this.barco;
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
