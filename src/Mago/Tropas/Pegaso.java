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
public class Pegaso implements TropaGeneral{
    
    private static Tropa pegaso = new Tropa();
    
    @Override
    public void crearTropa() {
        pegaso.setNombre("Pegaso");
        pegaso.setVida(475);
        pegaso.setAtaque(450);
    }

    @Override
    public Tropa getTropa() {
        return this.pegaso;
    }

    @Override
    public int getPrecio1() {
        return 500;
    }

    @Override
    public int getPrecio2() {
        return 1000;
    }

    @Override
    public int getPrecio3() {
        return 0;
    }
}
