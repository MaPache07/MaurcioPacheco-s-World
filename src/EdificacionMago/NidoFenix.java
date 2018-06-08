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
public class NidoFenix implements Mago{
    
    private Edificacion NidoFenix;
    private static NidoFenix BaseV1;
    
    @Override
    public void crearEdificacion() {
        NidoFenix.setNombre("Nido de Fenix");
        NidoFenix.setVida(85);
        NidoFenix.setCapacidad(10);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.NidoFenix;
    }
    
}
