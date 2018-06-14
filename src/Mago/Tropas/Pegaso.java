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
        pegaso.setCantTurno(2);
        pegaso.setLlegada(1);
        pegaso.setPrecio1(500);
        pegaso.setPrecio2(1000);
        pegaso.setPrecio3(0);
    }

    @Override
    public Tropa getTropa() {
        return this.pegaso;
    }
}
