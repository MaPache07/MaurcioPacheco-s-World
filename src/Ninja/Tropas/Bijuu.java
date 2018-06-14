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
        bijuu.setCantTurno(2);
        bijuu.setLlegada(1);
        bijuu.setPrecio1(750);
        bijuu.setPrecio2(1000);
        bijuu.setPrecio3(1250);
    }

    @Override
    public Tropa getTropa() {
        return this.bijuu;
    }
}
