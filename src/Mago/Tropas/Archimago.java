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
    }

    @Override
    public Tropa getTropa() {
        return this.archimago;
    }

    @Override
    public int getPrecio1() {
        return 500;
    }

    @Override
    public int getPrecio2() {
        return 0;
    }

    @Override
    public int getPrecio3() {
        return 1500;
    }
}
