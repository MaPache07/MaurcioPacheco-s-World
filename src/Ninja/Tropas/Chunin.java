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
public class Chunin implements TropaGeneral{
    
    private static Tropa Chunin = new Tropa();
    
    @Override
    public void crearTropa() {
        Chunin.setNombre("Chunin");
        Chunin.setVida(500);
        Chunin.setAtaque(200);
    }

    @Override
    public Tropa getTropa() {
        return this.Chunin;
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
