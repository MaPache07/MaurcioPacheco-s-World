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
public class EstabloPegaso implements Mago{
    
    private Edificacion EstabloPegaso;
    private static EstabloPegaso BaseV2;
    
    @Override
    public void crearEdificacion() {
        EstabloPegaso.setNombre("Establo de Pegasos");
        EstabloPegaso.setVida(85);
        EstabloPegaso.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.EstabloPegaso;
    }
    
}
