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
public class Bijuu implements TropaGeneral{
    
    private Tropa bijuu;
    
    @Override
    public void crearTropa() {
        bijuu.setAtaque(10);
        
    }

    @Override
    public Tropa getTropa() {
        return this.bijuu;
    }
}
