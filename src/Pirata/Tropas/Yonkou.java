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
        yonkou.setCantTurno(3);
        yonkou.setLlegada(2);
        yonkou.setPrecio1(500);
        yonkou.setPrecio2(0);
        yonkou.setPrecio3(1500);
    }

    @Override
    public Tropa getTropa() {
        return this.yonkou;
    }
}
