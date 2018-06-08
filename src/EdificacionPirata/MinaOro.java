/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionPirata;

import Razas.Edificacion;
import Razas.Pirata;

/**
 *
 * @author MaPache
 */
public class MinaOro implements Pirata{
    
    private Edificacion MinaOro;
    private MinaOro RecolectorR2;
    
    @Override
    public void crearEdificacion() {
        MinaOro.setNombre("Mina de Oro");
        MinaOro.setVida(140);
        MinaOro.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.MinaOro;
    }
    
}
