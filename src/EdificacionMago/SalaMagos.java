/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionMago;

import Razas.*;

/**
 *
 * @author MaPache
 */
public class SalaMagos implements Mago{
    
    private Edificacion SalaMagos;
    private static SalaMagos BaseTropas;
    
    @Override
    public void crearEdificacion() {
        SalaMagos.setNombre("Sala de Magos");
        SalaMagos.setVida(90);
        SalaMagos.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.SalaMagos;
    }
    
}
