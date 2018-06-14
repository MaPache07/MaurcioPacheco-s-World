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
public class Chunin implements TropaGeneral{
    
    private static Tropa Chunin = new Tropa();
    
    @Override
    public void crearTropa() {
        Chunin.setNombre("Chunin");
        Chunin.setVida(500);
        Chunin.setAtaque(200);
        Chunin.setCantTurno(1);
        Chunin.setLlegada(2);
        Chunin.setPrecio1(0);
        Chunin.setPrecio2(750);
        Chunin.setPrecio3(1000);
    }

    @Override
    public Tropa getTropa() {
        return this.Chunin;
    }
}
