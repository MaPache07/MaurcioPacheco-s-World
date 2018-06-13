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
    }

    @Override
    public Tropa getTropa() {
        return this.magos;
    }

    @Override
    public int getPrecio1() {
        return 0;
    }

    @Override
    public int getPrecio2() {
        return 750;
    }

    @Override
    public int getPrecio3() {
        return 1000;
    }
}
