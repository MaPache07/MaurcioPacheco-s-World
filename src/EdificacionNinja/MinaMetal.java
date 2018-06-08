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
public class MinaMetal implements Ninja{
    
    private Edificacion MinaMetal;
    private static MinaMetal RecolectorR3;
    
    @Override
    public void crearEdificacion() {
        MinaMetal.setNombre("Mina de metal");
        MinaMetal.setVida(110);
        MinaMetal.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.MinaMetal;    
    }
    
}
