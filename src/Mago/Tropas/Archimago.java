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
public class Archimago implements TropaGeneral{
    
    private static Tropa archimago = new Tropa();
    
    @Override
    public void crearTropa() {
        archimago.setNombre("Archimago");
        archimago.setVida(450);
        archimago.setAtaque(425);
        archimago.setCantTurno(2);
        archimago.setLlegada(2);
        archimago.setPrecio1(500);
        archimago.setPrecio2(0);
        archimago.setPrecio3(1500);
        
    }

    @Override
    public Tropa getTropa() {
        return this.archimago;
    }
}
