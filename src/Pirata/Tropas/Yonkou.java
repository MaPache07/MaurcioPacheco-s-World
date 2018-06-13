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
public class Yonkou implements TropaGeneral{
    
    private static Tropa yonkou = new Tropa();
    
    @Override
    public void crearTropa() {
        yonkou.setNombre("Yonkou");
        yonkou.setVida(650);
        yonkou.setAtaque(325);
    }

    @Override
    public Tropa getTropa() {
        return this.yonkou;
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
