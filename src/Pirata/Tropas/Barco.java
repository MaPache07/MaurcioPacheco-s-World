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
        barco.setCantTurno(4);
        barco.setLlegada(1);
        barco.setPrecio1(750);
        barco.setPrecio2(1000);
        barco.setPrecio3(1250);
    }

    @Override
    public Tropa getTropa() {
        return this.barco;
    }
}
