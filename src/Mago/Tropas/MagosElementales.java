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
public class MagosElementales implements TropaGeneral{
    
    private static Tropa magos = new Tropa();
    
    @Override
    public void crearTropa() {
        magos.setNombre("Magos Elementales");
        magos.setVida(400);
        magos.setAtaque(400);
        magos.setCantTurno(2);
        magos.setLlegada(2);
        magos.setPrecio1(0);
        magos.setPrecio2(750);
        magos.setPrecio3(1000);
    }

    @Override
    public Tropa getTropa() {
        return this.magos;
    }
}
