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
public class CuartelNinja implements Ninja{
    
    private Edificacion CuartelNinja;
    private static CuartelNinja BaseTropas;
    
    @Override
    public void crearEdificacion() {
        CuartelNinja.setNombre("Cuartel ninja");
        CuartelNinja.setVida(120);
        CuartelNinja.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.CuartelNinja;
    }
    
}
