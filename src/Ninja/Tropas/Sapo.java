/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninja.Tropas;

import Milicia.*;

/**
 *
 * @author MaPache
 */
public class Sapo implements TropaGeneral{
    
    private static Tropa Sapo = new Tropa();
    
    @Override
    public void crearTropa() {
        Sapo.setNombre("Sapo Gigante");
        Sapo.setVida(575);
        Sapo.setAtaque(250);
        Sapo.setCantTurno(1);
        Sapo.setLlegada(1);
        Sapo.setPrecio1(500);
        Sapo.setPrecio2(1000);
        Sapo.setPrecio3(0);
    }

    @Override
    public Tropa getTropa() {
        return this.Sapo;
    }
}
