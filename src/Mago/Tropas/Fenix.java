/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mago.Tropas;

import Milicia.*;

/**
 *
 * @author MaPache
 */
public class Fenix implements TropaGeneral{
    
    private static Tropa fenix = new Tropa();
    
    @Override
    public void crearTropa() {
        fenix.setNombre("Fenix");
        fenix.setVida(475);
        fenix.setAtaque(475);
        fenix.setCantTurno(3);
        fenix.setLlegada(1);
        fenix.setPrecio1(750);
        fenix.setPrecio2(1000);
        fenix.setPrecio3(1250);
    }

    @Override
    public Tropa getTropa() {
        return this.fenix;
    }
}
