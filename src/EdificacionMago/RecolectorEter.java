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
public class RecolectorEter implements Mago{
    
    private Edificacion RecolectorEter;
    private static RecolectorEter RecolectorR2;
    
    @Override
    public void crearEdificacion() {
        RecolectorEter.setNombre("Recolector de Eter");
        RecolectorEter.setVida(80);
        RecolectorEter.setCapacidad(0);
    }

    @Override
    public Edificacion getEdificacion() {
        return this.RecolectorEter;
    }
    
}
