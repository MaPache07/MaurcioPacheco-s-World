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
public class Comedor implements Pirata{
    
    private Edificacion Comedor;
    private Comedor BaseTropas;
    
    @Override
    public void crearEdificacion() {
        Comedor.setNombre("Comedor");
        Comedor.setVida(145);
        Comedor.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.Comedor;
    }
    
}
