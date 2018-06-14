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
        Hokage.setCantTurno(1);
        Hokage.setLlegada(2);
        Hokage.setPrecio1(500);
        Hokage.setPrecio2(0);
        Hokage.setPrecio3(1500);
    }

    @Override
    public Tropa getTropa() {
        return this.Hokage;
    }
}
