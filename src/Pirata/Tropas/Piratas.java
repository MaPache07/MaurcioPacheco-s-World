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
        piratas.setCantTurno(3);
        piratas.setLlegada(2);
        piratas.setPrecio1(0);
        piratas.setPrecio2(750);
        piratas.setPrecio3(1000);
    }

    @Override
    public Tropa getTropa() {
        return this.piratas;
    }
}
