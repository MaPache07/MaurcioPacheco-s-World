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
public class MarTiburon implements Pirata{
    
    private Edificacion MarTiburon;
    private static MarTiburon BaseV2;
    
    @Override
    public void crearEdificacion() {
        MarTiburon.setNombre("Mar de Tiburones");
        MarTiburon.setVida(155);
        MarTiburon.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.MarTiburon;
    }
    
}
