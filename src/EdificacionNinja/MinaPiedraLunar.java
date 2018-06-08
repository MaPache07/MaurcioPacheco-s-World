/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionNinja;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class MinaPiedraLunar implements Ninja{
    
    private Edificacion MinaPiedraLunar;
    private static MinaPiedraLunar RecolectorR2;
    
    @Override
    public void crearEdificacion() {
        MinaPiedraLunar.setNombre("Mina de Piedra Lunar");
        MinaPiedraLunar.setVida(100);
        MinaPiedraLunar.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.MinaPiedraLunar;
    }
    
}
