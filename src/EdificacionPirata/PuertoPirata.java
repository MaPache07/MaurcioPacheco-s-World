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
public class PuertoPirata implements Pirata{
    
    private Edificacion PuertoPirata;
    private static PuertoPirata BaseV1;
    
    @Override
    public void crearEdificacion() {
        PuertoPirata.setNombre("Puerto Pirata");
        PuertoPirata.setVida(160);
        PuertoPirata.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.PuertoPirata;
    }
    
}
