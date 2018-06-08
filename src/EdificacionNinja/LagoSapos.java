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
public class LagoSapos implements Ninja{
    
    private Edificacion LagoSapos;
    private static LagoSapos BaseV2;
    
    @Override
    public void crearEdificacion() {
        LagoSapos.setNombre("Lago de Sapos");
        LagoSapos.setVida(120);
        LagoSapos.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.LagoSapos;
    }
    
}
