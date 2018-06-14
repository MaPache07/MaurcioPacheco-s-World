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
public class Tiburon implements TropaGeneral{
    
    private static Tropa tiburon =  new Tropa();
    
    @Override
    public void crearTropa() {
        tiburon.setNombre("Tiburon");
        tiburon.setVida(675);
        tiburon.setAtaque(350);
        tiburon.setCantTurno(3);
        tiburon.setLlegada(1);
        tiburon.setPrecio1(500);
        tiburon.setPrecio2(1000);
        tiburon.setPrecio3(0);
    }

    @Override
    public Tropa getTropa() {
        return this.tiburon;
    }
}
