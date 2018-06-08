/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionPirata;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class MinaEbano implements Pirata{
    
    private Edificacion MinaEbano;
    private MinaEbano RecolectorR3;
    
    @Override
    public void crearEdificacion() {
        MinaEbano.setNombre("Mina de Ebano");
        MinaEbano.setVida(140);
        MinaEbano.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.MinaEbano;
    }
    
}
